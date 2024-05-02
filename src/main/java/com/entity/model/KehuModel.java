package com.entity.model;

import com.entity.KehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 客户信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KehuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 客户姓名
     */
    private String yonghuName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 身份证号
     */
    private String kehuIdNumber;


    /**
     * 手机号
     */
    private String kehuPhone;


    /**
     * 邮箱
     */
    private String kehuEmail;


    /**
     * 照片
     */
    private String kehuPhoto;


    /**
     * 客户级别
     */
    private Integer jibieTypes;


    /**
     * 客户来源
     */
    private Integer laiyuanTypes;


    /**
     * 跟进方式
     */
    private Integer genjinTypes;


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
	 * 获取：客户姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：客户姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身份证号
	 */
    public String getKehuIdNumber() {
        return kehuIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setKehuIdNumber(String kehuIdNumber) {
        this.kehuIdNumber = kehuIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getKehuPhone() {
        return kehuPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setKehuPhone(String kehuPhone) {
        this.kehuPhone = kehuPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getKehuEmail() {
        return kehuEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setKehuEmail(String kehuEmail) {
        this.kehuEmail = kehuEmail;
    }
    /**
	 * 获取：照片
	 */
    public String getKehuPhoto() {
        return kehuPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setKehuPhoto(String kehuPhoto) {
        this.kehuPhoto = kehuPhoto;
    }
    /**
	 * 获取：客户级别
	 */
    public Integer getJibieTypes() {
        return jibieTypes;
    }


    /**
	 * 设置：客户级别
	 */
    public void setJibieTypes(Integer jibieTypes) {
        this.jibieTypes = jibieTypes;
    }
    /**
	 * 获取：客户来源
	 */
    public Integer getLaiyuanTypes() {
        return laiyuanTypes;
    }


    /**
	 * 设置：客户来源
	 */
    public void setLaiyuanTypes(Integer laiyuanTypes) {
        this.laiyuanTypes = laiyuanTypes;
    }
    /**
	 * 获取：跟进方式
	 */
    public Integer getGenjinTypes() {
        return genjinTypes;
    }


    /**
	 * 设置：跟进方式
	 */
    public void setGenjinTypes(Integer genjinTypes) {
        this.genjinTypes = genjinTypes;
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
