package com.tuanzhang.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuanzhang.common.utils.PageUtils;
import com.tuanzhang.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 21:03:21
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

