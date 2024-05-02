package com.entity.view;

import com.entity.ShoukuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 收款信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shoukuan")
public class ShoukuanView extends ShoukuanEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 支付方式的值
		*/
		private String zhifuValue;



	public ShoukuanView() {

	}

	public ShoukuanView(ShoukuanEntity shoukuanEntity) {
		try {
			BeanUtils.copyProperties(this, shoukuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 支付方式的值
			*/
			public String getZhifuValue() {
				return zhifuValue;
			}
			/**
			* 设置： 支付方式的值
			*/
			public void setZhifuValue(String zhifuValue) {
				this.zhifuValue = zhifuValue;
			}














}
