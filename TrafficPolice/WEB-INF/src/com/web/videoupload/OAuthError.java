package com.web.videoupload;

import com.web.videoupload.ErrorInfo;

/**
 * OAuth错误类
 * 
 * @author myao
 */
public class OAuthError extends ErrorInfo {

	private static final byte module = 1;

	public OAuthError(byte type, short value, String info) {
		super(module, type, value, info);
	}

	public OAuthError(int code, String info) {
		super(code, info);
	}

}
