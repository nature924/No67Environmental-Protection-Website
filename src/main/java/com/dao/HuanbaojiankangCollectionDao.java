package com.dao;

import com.entity.HuanbaojiankangCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanbaojiankangCollectionView;

/**
 * 环保健康收藏 Dao 接口
 *
 * @author 
 */
public interface HuanbaojiankangCollectionDao extends BaseMapper<HuanbaojiankangCollectionEntity> {

   List<HuanbaojiankangCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
