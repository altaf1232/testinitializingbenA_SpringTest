package com.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestPespsi implements InitializingBean,DisposableBean
{
  private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public TestPespsi() {
	super();
	// TODO Auto-generated constructor stub
}

public TestPespsi(double price) {
	super();
	this.price = price;
}

@Override
public String toString() {
	return "TestPespsi [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
}

public void init() throws Exception {
	// TODO Auto-generated method stub
	
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	
}
  

}
