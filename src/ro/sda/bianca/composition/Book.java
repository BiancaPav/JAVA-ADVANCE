package ro.sda.bianca.composition;

public class Book {
    private String titleOfBook;
    private Author author;
    private double price;

    public Book(String titleOfBook, Author author, double price) {
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.price = price;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfBook='" + titleOfBook + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }
}



