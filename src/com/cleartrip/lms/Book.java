package com.cleartrip.lms;

import java.util.List;

public class Book {
	private String title;
	String author;	
	boolean inCirculation;
	String borrowedUser;
	
	public Book(String title, String author ) {
		this.title = title;
		this.author = author;
		inCirculation = false;
				
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isInCirculation() {
		return inCirculation;
	}

	public void setInCirculation(boolean inCirculation) {
		this.inCirculation = inCirculation;
	}

	public String getBorrowedUser() {
		return borrowedUser;
	}

	public void setBorrowedUser(String borrowedUser) {
		this.borrowedUser = borrowedUser;
	}

	@Override
	public boolean equals(Object newBook) {
		if (newBook == this) {
			return true;
	    }
		if (!(newBook instanceof Book)) {
			return false;
	    }		
		Book book = (Book) newBook;
	    // Compare the data members and return accordingly 
		
		if ( title.equals(book.getTitle()) &&
				author.equals(book.getAuthor()))
			return true;    
	        
		return false;		
	}
	@Override
	public int hashCode() {
		int result = 0;
		result = title.hashCode() + author.hashCode();		
		return result;
	}
	@Override
	public String toString() {
		return String.format("Book [ title :"+title+ ", Author :"+author + "]");
	}
}
