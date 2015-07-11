package com.web.filter;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.web.system.Parameter;

/**
 * 用户登录过滤器
 * @author lixuli
 *
 */
public class LoginFilter implements Filter {
     
    /** 检查不通过时，转发的URL */
    private String forwardUrl;
	
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String servletPath = request.getServletPath();
        
        Object sessionObj = request.getSession().getAttribute(Parameter.SESSION_KEY_USER);
        
        // 如果Session为空，则跳转到指定页面
        if (sessionObj == null) {
            String contextPath = request.getContextPath();
            String redirect = servletPath + "?" + StringUtils.defaultString(request.getQueryString());
            String url = contextPath + StringUtils.defaultIfEmpty(forwardUrl, "/")
                    + "?redirect=" + URLEncoder.encode(redirect, "UTF-8");
            response.sendRedirect(url);
		} else {
		    chain.doFilter(req, res);
		}
	}

	@Override
	public void init(FilterConfig cfg) throws ServletException {
		
        forwardUrl = cfg.getInitParameter("forwardUrl");
	}

}
