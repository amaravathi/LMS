package com.cleartrip.lms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter below mentioed options to LMS");
		
		lmsUtils.showOptions();
		
	
	List<Book> listBooks = new ArrayList<Book>();
	
	
	Set<LibraryUser> setUsers = new HashSet<LibraryUser>();
	
		
	Scanner scanner = new Scanner(System.in);
	int option = scanner.nextInt();
	scanner.nextLine();
	
	 while (option != 4 ) {
		 		 
		 switch(option) {
		 
		 case 1:
		 {	
			 System.out.println("String format : The Alchemist, Paul Cohelo");
			 scanner.nextLine();			 
			 String bookDetailsString = scanner.nextLine();
			 String[]  details = bookDetailsString.split(",");			 
			 
			// boolean valid = lmsUtils.validateBookDetails(details);
			 
			 
				  Book newBook = new Book(details[0], details[1]);
				
				  listBooks.add(newBook);			 	
				 
				 System.out.println("Book Added "+ listBooks.get(listBooks.size()-1));
			 			 
			 lmsUtils.showOptions();
			 option = scanner.nextInt();
		 }
		 break;
		 case 2 :
		 {
			 System.out.println("Add User : <userName>");
			 scanner.nextLine();
			 String userName = scanner.nextLine();
			 LibraryUser libUser = new LibraryUser(userName);
			 
			 if (setUsers.contains(libUser))
				 System.out.println("user already existing");
			 else {
				 	setUsers.add(libUser);
				 	System.out.println("user Added "+ libUser);
			 }
			 
			 lmsUtils.showOptions();
			 option = scanner.nextInt();
		 }
		 break;
		 case 3:
		 {
			 System.out.println("Enter which book to borrow title");
			 String  bookDetailsString  = scanner.nextLine();
			 String[]  details = bookDetailsString.split(",");		 
			 		 
			 Book book = new Book(details[0], details[1]);
			 
			 if (listBooks.contains(book)) {
				 Book issueBook = listBooks.get( listBooks.indexOf(book));
				 //check whether it's in circulation or not
				 if ( ! issueBook.isInCirculation() )
					 issueBook.setInCirculation(true);
			 }
					 
			 
			 lmsUtils.showOptions();
			 option = scanner.nextInt();
			 
		 }
		 break;
		 default:
		 {
			System.out.println("opted to quit");
			System.exit(0);
		 }
		 break;
	  }
		 
	 }
		
}
	
}
