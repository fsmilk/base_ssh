package cn.haha.emp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
	
	public static ApplicationContext context;
	static{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
