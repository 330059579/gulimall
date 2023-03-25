package com.tuanzhang.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuanzhang.common.utils.PageUtils;
import com.tuanzhang.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-21 21:08:21
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

