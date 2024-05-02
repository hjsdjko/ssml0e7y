package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 账单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-03 10:04:05
 */
@TableName("zhangdanxinxi")
public class ZhangdanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhangdanxinxiEntity() {
		
	}
	
	public ZhangdanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
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
