package com.tuanzhang.order.dao;

import com.tuanzhang.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 21:03:21
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
