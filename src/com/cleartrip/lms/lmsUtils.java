package com.cleartrip.lms;

import java.util.List;
import java.util.Set;

public class lmsUtils {
	public static void showOptions() {
		System.out.println("1. Add Book \n "
				+"2. Add User \n"
				+"3. Borrow Book \n"				
				+"Any Other Char to Quit");
	}
	public static boolean validateBookDetails(String[] details)
	{
		boolean valid = true;
		
		int detLen = details.length;
		
		if (detLen < 2)
			return false;
		
		String bookTitle = details[0];
		String bookAuthor = details[1];
		
		if( bookTitle.isEmpty() || bookAuthor.isEmpty())
			return false;
		
		if ( detLen > 2) {
			try {
				String strNumCopies = details[2];
				
				int numOfCopies = Integer.parseInt(strNumCopies.trim());
				System.out.println(numOfCopies);
			}catch( NumberFormatException NFE) {
				System.out.println(NFE.getMessage());
				valid = false; 
			}
		}			
		return valid;
	}
	
	public static void diplayBooks(List<Book> listBooks) {
		System.out.println("Total Num OF books in library :"+ listBooks.size());
		for(Book curBook: listBooks) {
			System.out.println(curBook);
		}
	}
	public static void printUsers(Set<LibraryUser> setUsers) {
		System.out.println("Total num of Users : " + setUsers.size());
		for(LibraryUser libUser: setUsers) {
			System.out.println(libUser);
		}
		
	}

}
