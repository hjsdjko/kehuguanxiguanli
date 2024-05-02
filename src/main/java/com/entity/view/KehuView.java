package com.entity.view;

import com.entity.KehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kehu")
public class KehuView extends KehuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 客户级别的值
		*/
		private String jibieValue;
		/**
		* 客户来源的值
		*/
		private String laiyuanValue;
		/**
		* 跟进方式的值
		*/
		private String genjinValue;



	public KehuView() {

	}

	public KehuView(KehuEntity kehuEntity) {
		try {
			BeanUtils.copyProperties(this, kehuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 客户级别的值
			*/
			public String getJibieValue() {
				return jibieValue;
			}
			/**
			* 设置： 客户级别的值
			*/
			public void setJibieValue(String jibieValue) {
				this.jibieValue = jibieValue;
			}
			/**
			* 获取： 客户来源的值
			*/
			public String getLaiyuanValue() {
				return laiyuanValue;
			}
			/**
			* 设置： 客户来源的值
			*/
			public void setLaiyuanValue(String laiyuanValue) {
				this.laiyuanValue = laiyuanValue;
			}
			/**
			* 获取： 跟进方式的值
			*/
			public String getGenjinValue() {
				return genjinValue;
			}
			/**
			* 设置： 跟进方式的值
			*/
			public void setGenjinValue(String genjinValue) {
				this.genjinValue = genjinValue;
			}














}
