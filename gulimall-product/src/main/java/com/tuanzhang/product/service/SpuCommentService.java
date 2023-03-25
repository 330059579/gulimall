package com.tuanzhang.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuanzhang.common.utils.PageUtils;
import com.tuanzhang.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author tuanzhang
 * @email sunlightcs@gmail.com
 * @date 2023-03-19 21:22:58
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

