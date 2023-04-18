package models;

import java.util.ArrayList;
import java.util.List;

public class Library {
	public List<Book> books;
	public List<User> users;
	
	public Library (){
		this.users= new ArrayList<User>();
		this.books= new ArrayList<Book>();
	}
	
	public void addBook(Book book){
		books.add(book);
	}
	public void removeBook(Book book){
		this.books.remove(book);
	}
	public void addUser(User user){
		this.users.add(user);
	}
	public void removeUser(User user){
		this.users.remove(user);
	}
	
	public List<Book> getAllBooks() {
		return this.books;
	}
	
	public List<User> getUsers() {
		return users;
	}
}
