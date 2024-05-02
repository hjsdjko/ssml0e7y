package com.dao;

import com.entity.ZhangdanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhangdanxinxiVO;
import com.entity.view.ZhangdanxinxiView;


/**
 * 账单信息
 * 
 * @author 
 * @email 
 * @date 2021-05-03 10:04:05
 */
public interface ZhangdanxinxiDao extends BaseMapper<ZhangdanxinxiEntity> {
	
	List<ZhangdanxinxiVO> selectListVO(@Param("ew") Wrapper<ZhangdanxinxiEntity> wrapper);
	
	ZhangdanxinxiVO selectVO(@Param("ew") Wrapper<ZhangdanxinxiEntity> wrapper);
	
	List<ZhangdanxinxiView> selectListView(@Param("ew") Wrapper<ZhangdanxinxiEntity> wrapper);

	List<ZhangdanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhangdanxinxiEntity> wrapper);
	
	ZhangdanxinxiView selectView(@Param("ew") Wrapper<ZhangdanxinxiEntity> wrapper);
	
}
