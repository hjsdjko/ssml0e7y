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


import com.dao.BaojianxinxiDao;
import com.entity.BaojianxinxiEntity;
import com.service.BaojianxinxiService;
import com.entity.vo.BaojianxinxiVO;
import com.entity.view.BaojianxinxiView;

@Service("baojianxinxiService")
public class BaojianxinxiServiceImpl extends ServiceImpl<BaojianxinxiDao, BaojianxinxiEntity> implements BaojianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaojianxinxiEntity> page = this.selectPage(
                new Query<BaojianxinxiEntity>(params).getPage(),
                new EntityWrapper<BaojianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaojianxinxiEntity> wrapper) {
		  Page<BaojianxinxiView> page =new Query<BaojianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaojianxinxiVO> selectListVO(Wrapper<BaojianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaojianxinxiVO selectVO(Wrapper<BaojianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaojianxinxiView> selectListView(Wrapper<BaojianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaojianxinxiView selectView(Wrapper<BaojianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
