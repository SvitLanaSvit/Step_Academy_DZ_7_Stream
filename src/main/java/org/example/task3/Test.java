package org.example.task3;

public class Test {
    public static void main(String[] args) {
        //Завдання 3:
        //Створіть клас Пристрій. Він повинен зберігати інформацію про назву пристрою, рік випуску, ціна, колір,
        //тип пристрою. Потрібно створити набір пристроїв і виконати наступні завдання:
        // Вивести всі пристрої
        // Вивести всі пристрої заданого кольору
        // Вивести всі пристрої заданого року випуску
        // Вивести всі прилади дорожче вказаної ціни
        // Вивести всі прилади заданого типу
        // Вивести всі прилади, чий рік випуску входить в заданий діапазон
        DeviceDemo deviceDemo = new DeviceDemo();
        String specifiedColor = "Black";
        int specifiedYear = 2020;
        double maxPrice = 600.0;
        String specifiedDeviceType = "Laptop";
        int startYear = 2019;
        int endYear = 2021;

        deviceDemo.getDevicesFunctions(specifiedColor, specifiedYear, maxPrice, specifiedDeviceType, startYear, endYear);
    }
}
