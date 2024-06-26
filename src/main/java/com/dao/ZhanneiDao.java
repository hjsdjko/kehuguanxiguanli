package com.dao;

import com.entity.ZhanneiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanneiView;

/**
 * 站内信息 Dao 接口
 *
 * @author 
 */
public interface ZhanneiDao extends BaseMapper<ZhanneiEntity> {

   List<ZhanneiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
