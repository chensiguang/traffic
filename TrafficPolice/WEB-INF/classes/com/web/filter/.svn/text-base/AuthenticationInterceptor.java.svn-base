package com.web.filter;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.web.system.Parameter;

public class AuthenticationInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5336102544111257962L;

	@SuppressWarnings("rawtypes")
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map map = invocation.getInvocationContext().getSession();
        Object user = map.get(Parameter.SESSION_KEY_USER);  
        if (user == null) {  
            // 如果session中没有当前用户信息，则终止调用action，并转向登录页面  
           // ActionSupport action = (ActionSupport) invocation.getAction();  
            //action.addActionMessage("您还没有登录或登录已经超过时限，请您重新登录！");  
            return Action.LOGIN;
        } else {  
            // 正常继续调用action  
            return invocation.invoke();  
        }  
	}

}
