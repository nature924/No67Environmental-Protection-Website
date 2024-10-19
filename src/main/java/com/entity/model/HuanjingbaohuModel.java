package com.entity.model;

import com.entity.HuanjingbaohuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 环境保护
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuanjingbaohuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 名称
     */
    private String huanjingbaohuName;


    /**
     * 地区
     */
    private Integer addressTypes;


    /**
     * 图片
     */
    private String huanjingbaohuPhoto;


    /**
     * 大小
     */
    private String huanjingbaohuSize;


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
    private String huanjingbaohuContent;


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
	 * 获取：名称
	 */
    public String getHuanjingbaohuName() {
        return huanjingbaohuName;
    }


    /**
	 * 设置：名称
	 */
    public void setHuanjingbaohuName(String huanjingbaohuName) {
        this.huanjingbaohuName = huanjingbaohuName;
    }
    /**
	 * 获取：地区
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }


    /**
	 * 设置：地区
	 */
    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getHuanjingbaohuPhoto() {
        return huanjingbaohuPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setHuanjingbaohuPhoto(String huanjingbaohuPhoto) {
        this.huanjingbaohuPhoto = huanjingbaohuPhoto;
    }
    /**
	 * 获取：大小
	 */
    public String getHuanjingbaohuSize() {
        return huanjingbaohuSize;
    }


    /**
	 * 设置：大小
	 */
    public void setHuanjingbaohuSize(String huanjingbaohuSize) {
        this.huanjingbaohuSize = huanjingbaohuSize;
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
    public String getHuanjingbaohuContent() {
        return huanjingbaohuContent;
    }


    /**
	 * 设置：介绍
	 */
    public void setHuanjingbaohuContent(String huanjingbaohuContent) {
        this.huanjingbaohuContent = huanjingbaohuContent;
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
