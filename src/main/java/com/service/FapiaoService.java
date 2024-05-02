package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FapiaoEntity;
import java.util.Map;

/**
 * 发票信息 服务类
 */
public interface FapiaoService extends IService<FapiaoEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}