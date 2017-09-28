package com.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Spring入门实例
 *
 * @description 
 *
 * @author liuhefei
 * @createDate 2017年9月25日
 */
public class MainApp {
	public static void main(String[] args) {
		//1. 写法1
		//加载配置文件   
		//使用ClassPathXmlApplicationContext() 来创建应用程序的上下文
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//使用上下文的getBean(id)方法来获取所需的bean，这个方法使用 bean 的 ID 返回一个最终可以转换为实际对象的通用对象。一旦有了对象，你就可以使用这个对象调用任何类的方法。
		/*HelloWorld obj1 = (HelloWorld) context.getBean("hello");
		HelloWorld obj2 = (HelloWorld) context.getBean("hello2");
	    obj1.getMessage();
	    obj2.getMessage();*/
	    
	    //写法2
		//利用框架提供的 XmlBeanFactory()去生成工厂 bean 以及利用 ClassPathResource()去加载 bean 配置文件。XmlBeanFactory()负责创建并初始化所有的对象，即在配置文件中提到的 bean。
	   /* XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
	    HelloWorld obj1 = (HelloWorld) factory.getBean("hello");
		HelloWorld obj2 = (HelloWorld) factory.getBean("hello2");
	    obj1.getMessage();
	    obj2.getMessage();*/
	    
	    //写法3      
	    //路径：D:\code\SpringMVC\HelloSpring\src
		//加载完指定路径下 bean 配置文件后，利用框架提供的 FileSystemXmlApplicationContext()去生成工厂 bean。FileSystemXmlApplicationContext()负责生成和初始化所有的对象，比如，所有在 XML bean 配置文件中的 bean。
	    ApplicationContext context = new FileSystemXmlApplicationContext("D:/code/SpringMVC/HelloSpring/src/beans.xml");
	    HelloWorld obj1 = (HelloWorld) context.getBean("hello");
		HelloWorld obj2 = (HelloWorld) context.getBean("hello2");
	    obj1.getMessage();
	    obj2.getMessage();
	}

}
