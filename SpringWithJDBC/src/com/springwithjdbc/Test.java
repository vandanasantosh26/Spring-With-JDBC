package com.springwithjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	//	Employee e1 = new Employee();
		//e1.setId(1001);
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-employapplication.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(1001,"Amit",40000.0f));  
	    //int status=dao.deleteEmployee(e1);
	    System.out.println(status);  	

	}
}
