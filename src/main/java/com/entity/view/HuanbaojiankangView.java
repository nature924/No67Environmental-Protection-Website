package com.entity.view;

import com.entity.HuanbaojiankangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 环保健康
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huanbaojiankang")
public class HuanbaojiankangView extends HuanbaojiankangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 环保健康类型的值
		*/
		private String huanbaojiankangValue;



	public HuanbaojiankangView() {

	}

	public HuanbaojiankangView(HuanbaojiankangEntity huanbaojiankangEntity) {
		try {
			BeanUtils.copyProperties(this, huanbaojiankangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

















}
