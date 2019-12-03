package com.company.builder;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class BuilderTes {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("Non Veg Meal: ");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());

    }
}
