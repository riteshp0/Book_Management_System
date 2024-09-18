import models.Bookorders;
import models.Books;
import models.Genre;
import models.Order;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Genre g1 = new Genre("Fiction","Best description");
        Genre g2 = new Genre("Biography","Best Biography");

        Books b1= new Books("Ready Player One","Test Author",999,false,g1);
        Books b2= new Books("Elon Musk","Elon",1999,true,g2);

        Bookorders b01 = new Bookorders(b1,2);
        Bookorders b02 = new Bookorders(b2,1);

        ArrayList<Bookorders> BookordersArrayList= new ArrayList<Bookorders>();
        BookordersArrayList.add(b01);
        BookordersArrayList.add(b02);

        Order o1= new Order(1234,null);
        Order o2= new Order(1444,null);

        o1.setBookorders(BookordersArrayList);
        o2.setBookorders(BookordersArrayList);




    }
}