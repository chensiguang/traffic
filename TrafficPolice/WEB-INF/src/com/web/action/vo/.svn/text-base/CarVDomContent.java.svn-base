package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Area;
import com.web.pojo.Car;
import com.web.pojo.Company;

/**
 * 后台管理－车辆管理
 * 
 * @author jjl date 2013/9/22
 */
public class CarVDomContent {
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private Long carid; // 车辆管理id
	private String busLicPlate; // 车牌号
	private String driver1; // 常用驾驶员
	private String phone1; // 驾驶员电话
	private String factoryType; // 厂牌型号
	private String manufacturer; // 生产厂家
	private String busType; // 车辆类型 搅拌车；油罐车；货物运输车等等
	private String regCode; // 登记证书
	private String regStartTime; // 起始开始
	private String regEndTime; // 结束时间
	private Long comid;// 所属公司id
	private Long areaid;// 所属地区id
	private Area area;
	private Company company;

	// 公用字段
	private Long id; // 主键
	private Integer state; // 状态
	private String remark; // 备注
	private Long operid; // 操作人id
	private String opertime; // 操作时间
	private Long regid; // 注册id
	private String regtime; // 注册时间
	private String str;
	private Car car = new Car();

	public Long getCarid() {
		return carid;
	}

	public void setCarid(Long carid) {
		this.carid = carid;
	}

	public String getBusLicPlate() {
		return busLicPlate;
	}

	public void setBusLicPlate(String busLicPlate) {
		this.busLicPlate = busLicPlate;
	}

	public String getDriver1() {
		return driver1;
	}

	public void setDriver1(String driver1) {
		this.driver1 = driver1;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getFactoryType() {
		return factoryType;
	}

	public void setFactoryType(String factoryType) {
		this.factoryType = factoryType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getRegStartTime() {
		return regStartTime;
	}

	public void setRegStartTime(String regStartTime) {
		this.regStartTime = regStartTime;
	}

	public String getRegEndTime() {
		return regEndTime;
	}

	public void setRegEndTime(String regEndTime) {
		this.regEndTime = regEndTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getOperid() {
		return operid;
	}

	public void setOperid(Long operid) {
		this.operid = operid;
	}

	public String getOpertime() {
		return opertime;
	}

	public void setOpertime(String opertime) {
		this.opertime = opertime;
	}

	public Long getRegid() {
		return regid;
	}

	public void setRegid(Long regid) {
		this.regid = regid;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Long getComid() {
		return comid;
	}

	public void setComid(Long comid) {
		this.comid = comid;
	}

	public Long getAreaid() {
		return areaid;
	}

	public void setAreaid(Long areaid) {
		this.areaid = areaid;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public CarVDomContent() {

	}

	public CarVDomContent(Car car) {

		if (car != null) {
			this.busLicPlate = car.getBusLicPlate();
			this.driver1 = car.getDriver1();
			this.phone1 = car.getPhone1();
			this.regStartTime = sdf.format(car.getRegStartTime());
			this.regEndTime = sdf.format(car.getRegEndTime());
			this.busType = car.getBusType();
			this.manufacturer = car.getManufacturer();
			this.factoryType = car.getFactoryType();
			this.regCode = car.getRegCode();
			this.comid = car.getCompany().getComid();
			this.areaid = car.getArea().getAreaid();
			this.company = car.getCompany();
			this.area = car.getArea();
			// 公用字段
			this.id = car.getId();
			this.operid = car.getOperid();
			this.opertime = sdf.format(car.getOpertime());
			this.regid = car.getRegid();
			this.regtime = sdf.format(car.getRegtime());
			this.remark = car.getRemark();
			this.state = car.getState();
			this.str = car.getStr();

		}
	}
}
