/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.dao;

import java.util.List;
import com.web.pojo.Account;

/**
 * 账号管理
 * 
 * @author wqg
 * 
 *         2013-9-25上午10:25:13
 */
public interface AccountDao extends IBaseDao<Account>
{
	/* 后台管理 */

	List<Account> queryAll();// 查询所有

	int insertAccount(Account account);// 插入新数据

	Account queryDataById(Integer id);// 查找单条数据
	
	Account queryDataByUserno(Integer userno);// 查找单条数据

	int deleteDataById(Integer id);// 删除单条数据
	
	int deleteDataByUsername(Integer Username);// 根据用户名删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除
	
	void deleteDataByUsernames(Integer usernames);// 根据用户名批量删除
	

	int updateAccount(Account account);// 更新数据
	
	int updateAdminflag(Integer adminflag);// 更新数据是否为数据库标记
	
	int deleteAdminflag(Integer adminflag);// 取消数据是否为数据库标记
	
	int updatePassword(Account account);// 更新密码
	
	List<Account> selectUsernameById(Integer id);//查询admin的username
	
	int newOrUpdate(Account account);// 查看新增或者修改是否重复

}
