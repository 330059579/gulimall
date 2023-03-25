package com.tuanzhang.member.dao;

import com.tuanzhang.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 20:51:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
