package managers;

import exceptions.BookNotFoundException;
import models.Book;
import models.User;

import java.util.ArrayList;
import java.util.Iterator;

public class BookManager {
	ArrayList<Book> books = new ArrayList<> ();
	
	public void removeByTitle(String title){
		boolean bookFound = false;
		Iterator<Book> iterator = books.iterator ();
		while (iterator.hasNext ()){
			Book currentBook = iterator.next ();
			if (currentBook.getTitle ().equals (title)){
	//			books.remove (currentBook);
				iterator.remove ();
				bookFound = true;
				break;
			}
		}
		if (!bookFound){
			throw new BookNotFoundException (title + "Not found");
		}
	}
	
	public void addOne(Book book){
		books.add (book);
	}
	
	public void removeOne(Book book){
		books.remove (book);
	}
	
	public ArrayList<Book> getBooks(){
		return books;
	}
	
	public void borrowOne(Book toBeBook, User user){
		boolean foundFlag = false;
		for (Book book : books){
			if (book.getTitle ().equals (toBeBook.getTitle ())){
				book.setBorrowedBy (user);
				book.setAvailable (false);
				foundFlag = true;
				break;
			}
		}
		if (!foundFlag){
			throw new BookNotFoundException (toBeBook.getTitle()+" Not found");
		}
	}
	public void returnBook(Book returnBook, User user){
		boolean foundFlag = false;
		for (Book book : books){
			if (book.getTitle ().equals (returnBook.getTitle ())&& user.equals(book.getBorrowedBy())){
				book.setBorrowedBy (null);
				book.setAvailable (true);
				foundFlag = true;
				break;
			}
		}
		if (!foundFlag){
			throw new BookNotFoundException (returnBook.getTitle()+" Not found");
		}
	}
	
}
