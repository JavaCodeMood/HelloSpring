package com.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Spring����ʵ��
 *
 * @description 
 *
 * @author liuhefei
 * @createDate 2017��9��25��
 */
public class MainApp {
	public static void main(String[] args) {
		//1. д��1
		//���������ļ�   
		//ʹ��ClassPathXmlApplicationContext() ������Ӧ�ó����������
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ʹ�������ĵ�getBean(id)��������ȡ�����bean���������ʹ�� bean �� ID ����һ�����տ���ת��Ϊʵ�ʶ����ͨ�ö���һ�����˶�����Ϳ���ʹ�������������κ���ķ�����
		/*HelloWorld obj1 = (HelloWorld) context.getBean("hello");
		HelloWorld obj2 = (HelloWorld) context.getBean("hello2");
	    obj1.getMessage();
	    obj2.getMessage();*/
	    
	    //д��2
		//���ÿ���ṩ�� XmlBeanFactory()ȥ���ɹ��� bean �Լ����� ClassPathResource()ȥ���� bean �����ļ���XmlBeanFactory()���𴴽�����ʼ�����еĶ��󣬼��������ļ����ᵽ�� bean��
	   /* XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
	    HelloWorld obj1 = (HelloWorld) factory.getBean("hello");
		HelloWorld obj2 = (HelloWorld) factory.getBean("hello2");
	    obj1.getMessage();
	    obj2.getMessage();*/
	    
	    //д��3      
	    //·����D:\code\SpringMVC\HelloSpring\src
		//������ָ��·���� bean �����ļ������ÿ���ṩ�� FileSystemXmlApplicationContext()ȥ���ɹ��� bean��FileSystemXmlApplicationContext()�������ɺͳ�ʼ�����еĶ��󣬱��磬������ XML bean �����ļ��е� bean��
	    ApplicationContext context = new FileSystemXmlApplicationContext("D:/code/SpringMVC/HelloSpring/src/beans.xml");
	    HelloWorld obj1 = (HelloWorld) context.getBean("hello");
		HelloWorld obj2 = (HelloWorld) context.getBean("hello2");
	    obj1.getMessage();
	    obj2.getMessage();
	}

}
