package models;

public class Bookorders {

    int quantity;
    Books books;


    public Bookorders(Books books, int quantity) {

        this.quantity = quantity;
        this.books = books;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
