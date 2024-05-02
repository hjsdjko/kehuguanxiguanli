package com.entity.view;

import com.entity.ZhanneiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 站内信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhannei")
public class ZhanneiView extends ZhanneiEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public ZhanneiView() {

	}

	public ZhanneiView(ZhanneiEntity zhanneiEntity) {
		try {
			BeanUtils.copyProperties(this, zhanneiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















}
