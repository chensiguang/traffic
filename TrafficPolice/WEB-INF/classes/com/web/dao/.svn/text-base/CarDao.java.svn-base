package com.web.dao;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.Car;

/**
 * 车辆管理
 * 
 * @author jjl date 2013/9/22
 */
public interface CarDao extends IBaseDao<Car> {

	/*
	 * 前台显示
	 */
	Car selectCarInfoById(Integer id);

	ArrayList<Car> selectCarList(int start, int pagesize);

	int selectCount();

	/*
	 * 后台管理
	 */
	List<Car> queryAll(); // 查询所有
	
	int insertCar(Car car); // 新增-提交

	Car queryDataById(int id); // 修改-编辑
	
	Car queryDataByCarid(int Carid); //通过carid查找车辆

	int updateCar(Car car); // 修改-提交

	int dropDataById(int id); // 单个删除

	int selectCarByBusLicPlate(Car car);// 查看车牌号是否重复
	
	List<Car> selectUsernameById(Integer id);//查询admin的username
	
	ArrayList<Car> selectCarListByDwid(Integer dwid);//根据单位id查找本单位的车辆

}
