package com.tuanzhang.coupon.dao;

import com.tuanzhang.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 20:21:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
