package com.dao;

import com.entity.BaojianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaojianxinxiVO;
import com.entity.view.BaojianxinxiView;


/**
 * 包间信息
 * 
 * @author 
 * @email 
 * @date 2021-05-03 10:04:04
 */
public interface BaojianxinxiDao extends BaseMapper<BaojianxinxiEntity> {
	
	List<BaojianxinxiVO> selectListVO(@Param("ew") Wrapper<BaojianxinxiEntity> wrapper);
	
	BaojianxinxiVO selectVO(@Param("ew") Wrapper<BaojianxinxiEntity> wrapper);
	
	List<BaojianxinxiView> selectListView(@Param("ew") Wrapper<BaojianxinxiEntity> wrapper);

	List<BaojianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaojianxinxiEntity> wrapper);
	
	BaojianxinxiView selectView(@Param("ew") Wrapper<BaojianxinxiEntity> wrapper);
	
}
