/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.web.system.Parameter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

import com.web.pojo.Admin;

/**验证用户是否重新登录
 * 
 * @author wqg
 *
 * 2013-11-5下午1:47:43
 */
public class SessionUserListener implements HttpSessionListener
{
	//key为sessionId，value为HttpSession  
    private static java.util.Map<String, HttpSession> sessionMap = new java.util.concurrent.ConcurrentHashMap<String, HttpSession>(500);  
    protected final Logger logger = Logger.getLogger(SessionUserListener.class);  
  
    /** 
    *  HttpSessionListener中的方法，在创建session 
    */  
    public void sessionCreated(HttpSessionEvent event) {  
  
    }  
      
    /** 
    * HttpSessionListener中的方法，回收session时,删除sessionMap中对应的session 
    */  
    public void sessionDestroyed(HttpSessionEvent event) {  
                  
            getSessionMap().remove(event.getSession().getId());  
          
    }  
  
    /** 
    *   得到在线用户会话集合 
    */  
    public static List<HttpSession> getUserSessions(){  
          
            List<HttpSession> list = new ArrayList<HttpSession>();  
            Iterator<String> iterator = getSessionMapKeySetIt();  
            while(iterator.hasNext()){  
                String key = iterator.next();  
                HttpSession session = getSessionMap().get(key);  
                list.add(session);  
            }  
            return list;  
  
    }  
    /** 
    *   得到用户对应会话map，key为用户ID,value为会话ID 
    */  
    //  
    public static Map<Long, String> getUserSessionMap(){  
  
            Map<Long, String> map = new HashMap<Long, String>();  
            Iterator<String> iter = getSessionMapKeySetIt();  
            while(iter.hasNext()){  
                String sessionId = iter.next();  
                HttpSession session = getSessionMap().get(sessionId);  
                Admin user = (Admin)session.getAttribute(Parameter.SESSION_KEY_USER);  
                if(user!=null){  
                    map.put(user.getId(), sessionId);  
                }  
            }  
            return map;  
    }  
      
      
    /** 
    *   移除用户Session 
    */  
    public synchronized static void removeUserSession(Long userId){  
      
            Map<Long, String> userSessionMap = getUserSessionMap();  
            if(userSessionMap.containsKey(userId)){  
                 String sessionId = userSessionMap.get(userId);  
                 getSessionMap().get(sessionId).invalidate();  
                 getSessionMap().remove(sessionId);  
            }  
  
    }  
      
  
    /** 
    *   增加用户到session集合中 
    */  
    public static void addUserSession(HttpSession  seccion){  
  
            getSessionMap().put(seccion.getId(), seccion);  
  
    }  
  
    /** 
    *   移除一个session 
    */  
    public static void removeSession(String sessionID){  
              
            getSessionMap().remove(sessionID);  
  
    }  
  
    public static boolean containsKey(String key){  
        return getSessionMap().containsKey(key);  
    }  
  
    /** 
     * 判断该用户是否已重复登录 
     * @param user 
     * @return 
     */  
    public synchronized static boolean checkIfHasLogin(Admin user){  
  
            Iterator<String> iter = getSessionMapKeySetIt();  
            while(iter.hasNext()){  
                String sessionId = iter.next();  
                HttpSession session = getSessionMap().get(sessionId);  
                Admin sessionuser = null;
				try
				{
					sessionuser = (Admin)session.getAttribute(Parameter.SESSION_KEY_USER);
				} catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
                if(sessionuser!=null){  
                	
                    if(sessionuser.getUserno().equals(user.getUserno())) return true;  
                }  
            }  
  
        return false;  
    }  
    /** 
    *           获取在线的sessionMap 
    */  
    public static Map<String, HttpSession> getSessionMap() {  
            return sessionMap;  
    }  
    /** 
    *       获取在线sessionMap中的SessionId 
    */  
    public static Iterator<String> getSessionMapKeySetIt() {  
        return getSessionMap().keySet().iterator();  
    }  
}
