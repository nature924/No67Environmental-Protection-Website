package com.entity.vo;

import com.entity.BinweishengwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 濒危生物
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("binweishengwu")
public class BinweishengwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 动物
     */

    @TableField(value = "binweishengwu_name")
    private String binweishengwuName;


    /**
     * 所在地区
     */

    @TableField(value = "address_types")
    private Integer addressTypes;


    /**
     * 图片
     */

    @TableField(value = "binweishengwu_photo")
    private String binweishengwuPhoto;


    /**
     * 现存数量
     */

    @TableField(value = "binweishengwu_size")
    private String binweishengwuSize;


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

    @TableField(value = "binweishengwu_content")
    private String binweishengwuContent;


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
	 * 设置：动物
	 */
    public String getBinweishengwuName() {
        return binweishengwuName;
    }


    /**
	 * 获取：动物
	 */

    public void setBinweishengwuName(String binweishengwuName) {
        this.binweishengwuName = binweishengwuName;
    }
    /**
	 * 设置：所在地区
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }


    /**
	 * 获取：所在地区
	 */

    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getBinweishengwuPhoto() {
        return binweishengwuPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setBinweishengwuPhoto(String binweishengwuPhoto) {
        this.binweishengwuPhoto = binweishengwuPhoto;
    }
    /**
	 * 设置：现存数量
	 */
    public String getBinweishengwuSize() {
        return binweishengwuSize;
    }


    /**
	 * 获取：现存数量
	 */

    public void setBinweishengwuSize(String binweishengwuSize) {
        this.binweishengwuSize = binweishengwuSize;
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
    public String getBinweishengwuContent() {
        return binweishengwuContent;
    }


    /**
	 * 获取：介绍
	 */

    public void setBinweishengwuContent(String binweishengwuContent) {
        this.binweishengwuContent = binweishengwuContent;
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
