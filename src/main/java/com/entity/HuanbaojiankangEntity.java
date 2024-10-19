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
 * 环保健康
 *
 * @author 
 * @email
 */
@TableName("huanbaojiankang")
public class HuanbaojiankangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuanbaojiankangEntity() {

	}

	public HuanbaojiankangEntity(T t) {
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
     * 标题
     */
    @TableField(value = "huanbaojiankang_name")

    private String huanbaojiankangName;


    /**
     * 环保健康类型
     */
    @TableField(value = "huanbaojiankang_types")

    private Integer huanbaojiankangTypes;


    /**
     * 封面
     */
    @TableField(value = "huanbaojiankang_photo")

    private String huanbaojiankangPhoto;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 介绍
     */
    @TableField(value = "huanbaojiankang_content")

    private String huanbaojiankangContent;


    /**
     * 添加时间
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
	 * 设置：标题
	 */
    public String getHuanbaojiankangName() {
        return huanbaojiankangName;
    }
    /**
	 * 获取：标题
	 */

    public void setHuanbaojiankangName(String huanbaojiankangName) {
        this.huanbaojiankangName = huanbaojiankangName;
    }
    /**
	 * 设置：环保健康类型
	 */
    public Integer getHuanbaojiankangTypes() {
        return huanbaojiankangTypes;
    }
    /**
	 * 获取：环保健康类型
	 */

    public void setHuanbaojiankangTypes(Integer huanbaojiankangTypes) {
        this.huanbaojiankangTypes = huanbaojiankangTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getHuanbaojiankangPhoto() {
        return huanbaojiankangPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setHuanbaojiankangPhoto(String huanbaojiankangPhoto) {
        this.huanbaojiankangPhoto = huanbaojiankangPhoto;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：介绍
	 */
    public String getHuanbaojiankangContent() {
        return huanbaojiankangContent;
    }
    /**
	 * 获取：介绍
	 */

    public void setHuanbaojiankangContent(String huanbaojiankangContent) {
        this.huanbaojiankangContent = huanbaojiankangContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
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
        return "Huanbaojiankang{" +
            "id=" + id +
            ", huanbaojiankangName=" + huanbaojiankangName +
            ", huanbaojiankangTypes=" + huanbaojiankangTypes +
            ", huanbaojiankangPhoto=" + huanbaojiankangPhoto +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", huanbaojiankangContent=" + huanbaojiankangContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
