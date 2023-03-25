package com.tuanzhang.ware.dao;

import com.tuanzhang.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 21:08:21
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
