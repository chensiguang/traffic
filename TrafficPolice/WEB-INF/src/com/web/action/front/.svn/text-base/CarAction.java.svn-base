package com.web.action.front;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.Car;
import com.web.service.interfaces.CarService;

/**
 * 前台显示-车辆信息
 * 
 * @author jjl date 2013/9/17
 */
public class CarAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private static final int PAGESIZE = 15;

	@Autowired
	private CarService carService;

	private List<Car> carList;

	private int count;

	public CarService getCarService() {
		return carService;
	}

	public void setCarService(CarService carService) {
		this.carService = carService;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {     
		this.carList = carList;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static int getPAGESIZE() {
		return PAGESIZE;
	}

	public String list() {
		log.info("do car list page...");

		int count = carService.selectCount();

		setCount(count);

		setPage("carlist.jsp");

		log.info("end car list page... <return Data type: page;Data:> carlist.jsp <Data:>"+ count);
		return "success";
	}

	public void carList() {
		String currentpage = getParameter("currentpage");

		log.info("do carList...<param>currentpage=" + currentpage);

		if (currentpage == null || currentpage.equals("")) {
			currentpage = "1";
		}
		int count = carService.selectCount();

		ArrayList<Car> carlist = carService.selectCarList((Integer
				.valueOf(currentpage) - 1)
				* PAGESIZE, PAGESIZE);

		try {
			getResponse().setContentType("text/html;charset=UTF-8");

			getResponse().getWriter().write(tojson(count, carlist));

		} catch (IOException e) {
			e.printStackTrace();
		}

		log.info("end carList...<return Data type: json;Data:>"
				+ tojson(count, carlist));
	}

	public void info() {

		String id = getParameter("carid");

		log.info("do car info...<param>carid=" + id);

		Car car = carService.selectCarInfoById(Integer.parseInt(id));

		try {
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(car.toJson());
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		log.info("end car info...<return Data type: json;Data:>"
						+ car.toJson());
	}

	public String tojson(int count, ArrayList<Car> carlist) {
		log.debug("enter into function  tojson:<pamams>count=" + count);

		StringBuffer newStr = new StringBuffer();

		newStr.append("{'count':'");

		newStr.append(count);

		newStr.append("'");

		int size = 0;

		if (carlist != null && carlist.size() > 0) {
			newStr.append(",'cars':[");

			for (Car car : carlist) {
				newStr.append(car.toJson());

				newStr.append(",");
			}
			newStr.deleteCharAt(newStr.length() - 1);

			newStr.append("]");

			size = carlist.size();
		}

		newStr.append(",'size':'");

		newStr.append(size);

		newStr.append("'");

		newStr.append("}");

		log.debug("Data type: json;Data: " + newStr.toString());

		return newStr.toString();
	}

}
