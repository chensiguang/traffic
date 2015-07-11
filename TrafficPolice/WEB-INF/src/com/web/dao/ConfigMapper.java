package com.web.dao;

import java.util.List;
import com.web.pojo.Config;

public interface ConfigMapper extends IBaseDao<Config>
{

	int deleteByPrimaryKey(Integer id);

	int insert(Config record);

	int insertSelective(Config record);

	Config selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Config record);

	int updateByPrimaryKey(Config record);

	List<Config> queryAll();

	List<Config> selectIndex();

	List<Config> selectUsernameById(Integer id);// 查询admin的username

}
