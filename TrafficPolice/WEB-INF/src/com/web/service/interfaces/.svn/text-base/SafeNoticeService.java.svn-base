package com.web.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.SafeNotice;
import com.web.service.BaseService;

/**
 * 安全提醒
 * 
 * @author jjl date 2013/9/12
 */
public interface SafeNoticeService extends BaseService<SafeNotice> {

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

	int insertSafeNotice(SafeNotice safenotice); // 新增

	SafeNotice queryDataById(String id); // 修改-编辑

	int updateSafeNotice(SafeNotice safenotice);// 修改-提交

	int dropDataById(String id); // 单个删除

	void dropAllDataByIds(String ids); // 批量删除

	int selectSafeNoticeByNoticeTitle(SafeNotice safenotice); // 查看信息标题是否重复
	
	 List<SafeNotice> selectUsernameById(String id);// 查询admin的username

}
