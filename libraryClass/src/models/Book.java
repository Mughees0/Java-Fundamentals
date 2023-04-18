package models;

public class Book {
	private int id;
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(int id, String title, String author, boolean isAvailable){
		this.id = id;
		this.title= title;
		this.author = author;
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
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setAvailable(boolean available) {
		isAvailable = available;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void borrowBook(Book book){
		if(this.id == book.id && this.isAvailable){
			this.isAvailable = false;
			System.out.println(this.title+" is now borrowed");
		}else {
			System.out.println("The book is already borrowed");
		}
	}
	public void returnBook(Book book){
		if (this.id == book.id && !this.isAvailable){
			this.isAvailable = true;
			System.out.println(this.title+" is now returned");
		} else {
			System.out.println("The book is already returned");
		}
	}
}
