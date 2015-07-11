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
import java.util.List;
import com.web.pojo.SafeNotice;

/**
 * 安全提醒
 * 
 * @author jjl date 2013/9/12
 */
public interface SafeNoticeDao extends IBaseDao<SafeNotice>
{
	/*
	 * 前台显示
	 */
	ArrayList<SafeNotice> selectNoticeList(int start, int pagesize);

	SafeNotice selectNoticeInfoById(Integer id);

	int selectCount();

	/*
	 * 后台管理
	 */
	List<SafeNotice> queryAll(); // 查询所有

	int insertSafeNotice(SafeNotice safenotice); // 新增-提交

	SafeNotice queryDataById(int id); // 修改-编辑

	int updateSafeNotice(SafeNotice safenotice); // 修改-提交

	int dropDataById(int id); // 单个删除

	int selectSafeNoticeByNoticeTitle(SafeNotice safenotice);// 查看信息标题是否重复

	List<SafeNotice> selectUsernameById(Integer id);// 查询admin的username

}
