package com.sunbeam.books;

import java.awt.Choice;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Program01 {
	
	
	//Q1. Store book details in a library in hashing based data structure : HashSet
	//Book details : isbn(string), category(enum), price(double), authorName(string), quantity(int) . 
	//Unique ID : isbn


	public static void main(String[] args) {
		HashSet<Books> books = new HashSet<>();
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		Category[]arr = Category.values();
		
		for(Category cat:arr) {
			System.out.println(cat.ordinal()+"-"+cat.name());
		}
		
		
		
		int choice;
		
		do {
			
			System.out.println("Press 0 : To Exit");
			System.out.println("Press 1 : To Add a book");
			System.out.println("Press 2 : To Display all books");
			System.out.println("Press 3 : To Sort books by category");
			System.out.println("Press 4 : To Sort books by author");
			System.out.println("Press 5 : To Search book by id");
			 choice = scanner.nextInt();
			 
			 switch (choice) {
			case 0:
			{
				System.out.println("Thanks");
				
			}
			break;
			
			case 1:
			{
				Books bookObject = new Books();
				bookObject.accept(scanner);
				books.add(bookObject);
			
			}
			break;
			
			case 2:
			{
				for (Books books2 : books) {
					System.out.println(books2);
				}
			
			}
			break;
			
			case 3:
			{
				ArrayList<Books> list = new ArrayList<>(books);
				
				class sortBookByCat implements Comparator<Books> {

					@Override
					public int compare(Books o1, Books o2) {
						int value = o1.getCategory().name().compareTo(o2.getCategory().name());
						return value;
					}
					
					
				}
				
				Comparator<Books> bksComparator = new sortBookByCat();
				
				list.sort(bksComparator);
				
				for (Books books2 : list) {
					System.out.println(books2);
				}
				
				
			}
			break;
			
			case 4:
			{
				ArrayList<Books> list = new ArrayList<>(books);
				
				class sortBookbyAuthor implements Comparator<Books>{

					@Override
					public int compare(Books o1, Books o2) {
						int value = o1.getAuthorName().compareTo(o2.getAuthorName());
						return value;
						
					}
					
				}
				
				Comparator<Books> bksComparator = new sortBookbyAuthor();
				
				list.sort(bksComparator);
				
				for (Books books2 : list) {
					System.out.println(books2);
				}
			}
			break;
			
			
			case 5:
			{
				ArrayList<Books> list = new ArrayList<>(books);
				
				System.out.println("Enter isbn you want to search for: ");
				String n = scanner.next();
				
				Books bk = new Books();
				bk.setIsbn(n);
				
				boolean flag = false;
				for(int i = 0 ;i<list.size();i++) {
					if (bk.getIsbn().equals(list.get(i).getIsbn())) {
						System.out.println("Book found..!");
						System.out.println(list.get(i));   
						flag = true;
					}
					else if(flag!= true) {
						System.out.println("book do not exists");
					}
				}
				
				
				
			}
			break;

			default:
				break;
			}
			
			
			
		} while (choice!=0);

	}

}
