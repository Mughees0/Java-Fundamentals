package exceptions;

public class BookNotFoundException extends RuntimeException {
	public BookNotFoundException(String Msg){
		super(Msg);
	}
}
