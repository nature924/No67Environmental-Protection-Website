package com.entity.view;

import com.entity.HuanjingbaohuCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 环境保护收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huanjingbaohu_collection")
public class HuanjingbaohuCollectionView extends HuanjingbaohuCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String huanjingbaohuCollectionValue;



		//级联表 huanjingbaohu
			/**
			* 名称
			*/
			private String huanjingbaohuName;
			/**
			* 地区
			*/
			private Integer addressTypes;
				/**
				* 地区的值
				*/
				private String addressValue;
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

	public HuanjingbaohuCollectionView() {

	}

	public HuanjingbaohuCollectionView(HuanjingbaohuCollectionEntity huanjingbaohuCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, huanjingbaohuCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getHuanjingbaohuCollectionValue() {
				return huanjingbaohuCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setHuanjingbaohuCollectionValue(String huanjingbaohuCollectionValue) {
				this.huanjingbaohuCollectionValue = huanjingbaohuCollectionValue;
			}




























				//级联表的get和set huanjingbaohu

					/**
					* 获取： 名称
					*/
					public String getHuanjingbaohuName() {
						return huanjingbaohuName;
					}
					/**
					* 设置： 名称
					*/
					public void setHuanjingbaohuName(String huanjingbaohuName) {
						this.huanjingbaohuName = huanjingbaohuName;
					}

					/**
					* 获取： 地区
					*/
					public Integer getAddressTypes() {
						return addressTypes;
					}
					/**
					* 设置： 地区
					*/
					public void setAddressTypes(Integer addressTypes) {
						this.addressTypes = addressTypes;
					}


						/**
						* 获取： 地区的值
						*/
						public String getAddressValue() {
							return addressValue;
						}
						/**
						* 设置： 地区的值
						*/
						public void setAddressValue(String addressValue) {
							this.addressValue = addressValue;
						}

					/**
					* 获取： 图片
					*/
					public String getHuanjingbaohuPhoto() {
						return huanjingbaohuPhoto;
					}
					/**
					* 设置： 图片
					*/
					public void setHuanjingbaohuPhoto(String huanjingbaohuPhoto) {
						this.huanjingbaohuPhoto = huanjingbaohuPhoto;
					}

					/**
					* 获取： 大小
					*/
					public String getHuanjingbaohuSize() {
						return huanjingbaohuSize;
					}
					/**
					* 设置： 大小
					*/
					public void setHuanjingbaohuSize(String huanjingbaohuSize) {
						this.huanjingbaohuSize = huanjingbaohuSize;
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
					public String getHuanjingbaohuContent() {
						return huanjingbaohuContent;
					}
					/**
					* 设置： 介绍
					*/
					public void setHuanjingbaohuContent(String huanjingbaohuContent) {
						this.huanjingbaohuContent = huanjingbaohuContent;
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
