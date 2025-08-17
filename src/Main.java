public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Данте", " Агильери");
        Author author2 = new Author("Уилки", " Коллинз");

        Book book1 = new Book(author1, "Божественная комедия", 1308);
        Book book2 = new Book(author2, "Лунный камень", 1868);

        book1.setPublicationYear(1321);

        System.out.println("Книга 1: " + book1.getTitleBook() + ", автор: " + book1.getAuthor().getFirstName() + book1.getAuthor().getLastName() + ", год публикации: " + book1.getPublicationYear());
        System.out.println("Книга 2: " + book2.getTitleBook() + ", автор: " + book2.getAuthor().getFirstName() + book2.getAuthor().getLastName() + ", год публикации: " + book2.getPublicationYear());

        System.out.println("author1: " + author1);
        System.out.println("author2: " + author2);
        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);

        System.out.println("author1.equals(author1): " + author1.equals(author1));
        System.out.println("author1.equals(author2): " + author1.equals(author2));
        System.out.println("book1.equals(book1): " + book1.equals(book1));
        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book2.equals(book1): " + book2.equals(book1));

        System.out.println("author1.hashCode(): " + author1.hashCode());
        System.out.println("author2.hashCode(): " + author2.hashCode());
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
    }
}
