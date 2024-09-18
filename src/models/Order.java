package models;

import java.util.ArrayList;

public class Order {

    int orderID;

    ArrayList<Bookorders> bookorders;

    public Order(int oderID, ArrayList<Bookorders> bookorders) {
        this.orderID = oderID;
        this.bookorders = bookorders;
    }

    public int getOderID() {
        return orderID;
    }

    public void setOderID(int oderID) {
        this.orderID = oderID;
    }

    public ArrayList<Bookorders> getBookorders() {
        return bookorders;
    }

    public void setBookorders(ArrayList<Bookorders> bookorders) {
        this.bookorders = bookorders;
    }
}
