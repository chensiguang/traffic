package com.web.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.Car;
import com.web.service.BaseService;

/**
 * 车辆管理
 * 
 * @author jjl date 2013/9/22
 */
public interface CarService extends BaseService<Car> {
	/*
	 * 前台显示
	 */
	ArrayList<Car> selectCarList(int start, int pagesize);

	Car selectCarInfoById(Integer id);

	int selectCount();

	/*
	 * 后台管理
	 */
	List<Car> queryAll(); // 查询所有

	int insertCar(Car car); // 新增

	Car queryDataById(String id); // 修改-编辑
	
	Car queryDataByCarid(int Carid); //通过carid查找车辆

	int updateCar(Car car);// 修改-提交

	int dropDataById(String id); // 单个删除

	void dropAllDataByIds(String ids); // 批量删除

	int selectCarByBusLicPlate(Car car); // 查看车牌号是否重复
	
	List<Car> selectUsernameById(String id);// 查询admin的username
	
	ArrayList<Car> selectCarListByDwid(String dwid);//根据单位id查找本单位的车辆
}
