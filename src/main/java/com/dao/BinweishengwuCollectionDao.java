package com.dao;

import com.entity.BinweishengwuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BinweishengwuCollectionView;

/**
 * 濒危生物收藏 Dao 接口
 *
 * @author 
 */
public interface BinweishengwuCollectionDao extends BaseMapper<BinweishengwuCollectionEntity> {

   List<BinweishengwuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
