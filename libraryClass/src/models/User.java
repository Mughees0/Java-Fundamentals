package models;

public class User {
	int userId;
	String name;
	
	
	public User(int userId, String name){
		this.name= name;
		this.userId= userId;
	}
	
	
	public int getUserId() {
		return userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
