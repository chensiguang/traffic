package com.web.videoupload;

import java.util.LinkedList;
import java.util.List;
import yao.util.param.Param;
import yao.util.string.StringUtil;
import yao.util.web.UrlUtil;
import com.web.videoupload.OAuthPost;
import com.web.videoupload.OAuthException;
import com.web.videoupload.JSONUtils;

/**
 * 获取上传视频的信息
 * 
 * @author wqg
 * 
 *         2013-9-17上午10:27:56
 */
public class TudouVideoInfo
{
	/**
	 * 取得uploadUrl
	 * 
	 * @param accessTokenParams
	 *            参数
	 * @return AccessToken
	 * @throws OAuthException
	 * @throws SDKException
	 */
	public VideoInfo videoInfo(VideoInfoParams videoInfoParams)throws OAuthException, SDKException
	{
		List<Param> params = new LinkedList<Param>();
		params.add(new Param("app_key", StringUtil.toString(videoInfoParams.getApp_key())));
		params.add(new Param("itemCodes", StringUtil.toString(videoInfoParams.getItemCodes())));
		String jsonString = OAuthPost.post("http://api.tudou.com/v6/video/info", params);
		VideoInfo videoInfo = JSONUtils.parseObject(jsonString, VideoInfo.class);
		System.out.println(jsonString);
		/*String str = jsonString.toString();
		str = str.substring(2, str.length() - 3);
		String[] str2 = str.split(":");
		String[] str3 = str2[1].split(",");*/
		return videoInfo;
	}
}
