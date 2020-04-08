package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zhaorui
 * @email sunlightcs@gmail.com
 * @date 2020-04-08 02:04:21
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}