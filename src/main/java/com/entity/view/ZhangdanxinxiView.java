package com.entity.view;

import com.entity.ZhangdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 账单信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-03 10:04:05
 */
@TableName("zhangdanxinxi")
public class ZhangdanxinxiView  extends ZhangdanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhangdanxinxiView(){
	}
 
 	public ZhangdanxinxiView(ZhangdanxinxiEntity zhangdanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhangdanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
