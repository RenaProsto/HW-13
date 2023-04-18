import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + author +
                ", yearBook=" + yearBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearBook);
    }
}