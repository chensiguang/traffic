package com.web.pojo;

/**
 * 
 * @ClassName: Pcar
 * 
 * @Description: TODO
 * 
 * @author ln
 * 
 * @date 2013-9-24
 * 
 * 
 */
public class Pcar extends BasePojo
{

	// 账户车辆id
	private Long udid;

	// 账户id
	private Long userid;

	// 车辆id
	private Long carid;

	// 车牌号码
	private String buslicplate;

	// 所属公司id
	private Long comid;

	// 所属公司名称
	private String comname;

	// 划分人id
	private Long operid;

	// 划分人姓名
	private String opername;

	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Long getUdid()
	{
		return udid;
	}

	public void setUdid(Long udid)
	{
		this.udid = udid;
	}

	public Long getUserid()
	{
		return userid;
	}

	public void setUserid(Long userid)
	{
		this.userid = userid;
	}

	public Long getCarid()
	{
		return carid;
	}

	public void setCarid(Long carid)
	{
		this.carid = carid;
	}

	public String getBuslicplate()
	{
		return buslicplate;
	}

	public void setBuslicplate(String buslicplate)
	{
		this.buslicplate = buslicplate;
	}

	public Long getComid()
	{
		return comid;
	}

	public void setComid(Long comid)
	{
		this.comid = comid;
	}

	public String getComname()
	{
		return comname;
	}

	public void setComname(String comname)
	{
		this.comname = comname;
	}

	public Long getOperid()
	{
		return operid;
	}

	public void setOperid(Long operid)
	{
		this.operid = operid;
	}

	public String getOpername()
	{
		return opername;
	}

	public void setOpername(String opername)
	{
		this.opername = opername;
	}

	public String toJson()
	{
		StringBuffer strbuffBuffer = new StringBuffer();

		strbuffBuffer.append("{'udid':'");
		strbuffBuffer.append(this.getUdid());
		strbuffBuffer.append("','useid':'");
		strbuffBuffer.append(userid);
		strbuffBuffer.append("','carid':'");
		strbuffBuffer.append(carid);
		strbuffBuffer.append("','buslicplate':'");
		strbuffBuffer.append(buslicplate);
		strbuffBuffer.append("','comid':'");
		strbuffBuffer.append(comid);
		strbuffBuffer.append("','comname':'");
		strbuffBuffer.append(comname);
		strbuffBuffer.append("','operid':'");
		strbuffBuffer.append(operid);
		strbuffBuffer.append("','opername':'");
		strbuffBuffer.append(opername);
		strbuffBuffer.append("'}");
		return strbuffBuffer.toString();
	}
}
