package entities;

public class Books {
private int bookId;
private String bookName;

public Books(int bookId , String bookName) {
	this.bookId = bookId;
	this.bookName = bookName;
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String toString() {
return ("BookId : " + bookId + "   Book Name : " + bookName);
}

public boolean eqauls(Object obj) {
	if(obj == null) {
	         return false;
	}
	if(this.getClass() != obj.getClass())
	{
	return false;
	}
	return false;
}
}
	

