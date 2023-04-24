package models;

public class Book {
	private int id;
	private String title;
	private String author;
	private User borrowedBy;
	private boolean isAvailable;
	
	public Book(int id, String title, String author, boolean isAvailable){
		this.id = id;
		this.title= title;
		this.author = author;
		this.borrowedBy = null;
		this.isAvailable= isAvailable;
	}
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	public boolean getAvailable(){
		return isAvailable;
	}
	
	public void setBorrowedBy (User borrowedBy) {
		this.borrowedBy = borrowedBy;
	}
	
	public User getBorrowedBy () {
		return borrowedBy;
	}
	
	@Override
	public String toString () {
		return title + " "+ borrowedBy;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setAvailable(boolean available) {
		isAvailable = available;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	

}
