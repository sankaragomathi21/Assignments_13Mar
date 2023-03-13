package oops;

class Author {
	private String name;
	private String email;
	private char gender;
	
	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	String getName() {
		return this.name;
	}
	
	String getEmail() {
		return this.email;
	}
	
	char getGender() {
		return this.gender;
	}
}
	
class Book {
	String name;
	Author author;
	double price;
	int qtyInStock;
	
	Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	String getName() {
		return this.name;
	}
	
	Author getAuthor() {
		return this.author;
	}
	
	double getPrice() {
		return this.price;
	}
	
	int getQtyInStock() {
		return this.qtyInStock;
	}
	
	void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}

public class OOPS1 {

	public static void main(String[] args) {
		Author author = new Author("J.K Rowling", "jkrowling@gmail.com",'F');
		Book book = new Book("Harry Potter and Philosopher Stone", author, 599.99, 100);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getQtyInStock());
		System.out.println(author.getName());
		System.out.println(author.getEmail());
		System.out.println(author.getGender());
	}
}


