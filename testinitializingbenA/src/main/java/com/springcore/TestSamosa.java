package com.springcore;

public class TestSamosa 
{
   private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public TestSamosa(double price) {
	super();
	this.price = price;
}

public TestSamosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "TestSamosam [price=" + price + "]";
}
public void init() 
{
	 System.out.println("inslied init method");
}
public void destory()
{
	System.out.println("inslied destory method"); 
}

   
}
