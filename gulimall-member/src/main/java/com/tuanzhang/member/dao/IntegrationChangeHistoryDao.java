package com.tuanzhang.member.dao;

import com.tuanzhang.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 20:51:44
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
