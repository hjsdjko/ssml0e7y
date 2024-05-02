package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhangdanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhangdanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhangdanxinxiView;


/**
 * 账单信息
 *
 * @author 
 * @email 
 * @date 2021-05-03 10:04:05
 */
public interface ZhangdanxinxiService extends IService<ZhangdanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhangdanxinxiVO> selectListVO(Wrapper<ZhangdanxinxiEntity> wrapper);
   	
   	ZhangdanxinxiVO selectVO(@Param("ew") Wrapper<ZhangdanxinxiEntity> wrapper);
   	
   	List<ZhangdanxinxiView> selectListView(Wrapper<ZhangdanxinxiEntity> wrapper);
   	
   	ZhangdanxinxiView selectView(@Param("ew") Wrapper<ZhangdanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhangdanxinxiEntity> wrapper);
   	
}

