package com.web.videoupload;

import java.util.LinkedList;
import java.util.List;
import yao.util.param.Param;
import yao.util.string.StringUtil;
import yao.util.web.UrlUtil;
import com.web.videoupload.OAuthPost;
import com.web.videoupload.OAuthException;
import com.web.videoupload.JSONUtils;


/**获取视频上传的url
 * @author wqg
 *
 * 2013-9-17上午10:27:56
 */
public class TudouUpload {

	/**
	 * 拼接土豆视频上传的页面地址
	 * 
	 * @param authorizeParams
	 *            参数
	 * @return URLString
	 */
	public String uploadURL(UploadUrlParams uploadParams) {
		String authorizeUrl = OAuthClientConfig.URL_AUTHORIZE;
		List<Param> params = new LinkedList<Param>();
		return UrlUtil.UTF8.parseUrl(authorizeUrl, params);
	}


	/**
	 * 取得uploadUrl
	 * 
	 * @param accessTokenParams
	 *            参数
	 * @return AccessToken
	 * @throws OAuthException
	 * @throws SDKException
	 */
	public UploadUrl uploadUrl(UploadUrlParams uploadUrlParams) throws OAuthException, SDKException {
		List<Param> params = new LinkedList<Param>();
		params.add(new Param("title", StringUtil.toString(uploadUrlParams.getTitle())));
		params.add(new Param("tags",StringUtil.toString(uploadUrlParams.getTags())));
		params.add(new Param("channelId", StringUtil.toString(uploadUrlParams.getChannelId())));
		params.add(new Param("access_token", StringUtil.toString(uploadUrlParams.getAccess_token())));
		params.add(new Param("app_key",StringUtil.toString(uploadUrlParams.getApp_key())));
		String jsonString = OAuthPost.post("http://api.tudou.com/v6/video/upload_url", params);
		UploadUrl uploadUrl = JSONUtils.parseObject(jsonString, UploadUrl.class);
		System.out.println(jsonString);
		String str = jsonString.toString();
		str = str.substring(2, str.length() - 3);
		String[] str2 = str.split(":");
		String[] str3 = str2[1].split(",");
		String itemCode = str3[0].substring(1, str3[0].length() - 1);
		String uploadurl = '"'+"http"+str.split(":")[4].substring(0,str.split(":")[4].length() - 1) + '"';
		System.out.println("itemCode是：    "+itemCode);
		System.out.println("uploadUrl是：    "+uploadurl);
		return uploadUrl;
	}
}
