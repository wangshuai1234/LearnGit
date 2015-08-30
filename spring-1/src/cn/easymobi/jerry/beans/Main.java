package cn.easymobi.jerry.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[]args) {
		//1.����Spring��IOC��������
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC�����л�ö���
		HelloWorld hello=(HelloWorld) ctx.getBean("hello");
		//3.������ķ���
		hello.hello();
	}
}
