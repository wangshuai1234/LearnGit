package cn.easymobi.jerry.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[]args) {
		//1.创建Spring的IOC容器对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获得对象
		HelloWorld hello=(HelloWorld) ctx.getBean("hello");
		//3.调用类的方法
		hello.hello();
	}
}
