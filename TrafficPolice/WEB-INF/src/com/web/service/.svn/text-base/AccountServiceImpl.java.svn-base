/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.AccountDao;
import com.web.pojo.Account;
import com.web.service.interfaces.AccountService;

/**账号管理
 * 
 * @author wqg
 *
 * 2013-9-25上午10:29:04
 */

@Service
public class AccountServiceImpl implements AccountService
{
	@Autowired
	private AccountDao accountDao;

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return accountDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Account> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return accountDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#queryAll()
	 */
	@Override
	public List<Account> queryAll()
	{
		// TODO Auto-generated method stub
		return accountDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#insertDriver(com.web.pojo.Account)
	 */
	@Override
	public int insertAccount(Account account)
	{
		// TODO Auto-generated method stub
		return accountDao.insertAccount(account);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#queryDataById(java.lang.String)
	 */
	@Override
	public Account queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return accountDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return accountDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#deleteDataByIds(java.lang.String)
	 */
	@Override
	public void deleteDataByIds(String ids)
	{
		// TODO Auto-generated method stub
		if (ids.endsWith("#"))
		{
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++)
		{
			if(Integer.parseInt(idsVal[i]) == 0)
			{
				
			}else{
				accountDao.deleteDataById(Integer.parseInt(idsVal[i]));
			}
			
		}
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#updateDriver(com.web.pojo.Account)
	 */
	@Override
	public int updateAccount(Account account)
	{
		// TODO Auto-generated method stub
		return accountDao.updateAccount(account);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#updatePassword(com.web.pojo.Account)
	 */
	@Override
	public int updatePassword(Account account)
	{
		// TODO Auto-generated method stub
		return accountDao.updatePassword(account);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Account> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return accountDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#newOrUpdate(com.web.pojo.Account)
	 */
	@Override
	public int newOrUpdate(Account account)
	{
		// TODO Auto-generated method stub
		return accountDao.newOrUpdate(account);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#queryDataByUserno(java.lang.String)
	 */
	@Override
	public Account queryDataByUserno(String userno)
	{
		// TODO Auto-generated method stub
		return accountDao.queryDataByUserno(Integer.parseInt(userno));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#updateAdminflag(com.web.pojo.Account)
	 */
	@Override
	public int updateAdminflag(String adminflag)
	{
		// TODO Auto-generated method stub
		return accountDao.updateAdminflag(Integer.parseInt(adminflag));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#deleteAdminflag(java.lang.String)
	 */
	@Override
	public int deleteAdminflag(String adminflag)
	{
		// TODO Auto-generated method stub
		return accountDao.deleteAdminflag(Integer.parseInt(adminflag));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#deleteDataByUsername(java.lang.Integer)
	 */
	@Override
	public int deleteDataByUsername(Integer Username)
	{
		// TODO Auto-generated method stub
		return accountDao.deleteDataByUsername(Username);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.AccountService#deleteDataByUsernames(java.lang.Integer)
	 */
	@Override
	public void deleteDataByUsernames(String usernames)
	{
		// TODO Auto-generated method stub
		
		if (usernames.endsWith("#"))
		{
			usernames = usernames.substring(0, usernames.length() - 1);
		}
		String[] idsVal = usernames.split("#");
		for (int i = 0; i < idsVal.length; i++)
		{
			if(Integer.parseInt(idsVal[i]) == 0)
			{
				
			}else{
				accountDao.deleteDataByUsername(Integer.parseInt(idsVal[i]));
			}
			
		}
		
	}

}
