package com.entity.view;

import com.entity.BinweishengwuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 濒危生物留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("binweishengwu_liuyan")
public class BinweishengwuLiuyanView extends BinweishengwuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 binweishengwu
			/**
			* 动物
			*/
			private String binweishengwuName;
			/**
			* 所在地区
			*/
			private Integer addressTypes;
				/**
				* 所在地区的值
				*/
				private String addressValue;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public BinweishengwuLiuyanView() {

	}

	public BinweishengwuLiuyanView(BinweishengwuLiuyanEntity binweishengwuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, binweishengwuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set binweishengwu

					/**
					* 获取： 动物
					*/
					public String getBinweishengwuName() {
						return binweishengwuName;
					}
					/**
					* 设置： 动物
					*/
					public void setBinweishengwuName(String binweishengwuName) {
						this.binweishengwuName = binweishengwuName;
					}

					/**
					* 获取： 所在地区
					*/
					public Integer getAddressTypes() {
						return addressTypes;
					}
					/**
					* 设置： 所在地区
					*/
					public void setAddressTypes(Integer addressTypes) {
						this.addressTypes = addressTypes;
					}


						/**
						* 获取： 所在地区的值
						*/
						public String getAddressValue() {
							return addressValue;
						}
						/**
						* 设置： 所在地区的值
						*/
						public void setAddressValue(String addressValue) {
							this.addressValue = addressValue;
						}

					/**
					* 获取： 图片
					*/
					public String getBinweishengwuPhoto() {
						return binweishengwuPhoto;
					}
					/**
					* 设置： 图片
					*/
					public void setBinweishengwuPhoto(String binweishengwuPhoto) {
						this.binweishengwuPhoto = binweishengwuPhoto;
					}

					/**
					* 获取： 现存数量
					*/
					public String getBinweishengwuSize() {
						return binweishengwuSize;
					}
					/**
					* 设置： 现存数量
					*/
					public void setBinweishengwuSize(String binweishengwuSize) {
						this.binweishengwuSize = binweishengwuSize;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 介绍
					*/
					public String getBinweishengwuContent() {
						return binweishengwuContent;
					}
					/**
					* 设置： 介绍
					*/
					public void setBinweishengwuContent(String binweishengwuContent) {
						this.binweishengwuContent = binweishengwuContent;
					}








































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
