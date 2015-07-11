/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.EduVideo;

/**
 * @author wqg
 * 
 *         2013-9-10上午8:32:46
 */
public class EduVideoVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private Integer videoType;// 视频类型

	private String videoTitle;// 宣传视频标题

	private String videoReleaseTime;// 宣传视屏发布时间

	private String videoUrl;// 视频播放地址

	private String content;// 宣传视频标题

	private String img;// 图文的图片

	private Long id;// 主键

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private String updatetime;// 更新时间

	private String regtime;// 注册时间

	private String fileName;// 视频实际名称

	private String str;

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public String getRegtime()
	{
		return regtime;
	}

	public void setRegtime(String regtime)
	{
		this.regtime = regtime;
	}

	public Integer getVideoType()
	{
		return videoType;
	}

	public void setVideoType(Integer videoType)
	{
		this.videoType = videoType;
	}

	public String getVideoTitle()
	{
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle)
	{
		this.videoTitle = videoTitle;
	}

	public String getVideoUrl()
	{
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl)
	{
		this.videoUrl = videoUrl;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getImg()
	{
		return img;
	}

	public void setImg(String img)
	{
		this.img = img;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Integer getState()
	{
		return state;
	}

	public void setState(Integer state)
	{
		this.state = state;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Long getOperid()
	{
		return operid;
	}

	public void setOperid(Long operid)
	{
		this.operid = operid;
	}

	public String getVideoReleaseTime()
	{
		return videoReleaseTime;
	}

	public void setVideoReleaseTime(String videoReleaseTime)
	{
		this.videoReleaseTime = videoReleaseTime;
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

	public String getStr()
	{
		return str;
	}

	public void setStr(String str)
	{
		this.str = str;
	}

	public EduVideoVDomContent()
	{

	}

	public EduVideoVDomContent(EduVideo edu)
	{
		if (null != edu)
		{
			this.id = edu.getId();

			this.img = edu.getImg();

			this.operid = edu.getOperid();

			this.opertime = sdf.format(edu.getOpertime());

			this.remark = edu.getRemark();

			this.state = edu.getState();

			this.content = edu.getContent();

			this.str = edu.getStr();

			this.videoReleaseTime = sdf.format(edu.getVideoReleaseTime());

			this.videoTitle = edu.getVideoTitle();

			this.videoType = edu.getVideoType();

			this.videoUrl = edu.getVideoUrl();

			this.regtime = sdf.format(edu.getRegtime());

			this.updatetime = sdf.format(edu.getUpdatetime());
			
			this.fileName = edu.getFileName();
		}
	}
}
