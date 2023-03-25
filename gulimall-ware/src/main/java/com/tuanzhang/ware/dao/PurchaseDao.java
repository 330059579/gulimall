package com.tuanzhang.ware.dao;

import com.tuanzhang.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 21:08:21
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
