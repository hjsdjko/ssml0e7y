package com.entity.model;

import com.entity.ZhangdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 账单信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-03 10:04:05
 */
public class ZhangdanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会员卡号
	 */
	
	private String huiyuankahao;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 折扣
	 */
	
	private Float zhekou;
		
	/**
	 * 消费金额
	 */
	
	private Float xiaofeijine;
		
	/**
	 * 总金额
	 */
	
	private Float zongjine;
		
	/**
	 * 账单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhangdanshijian;
		
	/**
	 * 账单
	 */
	
	private String zhangdan;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：会员卡号
	 */
	 
	public void setHuiyuankahao(String huiyuankahao) {
		this.huiyuankahao = huiyuankahao;
	}
	
	/**
	 * 获取：会员卡号
	 */
	public String getHuiyuankahao() {
		return huiyuankahao;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：折扣
	 */
	 
	public void setZhekou(Float zhekou) {
		this.zhekou = zhekou;
	}
	
	/**
	 * 获取：折扣
	 */
	public Float getZhekou() {
		return zhekou;
	}
				
	
	/**
	 * 设置：消费金额
	 */
	 
	public void setXiaofeijine(Float xiaofeijine) {
		this.xiaofeijine = xiaofeijine;
	}
	
	/**
	 * 获取：消费金额
	 */
	public Float getXiaofeijine() {
		return xiaofeijine;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：账单时间
	 */
	 
	public void setZhangdanshijian(Date zhangdanshijian) {
		this.zhangdanshijian = zhangdanshijian;
	}
	
	/**
	 * 获取：账单时间
	 */
	public Date getZhangdanshijian() {
		return zhangdanshijian;
	}
				
	
	/**
	 * 设置：账单
	 */
	 
	public void setZhangdan(String zhangdan) {
		this.zhangdan = zhangdan;
	}
	
	/**
	 * 获取：账单
	 */
	public String getZhangdan() {
		return zhangdan;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
