package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Item;
import entities.Order;
import entities.Restaurant;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Item item1, item2, item3;
        item1 = new Item("Rice", 11.50, 50);
        item2 = new Item("Salad", 10.0, 15);
        item3 = new Item("Steak", 25.0, 70);

        Restaurant restaurant1 = new Restaurant("GoodFood", "Grove Street", "22331122");
        restaurant1.addItemMenu(item1);
        restaurant1.addItemMenu(item2);
        restaurant1.addItemMenu(item3);

        System.out.println(restaurant1.getMenu());

        Order newOrder1 = new Order("Bob");
        Order newOrder2 = new Order("Lisa");

        newOrder1.addItem(item1);
        newOrder1.addItem(item2);      
        newOrder1.addItem(item3);

        newOrder2.addItem(item1);
        newOrder2.addItem(item1);      
        newOrder2.addItem(item2);

        restaurant1.addOrder(newOrder1);
        restaurant1.addOrder(newOrder2);
        
        System.out.println(restaurant1.getOrders());
        System.out.println();


        System.out.println();

        

        sc.close();
    }
    
}
