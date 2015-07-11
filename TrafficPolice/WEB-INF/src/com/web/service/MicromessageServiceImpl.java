/**
 * Project Name:TrafficPolice
 * File Name:DriverServiceImpl.java
 * Package Name:com.web.service
 * Date:2013-7-17上午10:25:10
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.MicromessageDao;
import com.web.pojo.Micromessage;
import com.web.service.interfaces.MicromessageService;

/**
 * ClassName:MicromessageServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-9  <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public class MicromessageServiceImpl implements MicromessageService
{
    @Autowired
    private MicromessageDao micromessageDao;

    @Override
    public ArrayList<Micromessage> selectMicromessageList(int start, int pagesize)
    {
        // TODO Auto-generated method stub
        return micromessageDao.selectMicromessageList(start, pagesize);
    }

    @Override
    public int selectCount(HashMap map)
    {
        // TODO Auto-generated method stub

        return micromessageDao.selectCount(map);
    }

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.MicromessageService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Micromessage> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return micromessageDao.selectUsernameById(Integer.parseInt(id));
	}

}
