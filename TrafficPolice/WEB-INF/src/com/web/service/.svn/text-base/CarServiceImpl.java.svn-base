package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.dao.CarDao;
import com.web.pojo.Car;
import com.web.service.interfaces.CarService;

/**
 * 车辆管理
 * 
 * @author jjl date 2013/9/22
 */
public class CarServiceImpl implements CarService {

	/*
	 * 前台显示
	 */
	@Autowired
	private CarDao carDao;

	@Override
	public Car selectCarInfoById(Integer id) {
		// TODO Auto-generated method stub
		return carDao.selectCarInfoById(id);
	}

	@Override
	public ArrayList<Car> selectCarList(int start, int pagesize) {
		// TODO Auto-generated method stub
		return carDao.selectCarList(start, pagesize);
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return carDao.selectCount();
	}

	/*
	 * 后台管理
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query) { // 查询总记录数
		// TODO Auto-generated method stub
		return carDao.getCountByAll(query);
	}

	@Override
	public List<Car> selectPage(HashMap<String, Object> query) { // 分页查询
		// TODO Auto-generated method stub
		return carDao.selectPage(query);
	}

	@Override
	public List<Car> queryAll() { // 查询所有
		// TODO Auto-generated method stub
		return carDao.queryAll();
	}

	@Override
	public int insertCar(Car car) { // 新增-提交
		// TODO Auto-generated method stub
		return carDao.insertCar(car);
	}

	@Override
	public Car queryDataById(String id) { // 修改-编辑
		// TODO Auto-generated method stub
		return carDao.queryDataById(Integer.parseInt(id));
	}

	@Override
	public int updateCar(Car car) { // 修改-提交
		// TODO Auto-generated method stub
		return carDao.updateCar(car);
	}

	@Override
	public int dropDataById(String id) { // 单个删除
		// TODO Auto-generated method stub
		return carDao.dropDataById(Integer.parseInt(id));
	}

	@Override
	public void dropAllDataByIds(String ids) { // 批量删除
		// TODO Auto-generated method stub
		if (ids.endsWith("#")) {
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++) {
			carDao.dropDataById(Integer.parseInt(idsVal[i]));
		}
	}

	@Override
	public int selectCarByBusLicPlate(Car car) {// 查看车牌号是否重复
		// TODO Auto-generated method stub
		return carDao.selectCarByBusLicPlate(car);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.CarService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Car> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return carDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.CarService#selectCarListByDwid(java.lang.String)
	 */
	@Override
	public ArrayList<Car> selectCarListByDwid(String dwid)
	{
		// TODO Auto-generated method stub
		return carDao.selectCarListByDwid(Integer.parseInt(dwid));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.CarService#queryDataByCarid(int)
	 */
	@Override
	public Car queryDataByCarid(int Carid)
	{
		// TODO Auto-generated method stub
		return carDao.queryDataByCarid(Carid);
	}

}
