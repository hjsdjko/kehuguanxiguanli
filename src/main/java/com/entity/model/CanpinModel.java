package com.entity.model;

import com.entity.CanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 产品信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CanpinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 产品名称
     */
    private String dingdanName;


    /**
     * 产品价格
     */
    private Double canpinMoney;


    /**
     * 产品类型
     */
    private Integer canpinTypes;


    /**
     * 产品介绍
     */
    private String canpinContent;


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
	 * 获取：产品名称
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 设置：产品名称
	 */
    public void setDingdanName(String dingdanName) {
        this.dingdanName = dingdanName;
    }
    /**
	 * 获取：产品价格
	 */
    public Double getCanpinMoney() {
        return canpinMoney;
    }


    /**
	 * 设置：产品价格
	 */
    public void setCanpinMoney(Double canpinMoney) {
        this.canpinMoney = canpinMoney;
    }
    /**
	 * 获取：产品类型
	 */
    public Integer getCanpinTypes() {
        return canpinTypes;
    }


    /**
	 * 设置：产品类型
	 */
    public void setCanpinTypes(Integer canpinTypes) {
        this.canpinTypes = canpinTypes;
    }
    /**
	 * 获取：产品介绍
	 */
    public String getCanpinContent() {
        return canpinContent;
    }


    /**
	 * 设置：产品介绍
	 */
    public void setCanpinContent(String canpinContent) {
        this.canpinContent = canpinContent;
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
