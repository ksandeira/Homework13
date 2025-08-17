import java.util.Objects;

public class Book {
    private final Author author;
    private final String titleBook;
    private int publicationYear;

    public Book(Author author, String titleBook, int publicationYear) {
        this.author = author;
        this.titleBook = titleBook;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + Objects.toString(author) +
                ", titleBook='" + Objects.toString(titleBook, "") + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(author, book.author) &&
                Objects.equals(titleBook, book.titleBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, titleBook, publicationYear);
    }
}
