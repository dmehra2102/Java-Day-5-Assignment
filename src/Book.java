public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(int bookId, String title, String author, boolean isAvailable){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString(){
        return "{ book : "+ this.title + ", id : " + this.bookId + "}";
    }

    public int getBookId() {
        return this.bookId;
    }

    public String getAuthor() {
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public boolean getIsAvailable(){
        return this.isAvailable;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
}
