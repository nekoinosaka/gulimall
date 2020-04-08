package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zhaorui
 * @email sunlightcs@gmail.com
 * @date 2020-04-07 18:32:27
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
