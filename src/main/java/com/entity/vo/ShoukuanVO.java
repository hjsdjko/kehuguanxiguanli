package com.entity.vo;

import com.entity.ShoukuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 收款信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shoukuan")
public class ShoukuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
