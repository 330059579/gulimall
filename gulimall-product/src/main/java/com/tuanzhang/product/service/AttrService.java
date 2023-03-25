package com.tuanzhang.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuanzhang.common.utils.PageUtils;
import com.tuanzhang.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-19 21:22:58
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

