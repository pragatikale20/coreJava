package entities;

import java.util.ArrayList;
import java.util.List;

public class BookAraayList {

	public static void main(String[] args) {
		List<Books> bookList = new ArrayList<>();
		bookList.add(new Books(0, "Book1"));
		bookList.add( new Books(1, "Book2"));
		bookList.add( new Books(2, "Book3"));

     	//Books book1 = bookList.get(0);
		//System.out.println(book1);
		
		//System.out.println(bookList);
		
		//bookList.stream().forEach(book -> System.out.println(book));
		bookList.stream().forEach(System.out::println);
		
	}
}
