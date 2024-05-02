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
 * 收款信息
 *
 * @author 
 * @email
 */
@TableName("shoukuan")
public class ShoukuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShoukuanEntity() {

	}

	public ShoukuanEntity(T t) {
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
     * 收款原因
     */
    @TableField(value = "dingdan_name")

    private String dingdanName;


    /**
     * 公司名称
     */
    @TableField(value = "gongshi_name")

    private String gongshiName;


    /**
     * 收款人
     */
    @TableField(value = "shoukuan_name")

    private String shoukuanName;


    /**
     * 经手人
     */
    @TableField(value = "jingshou_name")

    private String jingshouName;


    /**
     * 收款金额
     */
    @TableField(value = "shoukuan_money")

    private Double shoukuanMoney;


    /**
     * 支付方式
     */
    @TableField(value = "zhifu_types")

    private Integer zhifuTypes;


    /**
     * 收款备注
     */
    @TableField(value = "shoukuan_content")

    private String shoukuanContent;


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
	 * 设置：收款原因
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 获取：收款原因
	 */

    public void setDingdanName(String dingdanName) {
        this.dingdanName = dingdanName;
    }
    /**
	 * 设置：公司名称
	 */
    public String getGongshiName() {
        return gongshiName;
    }


    /**
	 * 获取：公司名称
	 */

    public void setGongshiName(String gongshiName) {
        this.gongshiName = gongshiName;
    }
    /**
	 * 设置：收款人
	 */
    public String getShoukuanName() {
        return shoukuanName;
    }


    /**
	 * 获取：收款人
	 */

    public void setShoukuanName(String shoukuanName) {
        this.shoukuanName = shoukuanName;
    }
    /**
	 * 设置：经手人
	 */
    public String getJingshouName() {
        return jingshouName;
    }


    /**
	 * 获取：经手人
	 */

    public void setJingshouName(String jingshouName) {
        this.jingshouName = jingshouName;
    }
    /**
	 * 设置：收款金额
	 */
    public Double getShoukuanMoney() {
        return shoukuanMoney;
    }


    /**
	 * 获取：收款金额
	 */

    public void setShoukuanMoney(Double shoukuanMoney) {
        this.shoukuanMoney = shoukuanMoney;
    }
    /**
	 * 设置：支付方式
	 */
    public Integer getZhifuTypes() {
        return zhifuTypes;
    }


    /**
	 * 获取：支付方式
	 */

    public void setZhifuTypes(Integer zhifuTypes) {
        this.zhifuTypes = zhifuTypes;
    }
    /**
	 * 设置：收款备注
	 */
    public String getShoukuanContent() {
        return shoukuanContent;
    }


    /**
	 * 获取：收款备注
	 */

    public void setShoukuanContent(String shoukuanContent) {
        this.shoukuanContent = shoukuanContent;
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
        return "Shoukuan{" +
            "id=" + id +
            ", dingdanName=" + dingdanName +
            ", gongshiName=" + gongshiName +
            ", shoukuanName=" + shoukuanName +
            ", jingshouName=" + jingshouName +
            ", shoukuanMoney=" + shoukuanMoney +
            ", zhifuTypes=" + zhifuTypes +
            ", shoukuanContent=" + shoukuanContent +
            ", createTime=" + createTime +
        "}";
    }
}
