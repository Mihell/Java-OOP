/*
Написать классы:
        Book (книга).
        Свойства: название, автор, издательство, год издания, количество страниц, цена, тип переплета.
        Library (библиотека).
        Свойства: список книг.
        Методы:
        поиск книг заданного автора
        поиск книг, выпущенных заданным издательством
        поиск книг, выпущенных после заданного года
        Клиентский класс LibraryRunner: протестировать функционал предыдущих классов.
*/

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book()
            .setAuthor("Tolkien")
            .setBinding("rough")
            .setPagesAmount(300)
            .setPrice(200)
            .setPublishing("Kyivdruk")
            .setTitle("Lord of the rings")
            .setYear(1948));
        library.addBook(new Book()
            .setAuthor("Tolkien")
            .setBinding("rough")
            .setPagesAmount(150)
            .setPrice(100)
            .setPublishing("Soyuzpechat")
            .setTitle("Hobbit")
            .setYear(1936));
        library.addBook(new Book()
            .setAuthor("Lukas")
            .setBinding("light")
            .setPagesAmount(250)
            .setPrice(150)
            .setPublishing("Soyuzpechat")
            .setTitle("Star Wars")
            .setYear(1980));
        System.out.println("books after 1950: " + library.findBooksAfterYear(1950));
        System.out.println("books of Tolkien: " + library.findBooksByAuthor("Tolkien"));
        System.out.println("books from Soyuzpechat: " + library.findBooksByPublishing("Soyuzpechat"));

    }
}

/*out:
books after 1950: [Book{Star Wars', author='Lukas', publishing='Soyuzpechat', year=1980, pagesAmount=250, price=150, binding='light'}
]
books of Tolkien: [Book{Lord of the rings', author='Tolkien', publishing='Kyivdruk', year=1948, pagesAmount=300, price=200, binding='rough'}
, Book{Hobbit', author='Tolkien', publishing='Soyuzpechat', year=1936, pagesAmount=150, price=100, binding='rough'}
]
books from Soyuzpechat: [Book{Hobbit', author='Tolkien', publishing='Soyuzpechat', year=1936, pagesAmount=150, price=100, binding='rough'}
, Book{Star Wars', author='Lukas', publishing='Soyuzpechat', year=1980, pagesAmount=250, price=150, binding='light'}
]

Process finished with exit code 0
*/
