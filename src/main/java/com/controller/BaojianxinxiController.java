package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BaojianxinxiEntity;
import com.entity.view.BaojianxinxiView;

import com.service.BaojianxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 包间信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-03 10:04:04
 */
@RestController
@RequestMapping("/baojianxinxi")
public class BaojianxinxiController {
    @Autowired
    private BaojianxinxiService baojianxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaojianxinxiEntity baojianxinxi, 
		HttpServletRequest request){

        EntityWrapper<BaojianxinxiEntity> ew = new EntityWrapper<BaojianxinxiEntity>();
		PageUtils page = baojianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baojianxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaojianxinxiEntity baojianxinxi, 
		HttpServletRequest request){
        EntityWrapper<BaojianxinxiEntity> ew = new EntityWrapper<BaojianxinxiEntity>();
		PageUtils page = baojianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baojianxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaojianxinxiEntity baojianxinxi){
       	EntityWrapper<BaojianxinxiEntity> ew = new EntityWrapper<BaojianxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baojianxinxi, "baojianxinxi")); 
        return R.ok().put("data", baojianxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaojianxinxiEntity baojianxinxi){
        EntityWrapper< BaojianxinxiEntity> ew = new EntityWrapper< BaojianxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baojianxinxi, "baojianxinxi")); 
		BaojianxinxiView baojianxinxiView =  baojianxinxiService.selectView(ew);
		return R.ok("查询包间信息成功").put("data", baojianxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaojianxinxiEntity baojianxinxi = baojianxinxiService.selectById(id);
        return R.ok().put("data", baojianxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaojianxinxiEntity baojianxinxi = baojianxinxiService.selectById(id);
        return R.ok().put("data", baojianxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaojianxinxiEntity baojianxinxi, HttpServletRequest request){
    	baojianxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baojianxinxi);

        baojianxinxiService.insert(baojianxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaojianxinxiEntity baojianxinxi, HttpServletRequest request){
    	baojianxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baojianxinxi);

        baojianxinxiService.insert(baojianxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaojianxinxiEntity baojianxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baojianxinxi);
        baojianxinxiService.updateById(baojianxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baojianxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BaojianxinxiEntity> wrapper = new EntityWrapper<BaojianxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = baojianxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
