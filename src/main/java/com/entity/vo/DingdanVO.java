package com.entity.vo;

import com.entity.DingdanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 订单信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dingdan")
public class DingdanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "qianding_time")
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

    @TableField(value = "create_time")
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

}
