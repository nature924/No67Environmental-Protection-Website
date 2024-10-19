package com.entity.model;

import com.entity.HuanjingbaohufaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 环境保护法
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuanjingbaohufaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String huanjingbaohufaName;


    /**
     * 保护法类型
     */
    private Integer huanjingbaohufaTypes;


    /**
     * 封面
     */
    private String huanjingbaohufaPhoto;


    /**
     * 详情
     */
    private String huanjingbaohufaContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 获取：标题
	 */
    public String getHuanjingbaohufaName() {
        return huanjingbaohufaName;
    }


    /**
	 * 设置：标题
	 */
    public void setHuanjingbaohufaName(String huanjingbaohufaName) {
        this.huanjingbaohufaName = huanjingbaohufaName;
    }
    /**
	 * 获取：保护法类型
	 */
    public Integer getHuanjingbaohufaTypes() {
        return huanjingbaohufaTypes;
    }


    /**
	 * 设置：保护法类型
	 */
    public void setHuanjingbaohufaTypes(Integer huanjingbaohufaTypes) {
        this.huanjingbaohufaTypes = huanjingbaohufaTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getHuanjingbaohufaPhoto() {
        return huanjingbaohufaPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setHuanjingbaohufaPhoto(String huanjingbaohufaPhoto) {
        this.huanjingbaohufaPhoto = huanjingbaohufaPhoto;
    }
    /**
	 * 获取：详情
	 */
    public String getHuanjingbaohufaContent() {
        return huanjingbaohufaContent;
    }


    /**
	 * 设置：详情
	 */
    public void setHuanjingbaohufaContent(String huanjingbaohufaContent) {
        this.huanjingbaohufaContent = huanjingbaohufaContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
