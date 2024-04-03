package com.learning.core.day1session1;

public class Book {
	private String title;
	private double price;
	
	//Constructor
	public Book(Sting title, double price)
	{
		this.title = title;
		this.price = price;
	}
	
	//Getter and Setter methods
	public String getTitle() {
		return title();
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

}
