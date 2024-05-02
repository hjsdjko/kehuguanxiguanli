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
 * 站内信息
 *
 * @author 
 * @email
 */
@TableName("zhannei")
public class ZhanneiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhanneiEntity() {

	}

	public ZhanneiEntity(T t) {
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 站内信息详情
     */
    @TableField(value = "zhannei_content")

    private String zhanneiContent;


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
        return "Zhannei{" +
            "id=" + id +
            ", zhanneiName=" + zhanneiName +
            ", zhanneiPhoto=" + zhanneiPhoto +
            ", insertTime=" + insertTime +
            ", zhanneiContent=" + zhanneiContent +
            ", createTime=" + createTime +
        "}";
    }
}
