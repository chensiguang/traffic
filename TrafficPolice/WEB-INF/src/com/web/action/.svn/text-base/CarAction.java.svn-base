package com.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.CarVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.Area;
import com.web.pojo.Car;
import com.web.pojo.Company;
import com.web.pojo.PoliceOrgCompany;
import com.web.service.interfaces.AreaService;
import com.web.service.interfaces.CarService;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.PoliceOrgCompanyService;

/**
 * 后台管理－车辆管理
 * 
 * @author jjl date 2013/9/22
 */
public class CarAction extends BaseAction
{

	private static final long serialVersionUID = 1L;
	@Autowired
	private CarService carService;

	@Autowired
	private PoliceOrgCompanyService policecomService;

	private List<PoliceOrgCompany> policecomList;
	private List<Car> carList;
	private List<Car> carlist = new ArrayList<Car>();
	private CompanyService companyService;
	private List<Company> companyList;
	private AreaService areaService;
	private List<Area> areaList;
	private Car car = new Car();
	private static final String title = "车辆管理";
	private String ids;
	private String action;
	private static ListActions opt;
	private CarVDomContent dom;
	private final static int PAGESIZE = 10;

	public List<Car> getCarlist()
	{
		return carlist;
	}

	public void setCarlist(List<Car> carlist)
	{
		this.carlist = carlist;
	}

	public List<PoliceOrgCompany> getPolicecomList()
	{
		return policecomList;
	}

	public void setPolicecomList(List<PoliceOrgCompany> policecomList)
	{
		this.policecomList = policecomList;
	}

	public CarService getCarService()
	{
		return carService;
	}

	public void setCarService(CarService carService)
	{
		this.carService = carService;
	}

	public List<Car> getCarList()
	{
		return carList;
	}

	public void setCarList(List<Car> carList)
	{
		this.carList = carList;
	}

	public String getIds()
	{
		return ids;
	}

	public void setIds(String ids)
	{
		this.ids = ids;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public ListActions getOpt()
	{
		return opt;
	}

	public void setOpt(ListActions opt)
	{
		CarAction.opt = opt;
	}

	public CarVDomContent getDom()
	{
		return dom;
	}

	public void setDom(CarVDomContent dom)
	{
		this.dom = dom;
	}

	public String getTitle()
	{
		return title;
	}

	public CompanyService getCompanyService()
	{
		return companyService;
	}

	public void setCompanyService(CompanyService companyService)
	{
		this.companyService = companyService;
	}

	public List<Company> getCompanyList()
	{
		return companyList;
	}

	public void setCompanyList(List<Company> companyList)
	{
		this.companyList = companyList;
	}

	public AreaService getAreaService()
	{
		return areaService;
	}

	public void setAreaService(AreaService areaService)
	{
		this.areaService = areaService;
	}

	public List<Area> getAreaList()
	{
		return areaList;
	}

	public void setAreaList(List<Area> areaList)
	{
		this.areaList = areaList;
	}

	public int getPAGESIZE()
	{
		return PAGESIZE;
	}

	public Car getCar()
	{
		return car;
	}

	public void setCar(Car car)
	{
		this.car = car;
	}

	static
	{
		opt = new ListActions();
		opt.setAddAction("page/admin/page/carback_addCar.action"); // 新增
		opt.setEditAction("page/admin/page/carback_editCar.action"); // 修改
		opt.setDeleteAction("page/admin/page/carback_deleteCar.action"); // 单个删除
		opt.setDelAllAction("page/admin/page/carback_deleteAllCar.action"); // 批量删除
		opt.setShowAction("page/admin/page/carback_detailCar.action"); // 详情
	}

	// 查询所有、条件查询
	public String viewCarList()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();
		long admin = (Long) session.getAttribute("adminflag");// 获得当前登录用户是否为数据管理员的标记
		long dwid = (Long) session.getAttribute("dwid");// 获得当前登录用户所在单位号
		long dwtype = (Long) session.getAttribute("dwtype");// 获得当前登录用户所在单位类型
															// 0代表交警 1代表货运公司
		String safecomid = this.getParameter("id");// 获得安全组下公司的id号
		// 获取页面查询的条件值
		String busLicPlate = this.getParameter("busLicPlate") == null ? ""
				: this.getParameter("busLicPlate");
		car.setBusLicPlate(busLicPlate);

		HashMap<String, Object> querya = new HashMap<String, Object>();
		if (!busLicPlate.equals("") && busLicPlate != null)
		{
			querya.put("busLicPlate", busLicPlate);
		}
		if (safecomid != "" && safecomid != null)
		{
			querya.put("safecomid", safecomid);
		}
		int allnum = 0;

		if (admin == 1)// 数据管理员
		{
			allnum = carService.getCountByAll(querya);
		} else
		{
			if (dwtype == 0)// 交警部门
			{
				policecomList = policecomService.queryAllByDwid(dwid);

				for (int i = 0; i < policecomList.size(); i++)
				{
					long comid = policecomList.get(i).getComid();

					querya.put("comid", comid);

					allnum += carService.getCountByAll(querya);

				}
			} else
			// 货运公司
			{
				companyList = companyService.queryChildCompanyByDwid(dwid);// 查询下属公司车辆

				for (int i = 0; i < companyList.size(); i++)
				{
					long comid = companyList.get(i).getComid();
					querya.put("comid", comid);
					allnum += carService.getCountByAll(querya);
				}
				// 查询自己公司的车辆
				querya.remove("comid");
				querya.put("comid", dwid);
				allnum += carService.getCountByAll(querya);
			}
		}
		// 当前页号
		String pn = this.getParameter("page");
		int curpage = 1;
		if (pn != null)
		{
			int t = Integer.parseInt(pn);
			if (t > 0)
			{
				curpage = t;
			}
		}
		HashMap<String, Object> queryp = new HashMap<String, Object>();
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);
		
