public class Book {
	private long bookISBN;
	private String bookName;
	private double bookPrice;
	private String bookPublication;
	private String author;
	public Book() {
		
	}
	public Book(long bookISBN, String bookName, double bookPrice) {
		
		this.bookISBN = bookISBN;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		
	}
	public Book(long bookISBN, String bookName, String bookPublication, String author) {
		
		this.bookISBN = bookISBN;
		this.bookName = bookName;
		this.bookPublication=bookPublication;
		this.author = author;
		
	}
//	public void display() {
//		
//	}
	
	
	public long getISBN() {
		return bookISBN;
	}


	public void setISBN(long iSBN) {
		this.bookISBN = iSBN;
	}


	public String getName() {
		return bookName;
	}


	public void setName(String name) {
		this.bookName = name;
	}


	public double getPrice() {
		return bookPrice;
	}


	public void setPrice(double price) {
		this.bookPrice = price;
	}


	public String getPublication() {
		return bookPublication;
	}


	public void setPublication(String publication) {
		this.bookPublication = publication;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


}
