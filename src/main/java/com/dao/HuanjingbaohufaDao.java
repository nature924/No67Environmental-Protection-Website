package com.dao;

import com.entity.HuanjingbaohufaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanjingbaohufaView;

/**
 * 环境保护法 Dao 接口
 *
 * @author 
 */
public interface HuanjingbaohufaDao extends BaseMapper<HuanjingbaohufaEntity> {

   List<HuanjingbaohufaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
