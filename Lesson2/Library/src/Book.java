public class Book {
    private String title;
    private String author;
    private String publishing;
    private int year;
    private int pagesAmount;
    private int price;
    private String binding;

    public Book() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublishing() {
        return publishing;
    }

    public Book setPublishing(String publishing) {
        this.publishing = publishing;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Book setYear(int year) {
        this.year = year;
        return this;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public Book setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Book setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getBinding() {
        return binding;
    }

    public Book setBinding(String binding) {
        this.binding = binding;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                title + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", pagesAmount=" + pagesAmount +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}' + '\n';
    }
}
