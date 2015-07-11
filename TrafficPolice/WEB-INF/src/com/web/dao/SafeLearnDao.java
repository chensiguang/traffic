/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.dao;

import com.web.pojo.SafeLearn;

/**
 * @author wqg
 *
 * 2013-11-4上午8:51:27
 */
public interface SafeLearnDao extends IBaseDao<SafeLearn>
{
	int insertime(SafeLearn sl);
	
	SafeLearn queryDataByid(Integer id);
}