		if (!busLicPlate.equals("") && busLicPlate != null)
		{
			queryp.put("busLicPlate", busLicPlate);
		}
		if (safecomid != "" && safecomid != null)
		{
			queryp.put("safecomid", safecomid);
		}
		if (admin == 1)
		{
			carList = carService.selectPage(queryp);

			for (int j = 0; j < carList.size(); j++)
			{
				carlist.add(carList.get(j));
			}
		} else
		{
			if (dwtype == 0)// 交警部门
			{
				policecomList = policecomService.queryAllByDwid(dwid);

				for (int i = 0; i < policecomList.size(); i++)
				{
					long comid = policecomList.get(i).getComid();

					queryp.put("comid", comid);

					carList = carService.selectPage(queryp);

					for (int j = 0; j < carList.size(); j++)
					{
						carlist.add(carList.get(j));
					}

				}

			}
			// 货运企业
			else
			{
				//查询自己公司的车辆
				queryp.put("comid", dwid);
				carList = carService.selectPage(queryp);
				for (int j = 0; j < carList.size(); j++)
				{
					carlist.add(carList.get(j));
				}
				queryp.remove("comid");
				
				companyList = companyService.queryChildCompanyByDwid(dwid);// 查询下属公司的车辆
				for (int i = 0; i < companyList.size(); i++)
				{
					long comid = companyList.get(i).getComid();

					queryp.put("comid", comid);

					carList = carService.selectPage(queryp);
					for (int j = 0; j < carList.size(); j++)
					{
						carlist.add(carList.get(j));
					}
				}
			}
		}

