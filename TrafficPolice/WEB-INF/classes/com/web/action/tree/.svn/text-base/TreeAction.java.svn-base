package com.web.action.tree;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.Area;
import com.web.pojo.Permission;
import com.web.pojo.PoliceOrg;
import com.web.service.interfaces.AreaService;
import com.web.service.interfaces.PermissionService;
import com.web.service.interfaces.PoliceOrgService;

public class TreeAction extends BaseAction {
	private static final long serialVersionUID = -7404004985391809441L;
	@Autowired
	private AreaService areaService;
	private List<Area> areaList;
	@Autowired
	private PoliceOrgService policeOrgService;
	private List<PoliceOrg> policeOrgList;
	@Autowired
	private PermissionService permissionService;
	private List<Permission> permissionList;
	private final static int PAGESIZE = 100;
	String s = "";

	public AreaService getAreaService() {
		return areaService;
	}

	public void setAreaService(AreaService areaService) {
		this.areaService = areaService;
	}

	public PoliceOrgService getPoliceOrgService() {
		return policeOrgService;
	}

	public void setPoliceOrgService(PoliceOrgService policeOrgService) {
		this.policeOrgService = policeOrgService;
	}

	public PermissionService getPermissionService() {
		return permissionService;
	}

	public void setPermissionService(PermissionService permissionService) {
		this.permissionService = permissionService;
	}

	public int getPAGESIZE() {
		return PAGESIZE;
	}

	/**
	 * 机构树状
	 */
	public void orgtree() {

		String CONTENT_TYPE = "text/xml; charset=utf-8";
		s += "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		TreeBuild treeBuild = new TreeBuild();
		Tree tree = new Tree();
		int curpage = 1;
		HashMap<String, Object> queryp = new HashMap<String, Object>();
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);
		// 查询所有
		policeOrgList = policeOrgService.selectPage(queryp);
		// 组成树状结构
		if (policeOrgList.size() > 0) {
			for (int i = 0; i < policeOrgList.size(); i++) {
				PoliceOrg policeOrg = policeOrgList.get(i);
				treeBuild.addToTree(tree, policeOrg.getId().toString(),
						policeOrg.getOrgname(), policeOrg.getPid().toString());
			}
			s += treeBuild.treeToXml(tree);
			System.out.println(s);
		}
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType(CONTENT_TYPE);
			response.getWriter().print(s);
			response.getWriter().close();// 关闭流
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------- orgtree action back finish ----------");
		return;
	}

	/**
	 * 地区树状
	 */
	public void areatree() {

		String CONTENT_TYPE = "text/xml; charset=utf-8";
		s += "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		TreeBuild treeBuild = new TreeBuild();
		Tree tree = new Tree();
		int curpage = 1;
		HashMap<String, Object> queryp = new HashMap<String, Object>();
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);
		// 查询所有
		areaList = areaService.selectPage(queryp);
		// 组成树状结构
		if (areaList.size() > 0) {
			for (int i = 0; i < areaList.size(); i++) {
				Area area = areaList.get(i);
				treeBuild.addToTree(tree, area.getAreaid().toString(), area
						.getAreaname(), area.getParentid().toString());
			}
			s += treeBuild.treeToXml(tree);
			System.out.println(s);
		}
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType(CONTENT_TYPE);
			response.getWriter().print(s);
			response.getWriter().close();// 关闭流
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------- orgtree action back finish ----------");
		return;
	}

	/**
	 * 权限树状
	 */
	public void pertree() {

		String CONTENT_TYPE = "text/xml; charset=utf-8";
		s += "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		TreeBuild treeBuild = new TreeBuild();
		Tree tree = new Tree();

		// 查询所有
		permissionList = permissionService.queryAll();
		// 组成树状结构
		if (permissionList.size() > 0) {
			for (int i = 0; i < permissionList.size(); i++) {
				Permission permission = permissionList.get(i);
				treeBuild.addToTree(tree, Long.toString(permission.getPerno()), permission
						.getPername(),Long.toString(permission.getParentid()));
			}
			s += treeBuild.treeToXml(tree);
			System.out.println(s);
		}
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType(CONTENT_TYPE);
			response.getWriter().print(s);
			response.getWriter().close();// 关闭流
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------- pertree action back finish ----------");
		return;
	}
}
