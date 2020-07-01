package restaurant;


import javax.print.attribute.standard.DateTimeAtProcessing;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){



    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Welcome to It Ain't No Good- Food Truck! " +
            " Menu for : "+ dtf.format(now));

    MenuItem menuItem = new MenuItem("Bob's Burger", "entree", "A big, beefy, cheesy delight", 29.99);
    System.out.println(menuItem);
    }








}
