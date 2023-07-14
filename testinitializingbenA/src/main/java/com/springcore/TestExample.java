package com.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestExample 
{
   private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public TestExample() {
	super();
	// TODO Auto-generated constructor stub
}

public TestExample(String subject) {
	super();
	this.subject = subject;
}

@Override
public String toString() {
	return "TestExample [subject=" + subject + "]";
}
    //here is create your annotation
   //but yah annotation <dependency> sa chalega aapko jakar search karna huga googel ma postConstract spring phir aapko java+
   //wala annotation used karna huga aapkey pom.xml file ma
  @PostConstruct
  public void init()  
  {
	 System.out.println("this is init method"); 
  }
  @PreDestroy
  public void destory() 
  {
	  System.out.println("this is your destory method");
  }

}
