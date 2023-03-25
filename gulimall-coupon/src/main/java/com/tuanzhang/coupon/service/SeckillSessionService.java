package com.tuanzhang.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuanzhang.common.utils.PageUtils;
import com.tuanzhang.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 20:21:59
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

