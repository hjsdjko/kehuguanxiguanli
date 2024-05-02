package com.entity.model;

import com.entity.DingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 订单信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DingdanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单编号
     */
    private String dingdanBianhao;


    /**
     * 订单名称
     */
    private String dingdanName;


    /**
     * 签订客户
     */
    private Integer kehuId;


    /**
     * 签订时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qiandingTime;


    /**
     * 金额
     */
    private Double yonghuMoney;


    /**
     * 订单详情
     */
    private String hetongContent;


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
	 * 获取：订单编号
	 */
    public String getDingdanBianhao() {
        return dingdanBianhao;
    }


    /**
	 * 设置：订单编号
	 */
    public void setDingdanBianhao(String dingdanBianhao) {
        this.dingdanBianhao = dingdanBianhao;
    }
    /**
	 * 获取：订单名称
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 设置：订单名称
	 */
    public void setDingdanName(String dingdanName) {
        this.dingdanName = dingdanName;
    }
    /**
	 * 获取：签订客户
	 */
    public Integer getKehuId() {
        return kehuId;
    }


    /**
	 * 设置：签订客户
	 */
    public void setKehuId(Integer kehuId) {
        this.kehuId = kehuId;
    }
    /**
	 * 获取：签订时间
	 */
    public Date getQiandingTime() {
        return qiandingTime;
    }


    /**
	 * 设置：签订时间
	 */
    public void setQiandingTime(Date qiandingTime) {
        this.qiandingTime = qiandingTime;
    }
    /**
	 * 获取：金额
	 */
    public Double getYonghuMoney() {
        return yonghuMoney;
    }


    /**
	 * 设置：金额
	 */
    public void setYonghuMoney(Double yonghuMoney) {
        this.yonghuMoney = yonghuMoney;
    }
    /**
	 * 获取：订单详情
	 */
    public String getHetongContent() {
        return hetongContent;
    }


    /**
	 * 设置：订单详情
	 */
    public void setHetongContent(String hetongContent) {
        this.hetongContent = hetongContent;
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
