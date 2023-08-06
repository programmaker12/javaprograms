package com.tns.jpacurd.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import javax.persistence.Query;

import com.tns.jpacurd.entities.Book;

import java.util.List;

public class BookDaoImpl implements BookDao {
	
	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	
	@Override
	public Book getBookById(int id) 
	{
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	
	@Override
	public List<Book> getBookByTitle(String title) {
		String qStr = "SELECT book FROM Book book WHERE book.title LIKE :ptitle";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("ptitle", "%"+title+"%");
		return query.getResultList();
	}


	@Override
	public Long getBookCount() {
		String qStr = "SELECT COUNT(book.id) FROM Book book";
		TypedQuery<Long> query = entityManager.createQuery(qStr,Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	
	@Override
	public List<Book> getAuthorBooks(String author) {
		String qStr = "SELECT book FROM Book book WHERE book.author=:pAuthor";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("pAuthor", author);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	
	@Override
	public List<Book> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks");
		//@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	@Override
	public List<Book> getBooksInPriceRange(double low,double high) {
		String qStr = "SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	/*public List<Book> updatePrice(double price) {
		Query query = entityManager.createQuery( "update Book SET price=:price where id>01");
		query.setParameter("price", price);
		
		//@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		query.executeUpdate();
		return bookList;
	}*/
	
	


}
