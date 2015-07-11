package com.web.videoupload;

import yao.config.Config;

/**
 * 程序配置类（使用了yao-config框架）
 * 
 * @author wqg
 */
public abstract class Conf {

	/** 配置工具 */
	protected static final Config config;

	static {
		try {
			config = new Config("classpath:com/web/videoupload/tudou.open.config.xml");
		} catch (Exception ex) {
			throw new RuntimeException("Error in init.", ex);
		}
	}

	/**
	 * 得到配置工具对象
	 * 
	 * @return
	 */
	public static Config getConfig() {
		return config;
	}
}
