package com.entity.vo;

import com.entity.CanpinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 产品信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("canpin")
public class CanpinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
