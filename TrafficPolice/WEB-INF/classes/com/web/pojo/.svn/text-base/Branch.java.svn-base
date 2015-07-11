/**
 * Project Name:TrafficPolice
 * File Name:Branch.java
 * Package Name:com.web.pojo
 * Date:2013-7-17下午05:00:38
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.pojo;

/**
 * ClassName:Branch <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 下午05:00:38 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class Branch extends BasePojo
{
	private String branchName;// 名称

	private String branchAddress;// 地址

	private String branchPhone;// 电话

	private Double lng;// 经度

	private Double lat;// 纬度

	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public String getBranchName()
	{
		return branchName;
	}

	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}

	public String getBranchAddress()
	{
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress)
	{
		this.branchAddress = branchAddress;
	}

	public String getBranchPhone()
	{
		return branchPhone;
	}

	public void setBranchPhone(String branchPhone)
	{
		this.branchPhone = branchPhone;
	}

	public Double getLng()
	{
		return lng;
	}

	public void setLng(Double lng)
	{
		this.lng = lng;
	}

	public Double getLat()
	{
		return lat;
	}

	public void setLat(Double lat)
	{
		this.lat = lat;
	}

	public String toJson()
	{
		StringBuffer strbuffBuffer = new StringBuffer();

		strbuffBuffer.append("{'id':'");
		strbuffBuffer.append(getId());
		strbuffBuffer.append("','branchName':'");
		strbuffBuffer.append(branchName);
		strbuffBuffer.append("','branchAddress':'");
		strbuffBuffer.append(branchAddress);
		strbuffBuffer.append("','branchPhone':'");
		strbuffBuffer.append(branchPhone);
		strbuffBuffer.append("','lng':'");
		strbuffBuffer.append(lng);
		strbuffBuffer.append("','lat':'");
		strbuffBuffer.append(lat);
		strbuffBuffer.append("'}");
		return strbuffBuffer.toString();
	}
}
