/**
 * Project Name:TrafficPolice
 * File Name:NoticeServiceImpl.java
 * Package Name:com.web.service
 * Date:2013-7-18上午08:59:30
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.SafeNoticeDao;
import com.web.pojo.SafeNotice;
import com.web.service.interfaces.SafeNoticeService;

/**
 * 安全提醒
 * 
 * @author jjl date 2013/9/12
 */
public class SafeNoticeServiceImpl implements SafeNoticeService {
	/**
	 * 前台显示
	 */
	@Autowired
	private SafeNoticeDao safeNoticeDao;

	@Override
	public ArrayList<SafeNotice> selectNoticeList(int start, int pagesize) {
		// TODO Auto-generated method stub

		return safeNoticeDao.selectNoticeList(start, pagesize);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.NoticeService#selectNoticeInfoById(java.lang
	 * .String)
	 */
	@Override
	public SafeNotice selectNoticeInfoById(Integer id) {
		// TODO Auto-generated method stub
		return safeNoticeDao.selectNoticeInfoById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.NoticeService#selectCount()
	 */
	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return safeNoticeDao.selectCount();
	}

	/**
	 * 后台管理
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query) { // 查询总记录数
		// TODO Auto-generated method stub
		return safeNoticeDao.getCountByAll(query);
	}

	@Override
	public List<SafeNotice> selectPage(HashMap<String, Object> query) { // 分页查询
		// TODO Auto-generated method stub
		return safeNoticeDao.selectPage(query);
	}

	@Override
	public List<SafeNotice> queryAll() { // 查询所有
		// TODO Auto-generated method stub
		return safeNoticeDao.queryAll();
	}

	@Override
	public int insertSafeNotice(SafeNotice safenotice) { // 新增-提交
		// TODO Auto-generated method stub
		return safeNoticeDao.insertSafeNotice(safenotice);
	}

	@Override
	public SafeNotice queryDataById(String id) { // 修改-编辑
		// TODO Auto-generated method stub
		return safeNoticeDao.queryDataById(Integer.parseInt(id));
	}

	@Override
	public int updateSafeNotice(SafeNotice safenotice) { // 修改-提交
		// TODO Auto-generated method stub
		return safeNoticeDao.updateSafeNotice(safenotice);
	}

	@Override
	public int dropDataById(String id) { // 单个删除
		// TODO Auto-generated method stub
		return safeNoticeDao.dropDataById(Integer.parseInt(id));
	}

	@Override
	public void dropAllDataByIds(String ids) { // 批量删除
		// TODO Auto-generated method stub
		if (ids.endsWith("#")) {
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++) {
			safeNoticeDao.dropDataById(Integer.parseInt(idsVal[i]));
		}
	}

	@Override
	public int selectSafeNoticeByNoticeTitle(SafeNotice safenotice) {// 查看信息标题是否重复
		// TODO Auto-generated method stub
		return safeNoticeDao.selectSafeNoticeByNoticeTitle(safenotice);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeNoticeService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<SafeNotice> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return safeNoticeDao.selectUsernameById(Integer.parseInt(id));
	}

}
