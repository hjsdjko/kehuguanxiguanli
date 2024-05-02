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
 * 合同信息
 *
 * @author 
 * @email
 */
@TableName("hetong")
public class HetongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HetongEntity() {

	}

	public HetongEntity(T t) {
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
     * 合同名称
     */
    @TableField(value = "hetong_name")

    private String hetongName;


    /**
     * 签订客户
     */
    @TableField(value = "qian_name")

    private String qianName;


    /**
     * 合同
     */
    @TableField(value = "hetong_file")

    private String hetongFile;


    /**
     * 合同简介
     */
    @TableField(value = "hetong_content")

    private String hetongContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：合同名称
	 */
    public String getHetongName() {
        return hetongName;
    }


    /**
	 * 获取：合同名称
	 */

    public void setHetongName(String hetongName) {
        this.hetongName = hetongName;
    }
    /**
	 * 设置：签订客户
	 */
    public String getQianName() {
        return qianName;
    }


    /**
	 * 获取：签订客户
	 */

    public void setQianName(String qianName) {
        this.qianName = qianName;
    }
    /**
	 * 设置：合同
	 */
    public String getHetongFile() {
        return hetongFile;
    }


    /**
	 * 获取：合同
	 */

    public void setHetongFile(String hetongFile) {
        this.hetongFile = hetongFile;
    }
    /**
	 * 设置：合同简介
	 */
    public String getHetongContent() {
        return hetongContent;
    }


    /**
	 * 获取：合同简介
	 */

    public void setHetongContent(String hetongContent) {
        this.hetongContent = hetongContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Hetong{" +
            "id=" + id +
            ", hetongName=" + hetongName +
            ", qianName=" + qianName +
            ", hetongFile=" + hetongFile +
            ", hetongContent=" + hetongContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
