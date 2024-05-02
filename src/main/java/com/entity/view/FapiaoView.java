package com.entity.view;

import com.entity.FapiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 发票信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fapiao")
public class FapiaoView extends FapiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 发票类型的值
		*/
		private String fapiaoValue;



	public FapiaoView() {

	}

	public FapiaoView(FapiaoEntity fapiaoEntity) {
		try {
			BeanUtils.copyProperties(this, fapiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 发票类型的值
			*/
			public String getFapiaoValue() {
				return fapiaoValue;
			}
			/**
			* 设置： 发票类型的值
			*/
			public void setFapiaoValue(String fapiaoValue) {
				this.fapiaoValue = fapiaoValue;
			}














}
