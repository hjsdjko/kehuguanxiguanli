package com.dao;

import com.entity.FapiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FapiaoView;

/**
 * 发票信息 Dao 接口
 *
 * @author 
 */
public interface FapiaoDao extends BaseMapper<FapiaoEntity> {

   List<FapiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
