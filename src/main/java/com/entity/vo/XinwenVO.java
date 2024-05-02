package com.entity.vo;

import com.entity.XinwenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 新闻信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinwen")
public class XinwenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 新闻信息名称
     */

    @TableField(value = "xinwen_name")
    private String xinwenName;


    /**
     * 新闻信息图片
     */

    @TableField(value = "xinwen_photo")
    private String xinwenPhoto;


    /**
     * 新闻信息时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 新闻信息详情
     */

    @TableField(value = "xinwen_content")
    private String xinwenContent;


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
	 * 设置：新闻信息名称
	 */
    public String getXinwenName() {
        return xinwenName;
    }


    /**
	 * 获取：新闻信息名称
	 */

    public void setXinwenName(String xinwenName) {
        this.xinwenName = xinwenName;
    }
    /**
	 * 设置：新闻信息图片
	 */
    public String getXinwenPhoto() {
        return xinwenPhoto;
    }


    /**
	 * 获取：新闻信息图片
	 */

    public void setXinwenPhoto(String xinwenPhoto) {
        this.xinwenPhoto = xinwenPhoto;
    }
    /**
	 * 设置：新闻信息时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：新闻信息时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：新闻信息详情
	 */
    public String getXinwenContent() {
        return xinwenContent;
    }


    /**
	 * 获取：新闻信息详情
	 */

    public void setXinwenContent(String xinwenContent) {
        this.xinwenContent = xinwenContent;
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
