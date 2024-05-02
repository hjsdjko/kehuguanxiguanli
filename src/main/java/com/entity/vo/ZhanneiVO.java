package com.entity.vo;

import com.entity.ZhanneiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 站内信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhannei")
public class ZhanneiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 站内信息名称
     */

    @TableField(value = "zhannei_name")
    private String zhanneiName;


    /**
     * 站内信息图片
     */

    @TableField(value = "zhannei_photo")
    private String zhanneiPhoto;


    /**
     * 站内信息时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 站内信息详情
     */

    @TableField(value = "zhannei_content")
    private String zhanneiContent;


    /**
     * 创建时间 show1 nameShow
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
	 * 设置：站内信息名称
	 */
    public String getZhanneiName() {
        return zhanneiName;
    }


    /**
	 * 获取：站内信息名称
	 */

    public void setZhanneiName(String zhanneiName) {
        this.zhanneiName = zhanneiName;
    }
    /**
	 * 设置：站内信息图片
	 */
    public String getZhanneiPhoto() {
        return zhanneiPhoto;
    }


    /**
	 * 获取：站内信息图片
	 */

    public void setZhanneiPhoto(String zhanneiPhoto) {
        this.zhanneiPhoto = zhanneiPhoto;
    }
    /**
	 * 设置：站内信息时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：站内信息时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：站内信息详情
	 */
    public String getZhanneiContent() {
        return zhanneiContent;
    }


    /**
	 * 获取：站内信息详情
	 */

    public void setZhanneiContent(String zhanneiContent) {
        this.zhanneiContent = zhanneiContent;
    }
    /**
	 * 设置：创建时间 show1 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
