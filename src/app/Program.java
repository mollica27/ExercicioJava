package app;

import java.util.Locale;
import java.util.Scanner;

import entities.OrderItem;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       Product p = new Product("TV", 1000.0);
       OrderItem oi1 = new OrderItem();


    }
}
