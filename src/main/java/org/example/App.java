package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Candy candy1 = new Candy("\"Мишка на севере\"", 79.99, 100, "молочный");
        Candy candy2 = new Candy("\"Сникерс\"", 49.99, 60, "белый");
        Marmelade marmelade1 = new Marmelade("\"Акварель\"", 60.00, 150, "апельсиновый");
        Marmelade marmelade2 = new Marmelade("\"Акварель\"", 60.00, 150, "лесные ягоды");


        Sweets[] box = {candy1, candy2, marmelade1, marmelade2};

        double totalWeight = 0;
        double totalPrice = 0;

        for (Sweets someSweets : box) {
            totalWeight += someSweets.getWeight();
            totalPrice += someSweets.getPrice();
        }

            System.out.println("Сладкий подарок:");
            for (Sweets someSweets : box
            ) {
                System.out.println(someSweets.toString());
            }
            System.out.println("");
            System.out.println("Общий вес подарка: " + totalWeight + " г");
            System.out.println("Общая стоимость подарка: " + totalPrice + " руб.");

        }
    }


