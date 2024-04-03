package com.learning.core.day1session1;

public class D01P01 {

	public static void main(String[] args) {
		// Method to create a Book Object
		
		public static Book createBook(String title, double price) {
			return new Book(title, price);
		}
		
		//Method to display Book details
		public static void showBook(Book book) {
			System.out.println("Book Title: " + book.getTitle() + "and Price: " + book.getPrice());
		}
		

}
