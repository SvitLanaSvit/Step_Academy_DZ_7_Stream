package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class ProductDemo {
    private List<Product> products;

    public ProductDemo(){
        products = new ArrayList<>();
        fillList();
    }

    private void fillList(){
        products.add(new Product("Milk", "Dairy"));
        products.add(new Product("Bread", "Bakery"));
        products.add(new Product("Cheese", "Dairy"));
        products.add(new Product("Apple", "Fruit"));
        products.add(new Product("Egg", "Dairy"));
        products.add(new Product("Bread", "Bakery"));
        products.add(new Product("Juice", "Beverage"));
    }

    private void showProducts(){
        System.out.println("All products: ");
        products.forEach(System.out::println);
        System.out.println();
    }

    private void showProductsWithLessLetters(){
        System.out.println("Products with a name less than five characters:");
        products.stream()
                .filter(prod -> prod.getName().length() < 5)
                .forEach(System.out::println);
    }

    private void showProductsWithName(String userProductName){
        long userProductCount = products.stream()
                .filter(prod -> prod.getName().equals(userProductName))
                .count();
        System.out.println("\nCount of " + userProductName + ": " + userProductCount);
    }

    private void showProductsWithFirstLetter(String letter){
        System.out.println("\nProducts starting with '" + letter + "':");
        products.stream()
                .filter(prod -> prod.getName().toLowerCase().startsWith(letter.toLowerCase()))
                .forEach(System.out::println);
    }

    private void showProductsByCategory(String category){
        System.out.println("\nProducts in the 'Milk' category:");
        products.stream()
                .filter(prod -> prod.getCategory().equals(category))
                .forEach(System.out::println);
    }

    public void getProductsFunctions(String userProductName, String letter, String category){
        showProducts();
        showProductsWithLessLetters();
        showProductsWithName(userProductName);
        showProductsWithFirstLetter(letter);
        showProductsByCategory(category);
    }
}
