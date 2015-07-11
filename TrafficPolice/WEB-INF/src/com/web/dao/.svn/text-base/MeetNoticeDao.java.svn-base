/**
 * Project Name:TrafficPolice
 * File Name:NoticeDao.java
 * Package Name:com.web.dao
 * Date:2013-7-17下午05:30:16
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.web.pojo.MeetNotice;

/**
 * 会议通知
 * 
 * @author jjl date 2013/9/15
 */
public interface MeetNoticeDao extends IBaseDao<MeetNotice>
{
	/*
	 * 前台显示
	 */
	ArrayList<MeetNotice> selectNoticeList(int start, int pagesize);

	MeetNotice selectNoticeInfoById(Integer id);

	int selectCount();

	/*
	 * 后台管理
	 */
	int dropDataById(int id); // 单个删除

	int insertMeetNotice(MeetNotice meetnotice); // 新增-提交

	List<MeetNotice> queryAll(); // 查询所有

	MeetNotice queryDataById(int id); // 修改-编辑

	int updateMeetNotice(MeetNotice meetnotice); // 修改-提交

	int getCountByAll(HashMap<String, Object> query); // 查询总记录数

	List<MeetNotice> selectPage(HashMap<String, Object> query); // 分页查询

	int selectMeetNoticeByNoticeTitle(MeetNotice meetnotice);// 查看信息标题是否重复

	List<MeetNotice> selectUsernameById(Integer id);// 查询admin的username

}
