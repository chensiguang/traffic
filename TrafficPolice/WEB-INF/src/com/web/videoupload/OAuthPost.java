package com.web.videoupload;

import java.util.List;

import yao.util.param.Param;

import com.web.videoupload.OAuthClientConfig;
import com.web.videoupload.SDKException;
import com.web.videoupload.OAuthException;
import com.web.videoupload.OAuthExceptionUtils;
import com.web.videoupload.HTTPUtils;

/**
 * 工具类
 * 
 * @author yaoming
 */
public class OAuthPost {

	/**
	 * Post一些参数到指定URL
	 * 
	 * @param url
	 *            URL
	 * @param params
	 *            参数列表
	 * @return body文本
	 * @throws OAuthException
	 * @throws SDKException
	 */
	public static String post(String url, List<Param> params) throws OAuthException, SDKException {
		final String content;
		final OAuthException oauthException;
		try {
			content = HTTPUtils.getHTTPUtil().getStringByPost(url, params, OAuthClientConfig.HTTP_CHARSET);
			oauthException = OAuthExceptionUtils.fromJsonString(content);
		} catch (Exception e) {
			throw new SDKException(e);
		}
		if (null != oauthException) {
			throw oauthException;
		}
		return content;
	}

}
