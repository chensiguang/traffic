package com.web.videoupload;

import com.web.videoupload.OpenException;

/**
 * OAuth异常类
 * 
 * @author myao
 */
public class OAuthException extends OpenException {

	private static final long serialVersionUID = 1093935942707101964L;

	public OAuthException(OAuthError errorInfo) {
		super(errorInfo);
	}

	public OAuthError getError() {
		return (OAuthError) super.getError();
	}

}