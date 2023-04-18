public class Book {
    private String nameBook;
    private Author author;
    private int yearBook;
    public Book(String nameBook,Author author, int yearBook) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.author = author;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {return author;
    }
    public int getYearBook() {
        return yearBook;
    }

}
