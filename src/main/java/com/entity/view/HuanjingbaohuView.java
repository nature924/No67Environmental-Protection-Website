package com.entity.view;

import com.entity.HuanjingbaohuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 环境保护
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huanjingbaohu")
public class HuanjingbaohuView extends HuanjingbaohuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 地区的值
		*/
		private String addressValue;



	public HuanjingbaohuView() {

	}

	public HuanjingbaohuView(HuanjingbaohuEntity huanjingbaohuEntity) {
		try {
			BeanUtils.copyProperties(this, huanjingbaohuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

















}
