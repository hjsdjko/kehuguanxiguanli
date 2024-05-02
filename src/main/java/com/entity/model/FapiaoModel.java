package com.entity.model;

import com.entity.FapiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 发票信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FapiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 发票原因
     */
    private String dingdanName;


    /**
     * 公司名称
     */
    private String gongshiName;


    /**
     * 发票人
     */
    private String fapiaoName;


    /**
     * 经手人
     */
    private String jingshouName;


    /**
     * 发票金额
     */
    private Double fapiaoMoney;


    /**
     * 发票类型
     */
    private Integer fapiaoTypes;


    /**
     * 发票备注
     */
    private String fapiaoContent;


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
	 * 获取：发票原因
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 设置：发票原因
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
	 * 获取：发票人
	 */
    public String getFapiaoName() {
        return fapiaoName;
    }


    /**
	 * 设置：发票人
	 */
    public void setFapiaoName(String fapiaoName) {
        this.fapiaoName = fapiaoName;
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
	 * 获取：发票金额
	 */
    public Double getFapiaoMoney() {
        return fapiaoMoney;
    }


    /**
	 * 设置：发票金额
	 */
    public void setFapiaoMoney(Double fapiaoMoney) {
        this.fapiaoMoney = fapiaoMoney;
    }
    /**
	 * 获取：发票类型
	 */
    public Integer getFapiaoTypes() {
        return fapiaoTypes;
    }


    /**
	 * 设置：发票类型
	 */
    public void setFapiaoTypes(Integer fapiaoTypes) {
        this.fapiaoTypes = fapiaoTypes;
    }
    /**
	 * 获取：发票备注
	 */
    public String getFapiaoContent() {
        return fapiaoContent;
    }


    /**
	 * 设置：发票备注
	 */
    public void setFapiaoContent(String fapiaoContent) {
        this.fapiaoContent = fapiaoContent;
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
