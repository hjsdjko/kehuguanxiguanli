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
 * 新闻信息
 *
 * @author 
 * @email
 */
@TableName("xinwen")
public class XinwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinwenEntity() {

	}

	public XinwenEntity(T t) {
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 新闻信息详情
     */
    @TableField(value = "xinwen_content")

    private String xinwenContent;


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
        return "Xinwen{" +
            "id=" + id +
            ", xinwenName=" + xinwenName +
            ", xinwenPhoto=" + xinwenPhoto +
            ", insertTime=" + insertTime +
            ", xinwenContent=" + xinwenContent +
            ", createTime=" + createTime +
        "}";
    }
}
