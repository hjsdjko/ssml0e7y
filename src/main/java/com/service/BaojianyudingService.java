package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaojianyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaojianyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaojianyudingView;


/**
 * 包间预订
 *
 * @author 
 * @email 
 * @date 2021-05-03 10:04:04
 */
public interface BaojianyudingService extends IService<BaojianyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaojianyudingVO> selectListVO(Wrapper<BaojianyudingEntity> wrapper);
   	
   	BaojianyudingVO selectVO(@Param("ew") Wrapper<BaojianyudingEntity> wrapper);
   	
   	List<BaojianyudingView> selectListView(Wrapper<BaojianyudingEntity> wrapper);
   	
   	BaojianyudingView selectView(@Param("ew") Wrapper<BaojianyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaojianyudingEntity> wrapper);
   	
}

