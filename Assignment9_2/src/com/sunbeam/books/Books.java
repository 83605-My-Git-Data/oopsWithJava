package com.sunbeam.books;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

enum Category{
	FICTION,SELF_HELP,HORROR,EDUCATIONAL;
}


public class Books implements Comparator<Books> {
	
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	private Category category;
	
	
	public Books(){
		
	}
	public Books(String isbn, double price, String authorName, int quantity, Category category) {
		
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
		this.category = category;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter ISBN ");
		isbn = sc.next();
		System.out.println("Enter Price ");
		price = sc.nextDouble();
		System.out.println("Enter AuthorName: ");
		authorName = sc.next();
		System.out.println("Enter Quantity ");
		quantity = sc.nextInt();
		String forCategory;
		System.out.println("Enter Category (FICTION,SELF_HELP,HORROR,EDUCATIONAL)");
		forCategory = sc.next().toUpperCase();
		Category cat = Category.valueOf(forCategory);
		category = cat;
		
		
		
		
	}


	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}
	
	
	@Override
	public int compare(Books o1, Books o2) {
		return o1.getCategory().name().compareTo(o2.getCategory().name());
	}
	
	
	

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Books))
			return false;
		Books other = (Books) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
	
	
	
	
	
	
	

}
