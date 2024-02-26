public class Library {
    private Book[] books;
    Library(){
        this.books = new Book[5];
    }

    @Override
    public String toString(){
        return "Total length : "+ this.books;
    }

    void addBook(Book book){
        int availableIndex = 0;
        boolean isSpaceAvailable = false;
        for(int i=0;i<this.books.length ;i ++) {
            if (this.books[i] == null) {
                isSpaceAvailable = true;
                availableIndex = i;
                break;
            }
        }
        if(isSpaceAvailable) {
            this.books[availableIndex] = book;
            System.out.println("Book added successfully");
        }else {
            System.out.println("No space available in Library to add new book.");
        }
    }

    void deleteBook(int bookId){
        boolean isBookExist = false;
        int bookIndex = 0;
        for(int j=0;j<this.books.length-1;j++){
            if(this.books[j] != null && this.books[j].getBookId() == bookId){
                bookIndex = j;
                isBookExist = true;
                break;
            }
        }

        if(isBookExist) {
            for (int k = bookIndex; k < this.books.length - 1; k++) {
                this.books[k] = this.books[k + 1];
            }
            System.out.println("Book deleted successfully.");
        }else{
            System.out.println("Book does not exist.");
        }
    }

    void displayBooks(){
        for(int i=0;i<this.books.length;i++){
            System.out.println(this.books[i]);
        }
    }

    void searchBook(int bookId){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i] != null && this.books[i].getBookId() == bookId){
                System.out.println("BookName : "+this.books[i].getTitle() +", BookId : "+this.books[i].getBookId()+";");
                break;
            }
            else{
                System.out.println("Book not found with id : " + bookId);
            }
        }
    }
}
