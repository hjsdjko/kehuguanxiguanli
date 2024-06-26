package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 客户信息
 *
 * @author 
 * @email
 */
@TableName("kehu")
public class KehuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KehuEntity() {

	}

	public KehuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 客户姓名
     */
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 身份证号
     */
    @TableField(value = "kehu_id_number")

    private String kehuIdNumber;


    /**
     * 手机号
     */
    @TableField(value = "kehu_phone")

    private String kehuPhone;


    /**
     * 邮箱
     */
    @TableField(value = "kehu_email")

    private String kehuEmail;


    /**
     * 照片
     */
    @TableField(value = "kehu_photo")

    private String kehuPhoto;


    /**
     * 客户级别
     */
    @TableField(value = "jibie_types")

    private Integer jibieTypes;


    /**
     * 客户来源
     */
    @TableField(value = "laiyuan_types")

    private Integer laiyuanTypes;


    /**
     * 跟进方式
     */
    @TableField(value = "genjin_types")

    private Integer genjinTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：客户姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 获取：客户姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getKehuIdNumber() {
        return kehuIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setKehuIdNumber(String kehuIdNumber) {
        this.kehuIdNumber = kehuIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getKehuPhone() {
        return kehuPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setKehuPhone(String kehuPhone) {
        this.kehuPhone = kehuPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getKehuEmail() {
        return kehuEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setKehuEmail(String kehuEmail) {
        this.kehuEmail = kehuEmail;
    }
    /**
	 * 设置：照片
	 */
    public String getKehuPhoto() {
        return kehuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setKehuPhoto(String kehuPhoto) {
        this.kehuPhoto = kehuPhoto;
    }
    /**
	 * 设置：客户级别
	 */
    public Integer getJibieTypes() {
        return jibieTypes;
    }


    /**
	 * 获取：客户级别
	 */

    public void setJibieTypes(Integer jibieTypes) {
        this.jibieTypes = jibieTypes;
    }
    /**
	 * 设置：客户来源
	 */
    public Integer getLaiyuanTypes() {
        return laiyuanTypes;
    }


    /**
	 * 获取：客户来源
	 */

    public void setLaiyuanTypes(Integer laiyuanTypes) {
        this.laiyuanTypes = laiyuanTypes;
    }
    /**
	 * 设置：跟进方式
	 */
    public Integer getGenjinTypes() {
        return genjinTypes;
    }


    /**
	 * 获取：跟进方式
	 */

    public void setGenjinTypes(Integer genjinTypes) {
        this.genjinTypes = genjinTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kehu{" +
            "id=" + id +
            ", yonghuName=" + yonghuName +
            ", sexTypes=" + sexTypes +
            ", kehuIdNumber=" + kehuIdNumber +
            ", kehuPhone=" + kehuPhone +
            ", kehuEmail=" + kehuEmail +
            ", kehuPhoto=" + kehuPhoto +
            ", jibieTypes=" + jibieTypes +
            ", laiyuanTypes=" + laiyuanTypes +
            ", genjinTypes=" + genjinTypes +
            ", createTime=" + createTime +
        "}";
    }
}
