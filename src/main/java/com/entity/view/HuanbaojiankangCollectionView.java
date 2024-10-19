package com.entity.view;

import com.entity.HuanbaojiankangCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 环保健康收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huanbaojiankang_collection")
public class HuanbaojiankangCollectionView extends HuanbaojiankangCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String huanbaojiankangCollectionValue;



		//级联表 huanbaojiankang
			/**
			* 标题
			*/
			private String huanbaojiankangName;
			/**
			* 环保健康类型
			*/
			private Integer huanbaojiankangTypes;
				/**
				* 环保健康类型的值
				*/
				private String huanbaojiankangValue;
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

	public HuanbaojiankangCollectionView() {

	}

	public HuanbaojiankangCollectionView(HuanbaojiankangCollectionEntity huanbaojiankangCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, huanbaojiankangCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getHuanbaojiankangCollectionValue() {
				return huanbaojiankangCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setHuanbaojiankangCollectionValue(String huanbaojiankangCollectionValue) {
				this.huanbaojiankangCollectionValue = huanbaojiankangCollectionValue;
			}



















				//级联表的get和set huanbaojiankang

					/**
					* 获取： 标题
					*/
					public String getHuanbaojiankangName() {
						return huanbaojiankangName;
					}
					/**
					* 设置： 标题
					*/
					public void setHuanbaojiankangName(String huanbaojiankangName) {
						this.huanbaojiankangName = huanbaojiankangName;
					}

					/**
					* 获取： 环保健康类型
					*/
					public Integer getHuanbaojiankangTypes() {
						return huanbaojiankangTypes;
					}
					/**
					* 设置： 环保健康类型
					*/
					public void setHuanbaojiankangTypes(Integer huanbaojiankangTypes) {
						this.huanbaojiankangTypes = huanbaojiankangTypes;
					}


						/**
						* 获取： 环保健康类型的值
						*/
						public String getHuanbaojiankangValue() {
							return huanbaojiankangValue;
						}
						/**
						* 设置： 环保健康类型的值
						*/
						public void setHuanbaojiankangValue(String huanbaojiankangValue) {
							this.huanbaojiankangValue = huanbaojiankangValue;
						}

					/**
					* 获取： 封面
					*/
					public String getHuanbaojiankangPhoto() {
						return huanbaojiankangPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setHuanbaojiankangPhoto(String huanbaojiankangPhoto) {
						this.huanbaojiankangPhoto = huanbaojiankangPhoto;
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
					public String getHuanbaojiankangContent() {
						return huanbaojiankangContent;
					}
					/**
					* 设置： 介绍
					*/
					public void setHuanbaojiankangContent(String huanbaojiankangContent) {
						this.huanbaojiankangContent = huanbaojiankangContent;
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
