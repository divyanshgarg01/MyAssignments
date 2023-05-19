package Streams

import java.util.scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fruit{
    private String name;
    private int calories;
    private int price;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit(String name, int calories, int price, String color){
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

}
public class question1{
    public static List<String> reverseSort(ArrayList<Fruit> fruits){
        return fruits.stream()
                .filter(fruit -> fruit.getCalories() < 100)
                .sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .map(Fruit::getName)
                .collect(Collectors.toList());
    }

    public static Map<String, List<String>> groupFruitsByColor(ArrayList<Fruit> fruits) {
        return fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getColor, Collectors.mapping(Fruit::getName, Collectors.toList())));
    }

    public Static List<String> sortRedFruitsByPrice(ArrayList<Fruit> fruits){
        return fruits.stream()
                .filter(fruit -> fruit.getColor().equalsIgnoreCase("red"))
                .sorted(Comparator.ComparingInt(Fruit::getPrice))
                .map(Fruit::getName)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", 120, 2, "Red"));
        fruits.add(new Fruit("Banana", 90, 1, "Yellow"));
        fruits.add(new Fruit("Strawberry", 70, 3, "Red"));
        fruits.add(new Fruit("Grape", 80, 2, "Green"));

        // Display the fruit names of low calories fruits (calories < 100) sorted in descending order of calories.
        List<String> lowCaloriesFruits = reverseSortLowCaloriesFruits(fruits);
        System.out.println("Low Calories Fruits: " + lowCaloriesFruits);

        // Display color-wise list of fruit names.
        Map<String, List<String>> fruitsByColor = groupFruitsByColor(fruits);
        System.out.println("Fruits By Color: " + fruitsByColor);

        // Display only RED color fruits sorted as per their price in ascending order.
        List<String> redFruitsSortedByPrice = sortRedFruitsByPrice(fruits);
        System.out.println("Red Fruits Sorted by Price: " + redFruitsSortedByPrice);
    }
}