		// 总页数
		int pt = allnum / PAGESIZE;
		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;
		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/carback_viewCarList.action");
		return "default";
	}

	// 查询所有
	public String viewCarList_new()
	{
		HashMap<String, Object> querya = new HashMap<String, Object>();
		int allnum = carService.getCountByAll(querya);
		// 当前页号
		String pn = this.getParameter("page");
		int curpage = 1;
		if (pn != null)
		{
			int t = Integer.parseInt(pn);
			if (t > 0)
			{
				curpage = t;
			}
		}
		HashMap<String, Object> queryp = new HashMap<String, Object>();
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);
		carList = carService.selectPage(queryp);
		// 总页数
		int pt = allnum / PAGESIZE;
		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;
		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/carback_viewCarList_new.action");
		return "addcar";
	}

	// 详情
	public String detailCar()
	{
		String id = this.getParameter("id");

		dom = new CarVDomContent(carService.queryDataById(id));

		carList = carService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;
		return "view";
	}

	// 新增
	public String addCar()
	{
		carList = carService.queryAll();
		if (carList != null)
		{
			getSession().setAttribute("carList", carList);
		}
		areaList = areaService.queryAll();// 查询所有地区
		companyList = companyService.queryAll();// 查询公司
		action = "page/admin/page/carback_insertCar.action";
		return "edit";
	}

	// 新增-提交
	public String insertCar()
	{
		Car car = new Car();
		car.setBusLicPlate(dom.getBusLicPlate());
		// 查看车牌号是否重复
		int num = carService.selectCarByBusLicPlate(car);
		if (num != 0)
		{
			message = "'" + dom.getBusLicPlate() + "'车牌号已存在!";
			action = opt.getAddAction();
		} else
		{
			car.setBusType(dom.getBusType());
			car.setComid(dom.getComid());
			car.setAreaid(dom.getAreaid());
			car.setFactoryType(dom.getFactoryType());
			car.setManufacturer(dom.getManufacturer());
			car.setRegStartTime(new Date());
			car.setRegEndTime(new Date());

			car.setOperid((long) getCurrUser());
			car.setOpertime(new Date());
			car.setState(1);
			car.setRegid((long) getCurrUser());
			car.setRegtime(new Date());
			car.setRemark(dom.getRemark());

			action = "page/admin/page/carback_viewCarList.action";
			carService.insertCar(car);
			message = "信息新增成功!";
		}
		return SUCCESS;
	}

	// 修改-编辑
	public String editCar()
	{
		areaList = areaService.queryAll();// 查询所有地区
		companyList = companyService.queryAll();// 查询公司
		String id = this.getParameter("id");
		Car car = carService.queryDataById(id);
		dom = new CarVDomContent(car);
		action = "page/admin/page/carback_updateCar.action?id=" + id;
		return "edit";
	}

	// 修改-提交
	public String updateCar()
	{
		String id = this.getParameter("id");
		Car car = new Car();
		car.setBusLicPlate(dom.getBusLicPlate());
		car.setCarid((long) Integer.parseInt(id));
		car.setBusType(dom.getBusType());
		car.setComid(dom.getComid());
		car.setAreaid(dom.getAreaid());
	/*	// 查看车牌号是否重复
		int num = carService.selectCarByBusLicPlate(car);
		if (num != 0)
		{
			message = "'" + dom.getBusLicPlate() + "'车牌号已重复!";
			action = opt.getEditAction() + "?id=" + id + "&comid="
					+ dom.getComid() + "&areaid=" + dom.getAreaid()
					+ "&busType=" + dom.getBusType();
		} else
		{*/
			car.setFactoryType(dom.getFactoryType());
			car.setManufacturer(dom.getManufacturer());

			car.setOperid((long) getCurrUser());
			car.setOpertime(new Date());
			car.setRemark(dom.getRemark());
			carService.updateCar(car);
			message = "信息修改成功!";
			action = "page/admin/page/carback_viewCarList.action";
		return SUCCESS;
	}

	// 单个删除
	public String deleteCar()
	{
		String id = this.getParameter("id");
		carService.dropDataById(id);
		action = "page/admin/page/carback_viewCarList.action";
		message = "信息删除成功!";
		return SUCCESS;
	}

	// 批量删除
	public String deleteAllCar()
	{
		carService.dropAllDataByIds(ids);
		action = "page/admin/page/carback_viewCarList.action";
		message = "信息批量删除成功!";
		return SUCCESS;
	}
}
