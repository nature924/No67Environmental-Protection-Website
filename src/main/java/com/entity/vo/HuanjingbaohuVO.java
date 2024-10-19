package com.entity.vo;

import com.entity.HuanjingbaohuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 环境保护
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huanjingbaohu")
public class HuanjingbaohuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 名称
     */

    @TableField(value = "huanjingbaohu_name")
    private String huanjingbaohuName;


    /**
     * 地区
     */

    @TableField(value = "address_types")
    private Integer addressTypes;


    /**
     * 图片
     */

    @TableField(value = "huanjingbaohu_photo")
    private String huanjingbaohuPhoto;


    /**
     * 大小
     */

    @TableField(value = "huanjingbaohu_size")
    private String huanjingbaohuSize;


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

    @TableField(value = "huanjingbaohu_content")
    private String huanjingbaohuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：名称
	 */
    public String getHuanjingbaohuName() {
        return huanjingbaohuName;
    }


    /**
	 * 获取：名称
	 */

    public void setHuanjingbaohuName(String huanjingbaohuName) {
        this.huanjingbaohuName = huanjingbaohuName;
    }
    /**
	 * 设置：地区
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }


    /**
	 * 获取：地区
	 */

    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getHuanjingbaohuPhoto() {
        return huanjingbaohuPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setHuanjingbaohuPhoto(String huanjingbaohuPhoto) {
        this.huanjingbaohuPhoto = huanjingbaohuPhoto;
    }
    /**
	 * 设置：大小
	 */
    public String getHuanjingbaohuSize() {
        return huanjingbaohuSize;
    }


    /**
	 * 获取：大小
	 */

    public void setHuanjingbaohuSize(String huanjingbaohuSize) {
        this.huanjingbaohuSize = huanjingbaohuSize;
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
    public String getHuanjingbaohuContent() {
        return huanjingbaohuContent;
    }


    /**
	 * 获取：介绍
	 */

    public void setHuanjingbaohuContent(String huanjingbaohuContent) {
        this.huanjingbaohuContent = huanjingbaohuContent;
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
