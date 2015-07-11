package com.web.service;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.dao.AreaDao;
import com.web.pojo.Area;
import com.web.service.interfaces.AreaService;

/**
 * 地区
 * 
 * @author jjl date 2013/9/24
 */
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaDao;

	/*
	 * 后台管理
	 */
	@Override
	public List<Area> queryAll() { // 查询所有地区
		// TODO Auto-generated method stub
		return areaDao.queryAll();
	}

	@Override
	public int getCountByAll(HashMap<String, Object> query) {
		// TODO Auto-generated method stub
		return areaDao.getCountByAll(query);
	}

	@Override
	public List<Area> selectPage(HashMap<String, Object> query) {
		// TODO Auto-generated method stub
		return areaDao.selectPage(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.AreaService#selectUsernameById(java.lang.String
	 * )
	 */
	@Override
	public List<Area> selectUsernameById(String id) {
		// TODO Auto-generated method stub
		return areaDao.selectUsernameById(Integer.parseInt(id));
	}

	@Override
	public Area queryDataById(int id) { //修改-编辑
		// TODO Auto-generated method stub
		return areaDao.queryDataById(id);
	}

	@Override
	public void dropDataByIds(String ids) {//批量删除
		// TODO Auto-generated method stub
		if (ids.endsWith("#")) {
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++) {
			areaDao.dropDataById(Integer.parseInt(idsVal[i]));
		}
	}

	@Override
	public int selectAreaByAreaName(Area area) { //查看地域名称是否重复
		// TODO Auto-generated method stub
		return areaDao.selectAreaByAreaName(area);
	}

	@Override
	public int updateArea(Area area) { // 修改-提交
		// TODO Auto-generated method stub
		return areaDao.updateArea(area);
	}

	@Override
	public int insertArea(Area area) { //新增-提交
		// TODO Auto-generated method stub
		return areaDao.insertArea(area);
	}

	@Override
	public int dropDataById(String id) { //单个删除
		// TODO Auto-generated method stub
		return areaDao.dropDataById(Integer.parseInt(id));
	}
}
