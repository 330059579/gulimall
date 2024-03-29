package com.tuanzhang.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tuanzhang.common.utils.PageUtils;
import com.tuanzhang.common.utils.Query;

import com.tuanzhang.product.dao.CategoryDao;
import com.tuanzhang.product.entity.CategoryEntity;
import com.tuanzhang.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> level1Menus = categoryEntities.stream().filter(v ->
            v.getParentCid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildrens(menu, categoryEntities));
            return menu;
        }).sorted((menu1, menu2) -> { return (menu1.getSort() == null ? 0 :menu1.getSort()) - (menu2.getSort() == null ? 0: menu2.getSort()); }).collect(Collectors.toList());
        return categoryEntities;
    }

    @Override
    public void removeCategoryByIds(List<Long> ids) {
        //TODO //检查当前删除菜单，是否被别的地方引用
        baseMapper.deleteBatchIds(ids);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {return (menu1.getSort() == null ? 0 :menu1.getSort()) - (menu2.getSort() == null ? 0: menu2.getSort());}).collect(Collectors.toList());

        return children;
    }

}