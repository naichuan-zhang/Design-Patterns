package com.company.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println(", Packing: " + item.packing());
            System.out.println(", Price: " + item.price());
        }
    }
}
