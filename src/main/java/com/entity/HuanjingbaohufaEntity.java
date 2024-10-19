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
 * 环境保护法
 *
 * @author 
 * @email
 */
@TableName("huanjingbaohufa")
public class HuanjingbaohufaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuanjingbaohufaEntity() {

	}

	public HuanjingbaohufaEntity(T t) {
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
    @TableField(value = "huanjingbaohufa_name")

    private String huanjingbaohufaName;


    /**
     * 保护法类型
     */
    @TableField(value = "huanjingbaohufa_types")

    private Integer huanjingbaohufaTypes;


    /**
     * 封面
     */
    @TableField(value = "huanjingbaohufa_photo")

    private String huanjingbaohufaPhoto;


    /**
     * 详情
     */
    @TableField(value = "huanjingbaohufa_content")

    private String huanjingbaohufaContent;


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
    public String getHuanjingbaohufaName() {
        return huanjingbaohufaName;
    }
    /**
	 * 获取：标题
	 */

    public void setHuanjingbaohufaName(String huanjingbaohufaName) {
        this.huanjingbaohufaName = huanjingbaohufaName;
    }
    /**
	 * 设置：保护法类型
	 */
    public Integer getHuanjingbaohufaTypes() {
        return huanjingbaohufaTypes;
    }
    /**
	 * 获取：保护法类型
	 */

    public void setHuanjingbaohufaTypes(Integer huanjingbaohufaTypes) {
        this.huanjingbaohufaTypes = huanjingbaohufaTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getHuanjingbaohufaPhoto() {
        return huanjingbaohufaPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setHuanjingbaohufaPhoto(String huanjingbaohufaPhoto) {
        this.huanjingbaohufaPhoto = huanjingbaohufaPhoto;
    }
    /**
	 * 设置：详情
	 */
    public String getHuanjingbaohufaContent() {
        return huanjingbaohufaContent;
    }
    /**
	 * 获取：详情
	 */

    public void setHuanjingbaohufaContent(String huanjingbaohufaContent) {
        this.huanjingbaohufaContent = huanjingbaohufaContent;
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
        return "Huanjingbaohufa{" +
            "id=" + id +
            ", huanjingbaohufaName=" + huanjingbaohufaName +
            ", huanjingbaohufaTypes=" + huanjingbaohufaTypes +
            ", huanjingbaohufaPhoto=" + huanjingbaohufaPhoto +
            ", huanjingbaohufaContent=" + huanjingbaohufaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
