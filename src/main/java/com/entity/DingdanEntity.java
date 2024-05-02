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
 * 订单信息
 *
 * @author 
 * @email
 */
@TableName("dingdan")
public class DingdanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DingdanEntity() {

	}

	public DingdanEntity(T t) {
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
     * 订单编号
     */
    @TableField(value = "dingdan_bianhao")

    private String dingdanBianhao;


    /**
     * 订单名称
     */
    @TableField(value = "dingdan_name")

    private String dingdanName;


    /**
     * 签订客户
     */
    @TableField(value = "kehu_id")

    private Integer kehuId;


    /**
     * 签订时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "qianding_time",fill = FieldFill.UPDATE)

    private Date qiandingTime;


    /**
     * 金额
     */
    @TableField(value = "yonghu_money")

    private Double yonghuMoney;


    /**
     * 订单详情
     */
    @TableField(value = "hetong_content")

    private String hetongContent;


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
	 * 设置：订单编号
	 */
    public String getDingdanBianhao() {
        return dingdanBianhao;
    }


    /**
	 * 获取：订单编号
	 */

    public void setDingdanBianhao(String dingdanBianhao) {
        this.dingdanBianhao = dingdanBianhao;
    }
    /**
	 * 设置：订单名称
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 获取：订单名称
	 */

    public void setDingdanName(String dingdanName) {
        this.dingdanName = dingdanName;
    }
    /**
	 * 设置：签订客户
	 */
    public Integer getKehuId() {
        return kehuId;
    }


    /**
	 * 获取：签订客户
	 */

    public void setKehuId(Integer kehuId) {
        this.kehuId = kehuId;
    }
    /**
	 * 设置：签订时间
	 */
    public Date getQiandingTime() {
        return qiandingTime;
    }


    /**
	 * 获取：签订时间
	 */

    public void setQiandingTime(Date qiandingTime) {
        this.qiandingTime = qiandingTime;
    }
    /**
	 * 设置：金额
	 */
    public Double getYonghuMoney() {
        return yonghuMoney;
    }


    /**
	 * 获取：金额
	 */

    public void setYonghuMoney(Double yonghuMoney) {
        this.yonghuMoney = yonghuMoney;
    }
    /**
	 * 设置：订单详情
	 */
    public String getHetongContent() {
        return hetongContent;
    }


    /**
	 * 获取：订单详情
	 */

    public void setHetongContent(String hetongContent) {
        this.hetongContent = hetongContent;
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
        return "Dingdan{" +
            "id=" + id +
            ", dingdanBianhao=" + dingdanBianhao +
            ", dingdanName=" + dingdanName +
            ", kehuId=" + kehuId +
            ", qiandingTime=" + qiandingTime +
            ", yonghuMoney=" + yonghuMoney +
            ", hetongContent=" + hetongContent +
            ", createTime=" + createTime +
        "}";
    }
}
