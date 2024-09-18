package models;

public class Books {

   String name;

   String author;

    int price;

    boolean is_discounted;

    Genre genre;

    public Books(String name, String author, int price, boolean is_discounted, Genre genre) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.is_discounted = is_discounted;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIs_discounted() {
        return is_discounted;
    }

    public void setIs_discounted(boolean is_discounted) {
        this.is_discounted = is_discounted;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
