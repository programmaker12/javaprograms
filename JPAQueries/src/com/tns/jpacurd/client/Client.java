package com.tns.jpacurd.client;

import com.tns.jpacurd.entities.Book;
import com.tns.jpacurd.service.BookService;
import com.tns.jpacurd.service.BookServiceImpl;
 

public class Client {
     
	public static void main(String [] args) {
        
		
		BookService service = new BookServiceImpl();
		
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 105*************");
		System.out.println("Book with ID 105:"+service.getBookById(05));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing book written by Tom Rio*************");
		for(Book book:service.getAuthorBooks("KK") ) {
			System.out.println(book);
		}
		
		System.out.println("************Listing book on JavaFullstack*************");
		for(Book book:service.getBookByTitle("History")) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing All books between 500 and 800*************");
		for(Book book:service.getBooksInPriceRange(20, 60) ) {
			System.out.println(book);
		}
		
		
		
		

	}
	}

