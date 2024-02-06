package Module2;

import java.util.Scanner;

class Book {
	private String bookName;
	private int ISBN;
	private String authorName;
	private String publisher;
	
public Book(String bookName,int ISBN,String authorName,String publisher){
this.bookName=bookName;
this.ISBN=ISBN;
this.authorName=authorName;
this.publisher=publisher;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}

public void setISBN(int ISBN) {
	this.ISBN = ISBN;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}

public String getBookName() {
	return bookName;
}

public int getISBN() {
	return ISBN;
}
public String getAuthorName() {
	return authorName;
}

public String getPublisher() {
	return publisher;
}

public String getBookInfo() {
	return "Book Name: " + bookName + "\nISBN: " + ISBN + "\nAuthor Name: " + authorName + "\nPublisher: " + publisher;
}
}

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Number of books (N): ");
		int N = scanner.nextInt();
		scanner.nextLine();

		Book[] books = new Book[N];

		for (int i=0; i<N; i++) {
			System.out.println("Details for Book " + (i+1) + ":");
			System.out.print("Book Name: ");
			String bookName=scanner.nextLine();
			System.out.print("ISBN: ");
	int ISBN = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Author Name: ");
			String authorName = scanner.nextLine();
			System.out.print("Publisher: ");
			String publisher = scanner.nextLine();

			books[i] = new Book(bookName, ISBN, authorName, publisher);
		}

		for(int i=0;i<N;i++)
			{
				System.out.println("Book " + (i+1) + " Information:");
				System.out.println(books[i].getBookInfo());
			}
			}
}
