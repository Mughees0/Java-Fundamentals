package models;

public class User {
	int userId;
	String UserName;
	
	Role role;
	
	public User(int userId, String UserName){
		this.userId = userId;
		this.UserName= UserName;
	}
	
	public enum Role {
		ADMIN,
		MEMBER,
	}
	
	public Role getRole () {
		return role;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getName() {
		return UserName;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setName(String name) {
		this.UserName = name;
	}
	
	
	@Override
	public String toString () {
		return "User{" +
							 "userId=" + userId +
							 ", UserName='" + UserName + '\'' +
							 ", role=" + role +
							 '}';
	}
}
