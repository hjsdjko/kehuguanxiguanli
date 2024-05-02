package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoukuanEntity;
import java.util.Map;

/**
 * 收款信息 服务类
 */
public interface ShoukuanService extends IService<ShoukuanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}