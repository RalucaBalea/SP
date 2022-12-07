package SPproiect;

public class DocumentManager {
	
	 private static DocumentManager instance = new DocumentManager();
	 private Book myBook;
	 
	 public static DocumentManager getInstance(){
	      return instance;
	   }
	 
	public Book getBook() {
		return this.myBook;
	}
	
	public void setBook() {
		this.myBook = myBook;
	}
	
	public void print() {
		
	}
	
	
	
	 
}
