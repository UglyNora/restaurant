package restaurant;
//import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Menu {
    public static void main(String args[]){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Welcome to It Ain't No Good- Food Truck! " +
            " Menu for : "+ dtf.format(now));
    }
}
