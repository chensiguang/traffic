package com.web.videoupload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import yao.util.param.Param;
import yao.util.string.StringUtil;

/**
 * @author wqg
 * 
 *         2013-9-12下午1:10:37
 */
public class Demo
{

	protected static TudouOAuth2 tudouOauth = new TudouOAuth2();
	
	protected static TudouUpload tudouUpload = new TudouUpload();
	
	protected static TudouVideoInfo tudouInfo = new TudouVideoInfo();
	
	protected static UploadUrlParams uploadUrlParams;

	public static void main(String[] args) throws OAuthException, SDKException,
			IOException, OAuthMessageSignerException,
			OAuthNotAuthorizedException, OAuthExpectationFailedException,
			OAuthCommunicationException
	{

		if (StringUtil.isTrimEmpty(OAuthClientConfig.APP_KEY))
		{
			System.out.println("未设置app_key： ");
			info();
			return;
		}
		if (StringUtil.isTrimEmpty(OAuthClientConfig.APP_SECRET))
		{
			System.out.println("未设置app_secret: ");
			info();
			return;
		}
		

		// 生成authorize请求的url
		// String url = tudouOauth.authorizeURL(new AuthorizeParams());
		String url = "https://api.tudou.com/oauth2/authorize?client_id=2a43a6e2271ab544&redirect_uri=http://xsaqjy.ljgps.net/TrafficPolice/page/admin/page/Manage.jsp&display=web";
		System.out.println("将下面的URL复制到浏览器，并完成授权操作: ");
		System.out.println(url);
		
		

		// 通过code 获得token
		String code = scan("输入code: ");
		

		// 通过token获得url
		AccessToken	 accessToken = tudouOauth.accessToken(new AccessTokenParams(code));
		String str = JSONUtils.toJsonString(accessToken);
		str = str.substring(2, str.length() - 3);
		String[] str2 = str.split(":");
		String[] str3 = str2[1].split(",");
		String access_token = str3[0].substring(1, str3[0].length() - 1);
		System.out.println("Token是：    "+access_token);
		tudouUpload.uploadUrl(new UploadUrlParams("life","生活",access_token,1,"2a43a6e2271ab544"));
		List<Param> params = new LinkedList<Param>();
		params.add(new Param("title", StringUtil.toString(uploadUrlParams.getTitle())));
		params.add(new Param("tags",StringUtil.toString(uploadUrlParams.getTags())));
		params.add(new Param("channelId", StringUtil.toString(uploadUrlParams.getChannelId())));
		params.add(new Param("access_token", StringUtil.toString(uploadUrlParams.getAccess_token())));
		params.add(new Param("app_key",StringUtil.toString(uploadUrlParams.getApp_key())));
		String jsonString = OAuthPost.post("http://api.tudou.com/v6/video/upload_url", params);
		UploadUrl uploadUrl = JSONUtils.parseObject(jsonString, UploadUrl.class);
		System.out.println(jsonString);
		String s = jsonString.toString();
		s = s.substring(2, str.length() - 3);
		String[] s2 = s.split(":");
		String[] s3 = s2[1].split(",");
		String itemCode = s3[0].substring(1, s3[0].length() - 1);
		tudouInfo.videoInfo(new VideoInfoParams("2a43a6e2271ab544",itemCode));

		
		

		// 销毁Token
		RevokeAccessToken revokeAccessToken = tudouOauth.revokeAccessToken(accessToken);
		System.out.println("销毁AccessToken: ");
		System.out.println(">" + JSONUtils.toJsonString(revokeAccessToken));
	}

	private static void info()
	{
		System.out.println("  1、如果您还未创建应用，请先在http://open.tudou.com/apps中创建应用");
		System.out.println("  2、如果您已经有tudou开放平台应用，请将应用的AppKey和AppSecret设置到tudou.oauth2-client.config.xml文件中。");
	}

	private static String scan(String label) throws IOException
	{
		System.out.print(label);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			return br.readLine();
		} finally
		{
			br.close();
		}
	}
}
