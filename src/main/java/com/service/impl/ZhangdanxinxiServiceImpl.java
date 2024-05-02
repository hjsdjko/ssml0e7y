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


import com.dao.ZhangdanxinxiDao;
import com.entity.ZhangdanxinxiEntity;
import com.service.ZhangdanxinxiService;
import com.entity.vo.ZhangdanxinxiVO;
import com.entity.view.ZhangdanxinxiView;

@Service("zhangdanxinxiService")
public class ZhangdanxinxiServiceImpl extends ServiceImpl<ZhangdanxinxiDao, ZhangdanxinxiEntity> implements ZhangdanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhangdanxinxiEntity> page = this.selectPage(
                new Query<ZhangdanxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhangdanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhangdanxinxiEntity> wrapper) {
		  Page<ZhangdanxinxiView> page =new Query<ZhangdanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhangdanxinxiVO> selectListVO(Wrapper<ZhangdanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhangdanxinxiVO selectVO(Wrapper<ZhangdanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhangdanxinxiView> selectListView(Wrapper<ZhangdanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhangdanxinxiView selectView(Wrapper<ZhangdanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
