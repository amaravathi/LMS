package com.cleartrip.lms;

public class LibraryUser {
	
	String userName;
	String[] borrowedBooks;
	
		
	public LibraryUser(String userName) {
		this.userName = userName;
	}
	
	@Override
	public int hashCode() {
		return userName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
	    }
		if (!(obj instanceof LibraryUser)) {
			return false;
	    }		
		LibraryUser newUser = (LibraryUser) obj;
	    // Compare the data members and return accordingly 
		
		if (userName.equals(newUser.getUserName()))
			return true;
	        
		return false;	
		
	}
	@Override
	public String toString() {
		return String.format(" userDetails [user : "+ userName+ " ]");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String[] getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(String[] borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
}
