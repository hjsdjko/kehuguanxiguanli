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
 * 产品信息
 *
 * @author 
 * @email
 */
@TableName("canpin")
public class CanpinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CanpinEntity() {

	}

	public CanpinEntity(T t) {
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
     * 产品名称
     */
    @TableField(value = "dingdan_name")

    private String dingdanName;


    /**
     * 产品价格
     */
    @TableField(value = "canpin_money")

    private Double canpinMoney;


    /**
     * 产品类型
     */
    @TableField(value = "canpin_types")

    private Integer canpinTypes;


    /**
     * 产品介绍
     */
    @TableField(value = "canpin_content")

    private String canpinContent;


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
	 * 设置：产品名称
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 获取：产品名称
	 */

    public void setDingdanName(String dingdanName) {
        this.dingdanName = dingdanName;
    }
    /**
	 * 设置：产品价格
	 */
    public Double getCanpinMoney() {
        return canpinMoney;
    }


    /**
	 * 获取：产品价格
	 */

    public void setCanpinMoney(Double canpinMoney) {
        this.canpinMoney = canpinMoney;
    }
    /**
	 * 设置：产品类型
	 */
    public Integer getCanpinTypes() {
        return canpinTypes;
    }


    /**
	 * 获取：产品类型
	 */

    public void setCanpinTypes(Integer canpinTypes) {
        this.canpinTypes = canpinTypes;
    }
    /**
	 * 设置：产品介绍
	 */
    public String getCanpinContent() {
        return canpinContent;
    }


    /**
	 * 获取：产品介绍
	 */

    public void setCanpinContent(String canpinContent) {
        this.canpinContent = canpinContent;
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
        return "Canpin{" +
            "id=" + id +
            ", dingdanName=" + dingdanName +
            ", canpinMoney=" + canpinMoney +
            ", canpinTypes=" + canpinTypes +
            ", canpinContent=" + canpinContent +
            ", createTime=" + createTime +
        "}";
    }
}
