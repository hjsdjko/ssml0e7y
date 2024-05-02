package com.entity.view;

import com.entity.BaojianyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 包间预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-03 10:04:04
 */
@TableName("baojianyuding")
public class BaojianyudingView  extends BaojianyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaojianyudingView(){
	}
 
 	public BaojianyudingView(BaojianyudingEntity baojianyudingEntity){
 	try {
			BeanUtils.copyProperties(this, baojianyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
