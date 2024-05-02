package com.entity.view;

import com.entity.DingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dingdan")
public class DingdanView extends DingdanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 kehu
			/**
			* 客户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String kehuIdNumber;
			/**
			* 手机号
			*/
			private String kehuPhone;
			/**
			* 邮箱
			*/
			private String kehuEmail;
			/**
			* 照片
			*/
			private String kehuPhoto;
			/**
			* 客户级别
			*/
			private Integer jibieTypes;
				/**
				* 客户级别的值
				*/
				private String jibieValue;
			/**
			* 客户来源
			*/
			private Integer laiyuanTypes;
				/**
				* 客户来源的值
				*/
				private String laiyuanValue;
			/**
			* 跟进方式
			*/
			private Integer genjinTypes;
				/**
				* 跟进方式的值
				*/
				private String genjinValue;

	public DingdanView() {

	}

	public DingdanView(DingdanEntity dingdanEntity) {
		try {
			BeanUtils.copyProperties(this, dingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















				//级联表的get和set kehu
					/**
					* 获取： 客户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 客户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getKehuIdNumber() {
						return kehuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setKehuIdNumber(String kehuIdNumber) {
						this.kehuIdNumber = kehuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getKehuPhone() {
						return kehuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setKehuPhone(String kehuPhone) {
						this.kehuPhone = kehuPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getKehuEmail() {
						return kehuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setKehuEmail(String kehuEmail) {
						this.kehuEmail = kehuEmail;
					}
					/**
					* 获取： 照片
					*/
					public String getKehuPhoto() {
						return kehuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setKehuPhoto(String kehuPhoto) {
						this.kehuPhoto = kehuPhoto;
					}
					/**
					* 获取： 客户级别
					*/
					public Integer getJibieTypes() {
						return jibieTypes;
					}
					/**
					* 设置： 客户级别
					*/
					public void setJibieTypes(Integer jibieTypes) {
						this.jibieTypes = jibieTypes;
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
					* 获取： 客户来源
					*/
					public Integer getLaiyuanTypes() {
						return laiyuanTypes;
					}
					/**
					* 设置： 客户来源
					*/
					public void setLaiyuanTypes(Integer laiyuanTypes) {
						this.laiyuanTypes = laiyuanTypes;
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
					* 获取： 跟进方式
					*/
					public Integer getGenjinTypes() {
						return genjinTypes;
					}
					/**
					* 设置： 跟进方式
					*/
					public void setGenjinTypes(Integer genjinTypes) {
						this.genjinTypes = genjinTypes;
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
