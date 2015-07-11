/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.SafeLearn;

/**
 * @author wqg
 * 
 *         2013-11-4上午8:46:20
 */
public class SafeLearnVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private long id;

	private long videoid;// 视频id

	private long driverid;// 驾驶员id

	private long time;// 观看视频的时长

	private String date;// 观看视频的时间

	public long getVideoid()
	{
		return videoid;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public void setVideoid(long videoid)
	{
		this.videoid = videoid;
	}

	public long getDriverid()
	{
		return driverid;
	}

	public void setDriverid(long driverid)
	{
		this.driverid = driverid;
	}

	public long getTime()
	{
		return time;
	}

	public void setTime(long time)
	{
		this.time = time;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public SafeLearnVDomContent()
	{

	}

	public SafeLearnVDomContent(SafeLearn sl)
	{
		if (null != sl)
		{
			this.id = sl.getId();

			this.videoid = sl.getVideoid();

			this.driverid = sl.getDriverid();

			this.time = sl.getTime();

			this.date = sdf.format(sl.getDate());
		}
	}

}
