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
 * 发票信息
 *
 * @author 
 * @email
 */
@TableName("fapiao")
public class FapiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FapiaoEntity() {

	}

	public FapiaoEntity(T t) {
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
     * 发票原因
     */
    @TableField(value = "dingdan_name")

    private String dingdanName;


    /**
     * 公司名称
     */
    @TableField(value = "gongshi_name")

    private String gongshiName;


    /**
     * 发票人
     */
    @TableField(value = "fapiao_name")

    private String fapiaoName;


    /**
     * 经手人
     */
    @TableField(value = "jingshou_name")

    private String jingshouName;


    /**
     * 发票金额
     */
    @TableField(value = "fapiao_money")

    private Double fapiaoMoney;


    /**
     * 发票类型
     */
    @TableField(value = "fapiao_types")

    private Integer fapiaoTypes;


    /**
     * 发票备注
     */
    @TableField(value = "fapiao_content")

    private String fapiaoContent;


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
	 * 设置：发票原因
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 获取：发票原因
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
	 * 设置：发票人
	 */
    public String getFapiaoName() {
        return fapiaoName;
    }


    /**
	 * 获取：发票人
	 */

    public void setFapiaoName(String fapiaoName) {
        this.fapiaoName = fapiaoName;
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
	 * 设置：发票金额
	 */
    public Double getFapiaoMoney() {
        return fapiaoMoney;
    }


    /**
	 * 获取：发票金额
	 */

    public void setFapiaoMoney(Double fapiaoMoney) {
        this.fapiaoMoney = fapiaoMoney;
    }
    /**
	 * 设置：发票类型
	 */
    public Integer getFapiaoTypes() {
        return fapiaoTypes;
    }


    /**
	 * 获取：发票类型
	 */

    public void setFapiaoTypes(Integer fapiaoTypes) {
        this.fapiaoTypes = fapiaoTypes;
    }
    /**
	 * 设置：发票备注
	 */
    public String getFapiaoContent() {
        return fapiaoContent;
    }


    /**
	 * 获取：发票备注
	 */

    public void setFapiaoContent(String fapiaoContent) {
        this.fapiaoContent = fapiaoContent;
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
        return "Fapiao{" +
            "id=" + id +
            ", dingdanName=" + dingdanName +
            ", gongshiName=" + gongshiName +
            ", fapiaoName=" + fapiaoName +
            ", jingshouName=" + jingshouName +
            ", fapiaoMoney=" + fapiaoMoney +
            ", fapiaoTypes=" + fapiaoTypes +
            ", fapiaoContent=" + fapiaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
