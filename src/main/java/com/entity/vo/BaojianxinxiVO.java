package com.entity.vo;

import com.entity.BaojianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 包间信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-03 10:04:04
 */
public class BaojianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 包间类型
	 */
	
	private String baojianleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 容纳人数
	 */
	
	private String rongnarenshu;
		
	/**
	 * 时价格
	 */
	
	private Integer shijiage;
		
	/**
	 * 包间环境
	 */
	
	private String baojianhuanjing;
		
	/**
	 * 使用状况
	 */
	
	private String shiyongzhuangkuang;
				
	
	/**
	 * 设置：包间类型
	 */
	 
	public void setBaojianleixing(String baojianleixing) {
		this.baojianleixing = baojianleixing;
	}
	
	/**
	 * 获取：包间类型
	 */
	public String getBaojianleixing() {
		return baojianleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：容纳人数
	 */
	 
	public void setRongnarenshu(String rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}
	
	/**
	 * 获取：容纳人数
	 */
	public String getRongnarenshu() {
		return rongnarenshu;
	}
				
	
	/**
	 * 设置：时价格
	 */
	 
	public void setShijiage(Integer shijiage) {
		this.shijiage = shijiage;
	}
	
	/**
	 * 获取：时价格
	 */
	public Integer getShijiage() {
		return shijiage;
	}
				
	
	/**
	 * 设置：包间环境
	 */
	 
	public void setBaojianhuanjing(String baojianhuanjing) {
		this.baojianhuanjing = baojianhuanjing;
	}
	
	/**
	 * 获取：包间环境
	 */
	public String getBaojianhuanjing() {
		return baojianhuanjing;
	}
				
	
	/**
	 * 设置：使用状况
	 */
	 
	public void setShiyongzhuangkuang(String shiyongzhuangkuang) {
		this.shiyongzhuangkuang = shiyongzhuangkuang;
	}
	
	/**
	 * 获取：使用状况
	 */
	public String getShiyongzhuangkuang() {
		return shiyongzhuangkuang;
	}
			
}
