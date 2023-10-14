package org.example.task1;

import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //Завдання 1:
        //Для набору випадково згенерованих цілих чисел потрібно:
        // Кількість додатних
        // Кількість від’ємних
        // Кількість двозначних
        // Кількість дзеркальних чисел. Наприклад, 121 або 4224
        Random random = new Random();

        List<Integer> randomNumbers = random.ints(100, -100, 100).boxed().toList();
        System.out.println("Random Numbers: " + randomNumbers);

        long positiveCount = randomNumbers.stream()
                .filter(num -> num > 0)
                .count();
        long negativeCount = randomNumbers.stream()
                .filter(num -> num < 0)
                .count();
        long doubleDigitCount = randomNumbers.stream()
                .filter(num -> num > 9 && num < 100)
                .count();
        long mirrorNumberCount = randomNumbers.stream()
                .filter(num -> isMirrorNumber(num))
                .count();

        System.out.println("Number of positive integers: " + positiveCount);
        System.out.println("Number of negative integers: " + negativeCount);
        System.out.println("Number of double-digit integers: " + doubleDigitCount);
        System.out.println("Number of mirror numbers: " + mirrorNumberCount);
    }

    private static boolean isMirrorNumber(int number) {
        String numStr = String.valueOf(number);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }
}
