public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore bs=new BookStore();
		Book[] books=bs.getBooks();
		Book findingBook = bs.findBookById(books, 123);
		System.out.println(" book found");
		Book updatedBook = bs.updateBook(books, 456, 180);
		System.out.println("book updated");

	}
	
	public Book[] getBooks() {
		Book[] books = new Book[4];
		
		books[0] = new Book(123, "abc", "penguine", "Anamika" );
		books[1] = new Book(456, "pqr", "penguine", "Naina" );
		books[2] = new Book(789, "xyz", "penguine", "Sushmita" );
		books[3] = new Book(147, "stu", 240 );
		
		return books;
	}
Book findBookById(Book[] books, long ID){
		
		for(Book book : books){
			
			if(book.getISBN() == ID){
				return book;
			}
		}
		return new Book();
		
	}
Book updateBook(Book[] books, long ID, double price){
	
	for(Book book : books){
		
		if(book.getISBN() == ID){
			
			book.setPrice(price);
			
			return book;
		}
	}
	
	return new Book();
}

}
