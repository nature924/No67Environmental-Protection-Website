package com.entity.vo;

import com.entity.HuanjingbaohufaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 环境保护法
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huanjingbaohufa")
public class HuanjingbaohufaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
