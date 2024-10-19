package com.entity.view;

import com.entity.HuanjingbaohufaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 环境保护法
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huanjingbaohufa")
public class HuanjingbaohufaView extends HuanjingbaohufaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 保护法类型的值
		*/
		private String huanjingbaohufaValue;



	public HuanjingbaohufaView() {

	}

	public HuanjingbaohufaView(HuanjingbaohufaEntity huanjingbaohufaEntity) {
		try {
			BeanUtils.copyProperties(this, huanjingbaohufaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 保护法类型的值
			*/
			public String getHuanjingbaohufaValue() {
				return huanjingbaohufaValue;
			}
			/**
			* 设置： 保护法类型的值
			*/
			public void setHuanjingbaohufaValue(String huanjingbaohufaValue) {
				this.huanjingbaohufaValue = huanjingbaohufaValue;
			}

















}
