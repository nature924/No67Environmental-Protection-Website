package com.entity.model;

import com.entity.HuanbaojiankangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 环保健康
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuanbaojiankangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String huanbaojiankangName;


    /**
     * 环保健康类型
     */
    private Integer huanbaojiankangTypes;


    /**
     * 封面
     */
    private String huanbaojiankangPhoto;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 介绍
     */
    private String huanbaojiankangContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
    public String getHuanbaojiankangName() {
        return huanbaojiankangName;
    }


    /**
	 * 设置：标题
	 */
    public void setHuanbaojiankangName(String huanbaojiankangName) {
        this.huanbaojiankangName = huanbaojiankangName;
    }
    /**
	 * 获取：环保健康类型
	 */
    public Integer getHuanbaojiankangTypes() {
        return huanbaojiankangTypes;
    }


    /**
	 * 设置：环保健康类型
	 */
    public void setHuanbaojiankangTypes(Integer huanbaojiankangTypes) {
        this.huanbaojiankangTypes = huanbaojiankangTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getHuanbaojiankangPhoto() {
        return huanbaojiankangPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setHuanbaojiankangPhoto(String huanbaojiankangPhoto) {
        this.huanbaojiankangPhoto = huanbaojiankangPhoto;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：介绍
	 */
    public String getHuanbaojiankangContent() {
        return huanbaojiankangContent;
    }


    /**
	 * 设置：介绍
	 */
    public void setHuanbaojiankangContent(String huanbaojiankangContent) {
        this.huanbaojiankangContent = huanbaojiankangContent;
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
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
