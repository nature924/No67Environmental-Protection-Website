package com.entity.model;

import com.entity.BinweishengwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 濒危生物
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BinweishengwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 动物
     */
    private String binweishengwuName;


    /**
     * 所在地区
     */
    private Integer addressTypes;


    /**
     * 图片
     */
    private String binweishengwuPhoto;


    /**
     * 现存数量
     */
    private String binweishengwuSize;


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
    private String binweishengwuContent;


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
	 * 获取：动物
	 */
    public String getBinweishengwuName() {
        return binweishengwuName;
    }


    /**
	 * 设置：动物
	 */
    public void setBinweishengwuName(String binweishengwuName) {
        this.binweishengwuName = binweishengwuName;
    }
    /**
	 * 获取：所在地区
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }


    /**
	 * 设置：所在地区
	 */
    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getBinweishengwuPhoto() {
        return binweishengwuPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setBinweishengwuPhoto(String binweishengwuPhoto) {
        this.binweishengwuPhoto = binweishengwuPhoto;
    }
    /**
	 * 获取：现存数量
	 */
    public String getBinweishengwuSize() {
        return binweishengwuSize;
    }


    /**
	 * 设置：现存数量
	 */
    public void setBinweishengwuSize(String binweishengwuSize) {
        this.binweishengwuSize = binweishengwuSize;
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
    public String getBinweishengwuContent() {
        return binweishengwuContent;
    }


    /**
	 * 设置：介绍
	 */
    public void setBinweishengwuContent(String binweishengwuContent) {
        this.binweishengwuContent = binweishengwuContent;
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
