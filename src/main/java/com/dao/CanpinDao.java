package com.dao;

import com.entity.CanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CanpinView;

/**
 * 产品信息 Dao 接口
 *
 * @author 
 */
public interface CanpinDao extends BaseMapper<CanpinEntity> {

   List<CanpinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
