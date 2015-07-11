package com.web.action.front;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.Car;
import com.web.pojo.Company;
import com.web.service.interfaces.CarService;
import com.web.service.interfaces.CompanyService;

/**
 * 前台显示-企业信息
 * 
 * @author jjl date 2013/9/17
 */
public class CompanyAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private static final int PAGESIZE = 15;

	@Autowired
	private CompanyService companyService;

	private List<Company> companyList;

	private int count;

	public CompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
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
		log.info("do company list page...");

		int count = companyService.selectCount();

		setCount(count);

		setPage("companylist.jsp");

		log.info("end company list page... <return Data type: page;Data:> companylist.jsp <Data:>"
						+ count);

		return "success";
	}

	public void companyList() {
		String currentpage = getParameter("currentpage");

		log.info("do companyList...<param>currentpage=" + currentpage);

		if (currentpage == null || currentpage.equals("")) {
			currentpage = "1";
		}
		int count = companyService.selectCount();

		ArrayList<Company> companylist = companyService.selectCompanyList(
				(Integer.valueOf(currentpage) - 1) * PAGESIZE, PAGESIZE);

		try {
			getResponse().setContentType("text/html;charset=UTF-8");

			getResponse().getWriter().write(tojson(count, companylist));

		} catch (IOException e) {
			e.printStackTrace();
		}

		log.info("end companyList...<return Data type: json;Data:>"
				+ tojson(count, companylist));
	}

	public void info() {

		String id = getParameter("companyid");

		log.info("do company info...<param>companyid=" + id);

		Company company = companyService.selectCompanyInfoById(Integer
				.parseInt(id));

		try {
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(company.toJson());
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		log.info("end company info...<return Data type: json;Data:>"
				+ company.toJson());
	}

	public String tojson(int count, ArrayList<Company> companylist) {
		log.debug("enter into function  tojson:<pamams>count=" + count);

		StringBuffer newStr = new StringBuffer();

		newStr.append("{'count':'");

		newStr.append(count);

		newStr.append("'");

		int size = 0;

		if (companylist != null && companylist.size() > 0) {
			newStr.append(",'companys':[");

			for (Company company : companylist) {
				newStr.append(company.toJson());

				newStr.append(",");
			}
			newStr.deleteCharAt(newStr.length() - 1);

			newStr.append("]");

			size = companylist.size();
		}

		newStr.append(",'size':'");

		newStr.append(size);

		newStr.append("'");

		newStr.append("}");

		log.debug("Data type: json;Data: " + newStr.toString());

		return newStr.toString();
	}

}
