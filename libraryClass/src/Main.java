import models.Book;
import models.User;
import models.Library;

import java.util.List;


public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		
		// Add some books to the library
		library.addBook(new Book (1,"To Kill a Mockingbird", "Harper Lee",true));
		library.addBook(new Book(2,"1984", "George Orwell",true));
		library.addUser(new User (0,"Mughees"));
		Book book1 = new Book(3,"The Catcher in the Rye", "J.D. Salinger",true);
		library.addBook(book1);
		book1.borrowBook(book1);
		
		List<Book> books = library.getAllBooks();
		for (Book book : books) {
			System.out.println(book.getAvailable());
		}
	}
}