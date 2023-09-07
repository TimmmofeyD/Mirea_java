
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Poem", 900);
        book.display_info();
    }
}


class Book {
    String name;
    int pages;

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        System.out.println("\nBook object was created");
    }

    void display_info() {
        System.out.printf("Book name: %s \tPages: %d\n", this.name, this.pages);
    }
}