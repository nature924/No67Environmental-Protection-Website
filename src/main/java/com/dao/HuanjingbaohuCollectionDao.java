package com.dao;

import com.entity.HuanjingbaohuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanjingbaohuCollectionView;

/**
 * 环境保护收藏 Dao 接口
 *
 * @author 
 */
public interface HuanjingbaohuCollectionDao extends BaseMapper<HuanjingbaohuCollectionEntity> {

   List<HuanjingbaohuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
