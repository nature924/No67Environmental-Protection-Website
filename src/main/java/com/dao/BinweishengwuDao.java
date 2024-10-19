package com.dao;

import com.entity.BinweishengwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BinweishengwuView;

/**
 * 濒危生物 Dao 接口
 *
 * @author 
 */
public interface BinweishengwuDao extends BaseMapper<BinweishengwuEntity> {

   List<BinweishengwuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
