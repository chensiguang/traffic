package com.web.pojo;

/**
 * 
 * @ClassName: Micromessage
 * 
 * @Description: TODO
 * 
 * @author ln
 * 
 * @date 2013-9-9
 * 
 * 
 */
public class Micromessage extends BasePojo
{
	// 微信id
	private Long id;

	// 微信用户id
	private Long microid;

	// 微信用户name
	private String microname;

	// 微信内容
	private String content;

	// 微信发表时间
	private String createtime;

	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getMicroid()
	{
		return microid;
	}

	public void setMicroid(Long microid)
	{
		this.microid = microid;
	}

	public String getMicroname()
	{
		return microname;
	}

	public void setMicroname(String microname)
	{
		this.microname = microname;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getCreatetime()
	{
		return createtime;
	}

	public void setCreatetime(String createtime)
	{
		this.createtime = createtime.substring(0, 19);
	}

	public String toJson()
	{
		StringBuffer strbuffBuffer = new StringBuffer();

		strbuffBuffer.append("{'id':'");
		strbuffBuffer.append(getId());
		strbuffBuffer.append("','microid':'");
		strbuffBuffer.append(microid);
		strbuffBuffer.append("','microname':'");
		strbuffBuffer.append(microname);
		strbuffBuffer.append("','content':'");
		strbuffBuffer.append(content);
		strbuffBuffer.append("','createtime':'");
		strbuffBuffer.append(createtime);
		strbuffBuffer.append("'}");
		return strbuffBuffer.toString();
	}
}
