package com.web.pojo;

import java.util.Date;

import com.web.util.DateFormateUtil;

/**
 * 
 * @ClassName: EduVideo
 * 
 * @Description: TODO
 * 
 * @author ws
 * 
 * @date 2013-7-17 上午09:57:57
 * 
 * 
 */
public class EduVideo extends BasePojo
{
	private Integer videoType;// 视频类型

	private String videoTitle;// 宣传视频标题

	private Date videoReleaseTime;// 宣传视屏发布时间

	private String videoUrl;// 视频播放地址

	private String content;// 视频简介

	private String img;// 视频图片

	private Date regtime;// 注册时间

	private Date updatetime;// 更新时间

	private String fileName;// 视频实际名称

	private Admin admin;// 指向admin的引用

	private SafeLearn safelearn;

	public SafeLearn getSafelearn()
	{
		return safelearn;
	}

	public void setSafelearn(SafeLearn safelearn)
	{
		this.safelearn = safelearn;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Date getUpdatetime()
	{
		return updatetime;
	}

	public void setUpdatetime(Date updatetime)
	{
		this.updatetime = updatetime;
	}

	public Date getRegtime()
	{
		return regtime;
	}

	public void setRegtime(Date regtime)
	{
		this.regtime = regtime;
	}

	public String getImg()
	{
		return img;
	}

	public void setImg(String img)
	{
		this.img = img;
	}

	public Integer getVideoType()
	{
		return videoType;
	}

	public void setVideoType(Integer videoType)
	{
		this.videoType = videoType;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getVideoTitle()
	{
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle)
	{
		this.videoTitle = videoTitle;
	}

	public Date getVideoReleaseTime()
	{
		return videoReleaseTime;
	}

	public void setVideoReleaseTime(Date videoReleaseTime)
	{
		this.videoReleaseTime = videoReleaseTime;
	}

	public String getVideoUrl()
	{
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl)
	{
		this.videoUrl = videoUrl;
	}

	public String toJson()
	{
		StringBuffer strbuffBuffer = new StringBuffer();

		strbuffBuffer.append("{'id':'");
		strbuffBuffer.append(getId());
		strbuffBuffer.append("','videotype':'");
		strbuffBuffer.append(getVideoType());
		strbuffBuffer.append("','videotitle':'");
		strbuffBuffer.append(getVideoTitle());
		strbuffBuffer.append("','videoreleasetime':'");
		strbuffBuffer.append(DateFormateUtil.dateformate("yyyy-MM-dd",
				getVideoReleaseTime()));
		strbuffBuffer.append("','videourl':'");
		strbuffBuffer.append(getVideoUrl());
		strbuffBuffer.append("','content':'");
		strbuffBuffer.append(getContent());
		strbuffBuffer.append("','img':'");
		strbuffBuffer.append(getImg());
		strbuffBuffer.append("','videourl':'");
		strbuffBuffer.append(getVideoUrl());
		strbuffBuffer.append("'}");
		return strbuffBuffer.toString();
	}

	public static void main(String[] args0)
	{
		System.out.println("do");
	}

}
