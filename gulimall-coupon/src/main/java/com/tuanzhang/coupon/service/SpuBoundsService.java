package com.tuanzhang.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuanzhang.common.utils.PageUtils;
import com.tuanzhang.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 20:21:59
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

