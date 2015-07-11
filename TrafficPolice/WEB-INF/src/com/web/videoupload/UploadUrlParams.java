/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.videoupload;

import java.io.Serializable;

/**<form method="post"  name="form2"  id="form2"  action="http://api.tudou.com/v6/video/upload_url?app_key=2a43a6e2271ab544&access_token=JJNyyToyZJBwTkkNwgoyeyJwZJTgwZe4pBagZa_eBBJ5aTNggpZBBmg_5ZJpZ_mmpp5ZJoZmJo_N&title=难说再见&tags=生活&channelId=4" >
 *<input type="submit" value="iswhyme"  ></input>
 *</form>
 * 
 * @author wqg
 *
 * 2013-9-16下午2:47:44
 */
public class UploadUrlParams implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String app_key;
	
	private String title;
	
	private String tags;
	
	private int channelId;
	
	private String access_token;
	
	public UploadUrlParams(String title,String tags,String access_token,int channelId,String app_key )
	{
		this.access_token = access_token;
		
		this.channelId = channelId;
		
		this.tags = tags;
		
		this.title = title;
		
		this.app_key = app_key;
	}
	
	public String getApp_key()
	{
		return app_key;
	}

	public void setApp_key(String app_key)
	{
		this.app_key = app_key;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getTags()
	{
		return tags;
	}

	public void setTags(String tags)
	{
		this.tags = tags;
	}

	public int getChannelId()
	{
		return channelId;
	}

	public void setChannelId(int channelId)
	{
		this.channelId = channelId;
	}

	public String getAccess_token()
	{
		return access_token;
	}

	public void setAccess_token(String access_token)
	{
		this.access_token = access_token;
	}
	
	
}
