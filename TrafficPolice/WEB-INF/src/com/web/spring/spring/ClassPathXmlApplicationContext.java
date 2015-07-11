package com.web.spring.spring;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class ClassPathXmlApplicationContext implements BeanFactory {

	private Map<String, Object> beans = new HashMap<String, Object>(); 	// 先搞一个容器
	
	public ClassPathXmlApplicationContext() throws Exception { 	//IOC: Inverse of control; DI: Dependency Injection
		SAXBuilder sb = new SAXBuilder();
		Document doc = sb.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml")); 	//构造文档对象
		Element root = doc.getRootElement(); 	//获取根元素
		List list = root.getChildren("bean"); 	//获取名字为bean的所有元素
		for(int i = 0; i < list.size(); i ++) {
			Element element = (Element) list.get(i);
			String id = element.getAttributeValue("id");
			String clazz = element.getAttributeValue("class");
			Object o = Class.forName(clazz).newInstance(); 	// 实例化配置文件中的class
			beans.put(id, o);
			for(Element propertyElement : (List<Element>) element.getChildren("property") ) {
				String name = propertyElement.getAttributeValue("name");
				String bean = propertyElement.getAttributeValue("bean");
				Object beanObject = beans.get(bean);	 // 获取beans里面已经实例化的类的对象
				String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
				Method m = o.getClass().getMethod(methodName, beanObject.getClass().getInterfaces()[0]);
//				System.out.println("o = "+o);
//				System.out.println(beanObject);
				m.invoke(o, beanObject);
			}
		}
	}
	@Override
	public Object getBean(String id) {
		return beans.get(id);
	}

}
