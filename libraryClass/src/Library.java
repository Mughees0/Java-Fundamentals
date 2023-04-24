import exceptions.BookNotFoundException;
import managers.UserManager;
import models.Book;
import managers.BookManager;
import models.User;

import java.util.List;


public class Library {
	public static void main(String[] args) {
		UserManager users = new UserManager ();
		BookManager books = new BookManager ();
		Book book1 = new Book (1,"To Kill a Mockingbird", "Harper Lee",true);
		Book book2 = new Book(2,"1984", "George Orwell",true);
		Book book3 = new Book(3,"The Catcher in the Rye", "J.D. Salinger",true);
		// Add some books to the library
		books.addOne (book1);
		books.addOne (book2);
		books.addOne (book3);
		
		
		User user1 = new User (1,"mughees");
		users.addOne(user1);
		
		try {
			books.borrowOne(book3,user1);
		}catch(BookNotFoundException e){
			System.out.println(e.getMessage());
		}
		
//		try {
//			books.returnBook(book3,user1);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println (books.getBooks ());
		List<Book> allBooks = books.getBooks ();
		for (Book book : allBooks) {
			System.out.println(book);
		}
	}
}