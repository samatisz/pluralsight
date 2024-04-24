package com.Pluralsight;
import java.util.Scanner;
import java.util.ArrayList;

public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(1, "potato", 1.27));
        inventory.add(new Product(2, "pierogi's", 8.87));
        inventory.add(new Product(3, "kartoffel pfannkuchen", 12.50));
        inventory.add(new Product(4, "waffle fries", 6.99));
        inventory.add(new Product(5, "aligot", 39.97));
        return inventory;
    }

}

