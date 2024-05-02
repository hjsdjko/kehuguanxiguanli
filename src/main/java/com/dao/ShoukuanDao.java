package com.dao;

import com.entity.ShoukuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoukuanView;

/**
 * 收款信息 Dao 接口
 *
 * @author 
 */
public interface ShoukuanDao extends BaseMapper<ShoukuanEntity> {

   List<ShoukuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
