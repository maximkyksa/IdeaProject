package TaskBook;

public interface IOBook {
    void addBook(Book book);
    int getByNumber();
    void deteleByNumber();
    int getCountByNymber();
    String getByAuthor();
    int getCountAllAuthor();
}
