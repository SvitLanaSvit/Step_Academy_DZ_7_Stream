package org.example.task2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Завдання 2:
        //Для набору назви продуктів (продукти можуть повторюватися) потрібно:
        // Показати всі продукти
        // Показати всі продукти з назвою менше п’яти символів
        // Порахувати скільки разів зустрічається продукт, назву якого ввів користувач
        // Показати всі продукти, що починаються на задану букву
        // Показати всі продукти із категорії «Молоко»
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product to search: ");
        String userProductName = scanner.nextLine();

        System.out.print("Enter a letter to filter products starting with: ");
        String startingLetter = scanner.next();

        ProductDemo productDemo = new ProductDemo();
        productDemo.getProductsFunctions(userProductName, startingLetter, "Dairy");
    }
}
