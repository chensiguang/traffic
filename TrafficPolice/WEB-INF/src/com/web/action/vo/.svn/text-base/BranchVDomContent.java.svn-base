/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Branch;

/**
 * 快速处理点
 * 
 * @author wqg
 * 
 *         2013-9-15上午9:45:31
 */
public class BranchVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private String branchName;// 名称

	private String branchAddress;// 地址

	private String branchPhone;// 电话

	private Long operid;// 操作人id

	private Double lng;// 经度

	private Double lat;// 纬度

	private String opertime;// 操作时间

	private String updatetime;// 更新时间

	private String remark;// 备注

	public Long getOperid()
	{
		return operid;
	}

	public void setOperid(Long operid)
	{
		this.operid = operid;
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

	public String getOpertime()
	{
		return opertime;
	}

	public void setOpertime(String opertime)
	{
		this.opertime = opertime;
	}

	public String getUpdatetime()
	{
		return updatetime;
	}

	public void setUpdatetime(String updatetime)
	{
		this.updatetime = updatetime;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public BranchVDomContent()
	{

	}

	public BranchVDomContent(Branch branch)
	{
		if(null != branch)
		{
			this.branchAddress = branch.getBranchAddress();
			
			this.branchName = branch.getBranchName();
			
			this.branchPhone = branch.getBranchPhone();
			
			this.remark = branch.getRemark();
			
			this.operid = branch.getOperid();
			
			this.opertime = sdf.format(branch.getOpertime());
			
			this.updatetime = sdf.format(branch.getUpdatetime());
		}
	}

}
