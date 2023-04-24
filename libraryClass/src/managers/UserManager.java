package managers;

import models.User;

import java.util.ArrayList;

public class UserManager {
	ArrayList<User> users = new ArrayList<> ();
	
	public void addOne(User user){
		users.add (user);
	}
	
	public ArrayList<User> getUsers () {
		return users;
	}
	
	public void setUsers (ArrayList<User> users) {
		this.users = users;
	}
	
}
