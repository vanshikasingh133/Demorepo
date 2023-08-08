package arraylab.model;

public class Books {
		private int bookId;
		private String bookName;
		private float bookPrice;
		
		public Books() {
		}
		
		public Books(int bookId, String bookName, float bookPrice) {
			this.bookId=bookId;
			this.bookName=bookName;
			this.bookPrice=bookPrice;
		}
		
		public void setBookId(int bookId) {
			this.bookId=bookId;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookName(String bookName) {
			this.bookName=bookName;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookPrice(float bookPrice) {
			this.bookPrice=bookPrice;
		}
		public float getBookPrice() {
			return bookPrice;
		}
		
		@Override
		public String toString() {
			return "Book ID:" + bookId + "Book Name:" + bookName + "Book Price:" + bookPrice;
		}

	}