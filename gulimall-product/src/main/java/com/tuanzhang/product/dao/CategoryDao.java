package com.tuanzhang.product.dao;

import com.tuanzhang.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-19 21:22:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
