
import java.util.ArrayList;
public class Library {
public ArrayList<Book> books;
public ArrayList<User> users;

public Library(){
    this.books = new ArrayList<Book>();
    this.users = new ArrayList<User>();
}

public void addBook(Book book){
    books.add(book);
}
public void removeBook(Book book){
    books.remove(book);
}
public void addUser(User user){
    users.add(user);
}
public void removeUser(User user){
    users.remove(user);
}

    public ArrayList<Book> getAllBooks() {
        return this.books;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
