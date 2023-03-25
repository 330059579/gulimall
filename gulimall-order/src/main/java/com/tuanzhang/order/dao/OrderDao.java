package com.tuanzhang.order.dao;

import com.tuanzhang.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 21:03:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
