package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaojianyudingDao;
import com.entity.BaojianyudingEntity;
import com.service.BaojianyudingService;
import com.entity.vo.BaojianyudingVO;
import com.entity.view.BaojianyudingView;

@Service("baojianyudingService")
public class BaojianyudingServiceImpl extends ServiceImpl<BaojianyudingDao, BaojianyudingEntity> implements BaojianyudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaojianyudingEntity> page = this.selectPage(
                new Query<BaojianyudingEntity>(params).getPage(),
                new EntityWrapper<BaojianyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaojianyudingEntity> wrapper) {
		  Page<BaojianyudingView> page =new Query<BaojianyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaojianyudingVO> selectListVO(Wrapper<BaojianyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaojianyudingVO selectVO(Wrapper<BaojianyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaojianyudingView> selectListView(Wrapper<BaojianyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaojianyudingView selectView(Wrapper<BaojianyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
