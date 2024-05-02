package com.entity.model;

import com.entity.ShoukuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 收款信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShoukuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 收款原因
     */
    private String dingdanName;


    /**
     * 公司名称
     */
    private String gongshiName;


    /**
     * 收款人
     */
    private String shoukuanName;


    /**
     * 经手人
     */
    private String jingshouName;


    /**
     * 收款金额
     */
    private Double shoukuanMoney;


    /**
     * 支付方式
     */
    private Integer zhifuTypes;


    /**
     * 收款备注
     */
    private String shoukuanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：收款原因
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 设置：收款原因
	 */
    public void setDingdanName(String dingdanName) {
        this.dingdanName = dingdanName;
    }
    /**
	 * 获取：公司名称
	 */
    public String getGongshiName() {
        return gongshiName;
    }


    /**
	 * 设置：公司名称
	 */
    public void setGongshiName(String gongshiName) {
        this.gongshiName = gongshiName;
    }
    /**
	 * 获取：收款人
	 */
    public String getShoukuanName() {
        return shoukuanName;
    }


    /**
	 * 设置：收款人
	 */
    public void setShoukuanName(String shoukuanName) {
        this.shoukuanName = shoukuanName;
    }
    /**
	 * 获取：经手人
	 */
    public String getJingshouName() {
        return jingshouName;
    }


    /**
	 * 设置：经手人
	 */
    public void setJingshouName(String jingshouName) {
        this.jingshouName = jingshouName;
    }
    /**
	 * 获取：收款金额
	 */
    public Double getShoukuanMoney() {
        return shoukuanMoney;
    }


    /**
	 * 设置：收款金额
	 */
    public void setShoukuanMoney(Double shoukuanMoney) {
        this.shoukuanMoney = shoukuanMoney;
    }
    /**
	 * 获取：支付方式
	 */
    public Integer getZhifuTypes() {
        return zhifuTypes;
    }


    /**
	 * 设置：支付方式
	 */
    public void setZhifuTypes(Integer zhifuTypes) {
        this.zhifuTypes = zhifuTypes;
    }
    /**
	 * 获取：收款备注
	 */
    public String getShoukuanContent() {
        return shoukuanContent;
    }


    /**
	 * 设置：收款备注
	 */
    public void setShoukuanContent(String shoukuanContent) {
        this.shoukuanContent = shoukuanContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
