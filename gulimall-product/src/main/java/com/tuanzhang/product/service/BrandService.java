package com.tuanzhang.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuanzhang.common.utils.PageUtils;
import com.tuanzhang.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-19 21:22:58
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

