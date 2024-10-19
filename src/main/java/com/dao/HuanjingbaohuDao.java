package com.dao;

import com.entity.HuanjingbaohuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanjingbaohuView;

/**
 * 环境保护 Dao 接口
 *
 * @author 
 */
public interface HuanjingbaohuDao extends BaseMapper<HuanjingbaohuEntity> {

   List<HuanjingbaohuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
