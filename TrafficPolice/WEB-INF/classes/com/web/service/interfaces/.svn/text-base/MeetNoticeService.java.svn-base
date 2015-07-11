/**
 * Project Name:TrafficPolice
 * File Name:NoticeService.java
 * Package Name:com.web.service.interfaces
 * Date:2013-7-18上午08:55:27
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.MeetNotice;
import com.web.service.BaseService;

/**
 * 会议通知
 * 
 * @author jjl date 2013/9/15
 */
public interface MeetNoticeService extends BaseService<MeetNotice>
{

	/*
	 * 前台显示
	 */
	ArrayList<MeetNotice> selectNoticeList(int start, int pagesize);

	MeetNotice selectNoticeInfoById(int id);

	int selectCount();

	/*
	 * 后台管理
	 */
	List<MeetNotice> queryAll(); // 查询所有

	int insertMeetNotice(MeetNotice meetnotice); // 新增

	MeetNotice queryDataById(String id); // 修改-编辑

	int updateMeetNotice(MeetNotice meetnotice);// 修改-提交

	int dropDataById(String id); // 单个删除

	void dropAllDataByIds(String ids); // 批量删除

	int selectMeetNoticeByNoticeTitle(MeetNotice meetnotice);// 查看信息标题是否重复

	List<MeetNotice> selectUsernameById(String id);// 查询admin的username
}
