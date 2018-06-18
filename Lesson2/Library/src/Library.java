import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
        super();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> findBooksByAuthor(String author){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> findBooksByPublishing(String publishing){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getPublishing().equals(publishing)){
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> findBooksAfterYear(int year){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getYear() >= year){
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
