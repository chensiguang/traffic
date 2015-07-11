package com.web.service.interfaces;

import java.util.List;
import com.web.pojo.Config;
import com.web.service.BaseService;

/**
 * 招聘岗位
 * 
 * @author yin
 * 
 *         2013-3-28
 * 
 */
public interface IConfigService extends BaseService<Config>
{

	/**
	 * 后台列表
	 * 
	 * @return
	 */
	List<Config> queryAll();

	/**
	 * 插入记录
	 * 
	 * @param s
	 * @return
	 */
	int insertConfig(Config c);

	/**
	 * 修改记录
	 * 
	 * @param p
	 * @return
	 */
	int updateConfig(Config c);

	/**
	 * 根据id查询记录
	 * 
	 * @param id
	 * @return
	 */
	Config queryDataById(String id);

	/**
	 * 根据id删除记录
	 * 
	 * @param id
	 * @return
	 */
	int deleteDataById(String id);

	/**
	 * 根据ids批量删除记录
	 * 
	 * 
	 */
	void deleteDataByIds(String ids);

	/**
	 * 查询记录并增加点击量
	 * 
	 * @param id
	 * @return
	 */
	// Config getDataByIdAndAddNum(int id);

	/**
	 * 首页查询
	 * 
	 * @return
	 */
	public List<Config> queryIndexData();

	List<Config> selectUsernameById(String id);// 查询admin的username

}
