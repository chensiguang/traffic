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
import com.web.dao.MeetNoticeDao;
import com.web.pojo.MeetNotice;
import com.web.service.interfaces.MeetNoticeService;

/**
 * 会议通知
 * 
 * @author jjl date 2013/9/15
 */
public class MeetNoticeServiceImpl implements MeetNoticeService {
	/**
	 * 前台显示
	 */
	@Autowired
	private MeetNoticeDao meetNoticeDao;

	@Override
	public ArrayList<MeetNotice> selectNoticeList(int start, int pagesize) {
		// TODO Auto-generated method stub

		return meetNoticeDao.selectNoticeList(start, pagesize);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.NoticeService#selectNoticeInfoById(java.lang
	 * .String)
	 */
	@Override
	public MeetNotice selectNoticeInfoById(int id) {
		// TODO Auto-generated method stub
		return meetNoticeDao.selectNoticeInfoById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.NoticeService#selectCount()
	 */
	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return meetNoticeDao.selectCount();
	}

	/**
	 * 后台管理
	 */
	@Override
	public void dropAllDataByIds(String ids) { // 批量删除
		// TODO Auto-generated method stub
		if (ids.endsWith("#")) {
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++) {
			meetNoticeDao.dropDataById(Integer.parseInt(idsVal[i]));
		}
	}

	@Override
	public int dropDataById(String id) { // 单个删除
		// TODO Auto-generated method stub
		return meetNoticeDao.dropDataById(Integer.parseInt(id));
	}

	@Override
	public int insertMeetNotice(MeetNotice meetnotice) { // 新增-提交
		// TODO Auto-generated method stub
		return meetNoticeDao.insertMeetNotice(meetnotice);
	}

	@Override
	public List<MeetNotice> queryAll() { // 查询所有
		// TODO Auto-generated method stub
		return meetNoticeDao.queryAll();
	}

	@Override
	public MeetNotice queryDataById(String id) { // 修改-编辑
		// TODO Auto-generated method stub
		return meetNoticeDao.queryDataById(Integer.parseInt(id));
	}

	@Override
	public int updateMeetNotice(MeetNotice meetnotice) { // 修改-提交
		// TODO Auto-generated method stub
		return meetNoticeDao.updateMeetNotice(meetnotice);
	}

	@Override
	public int getCountByAll(HashMap<String, Object> query) { // 查询总记录数
		// TODO Auto-generated method stub
		return meetNoticeDao.getCountByAll(query);
	}

	@Override
	public List<MeetNotice> selectPage(HashMap<String, Object> query) { // 分页查询
		// TODO Auto-generated method stub
		return meetNoticeDao.selectPage(query);
	}

	@Override
	public int selectMeetNoticeByNoticeTitle(MeetNotice meetnotice) {// 查看信息标题是否重复
		// TODO Auto-generated method stub
		return meetNoticeDao.selectMeetNoticeByNoticeTitle(meetnotice);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.MeetNoticeService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<MeetNotice> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return meetNoticeDao.selectUsernameById(Integer.parseInt(id));
	}
}
