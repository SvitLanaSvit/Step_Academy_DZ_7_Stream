package org.example.task4;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProjectorDemo {
    private List<Projector> projectors;

    public ProjectorDemo(){
        projectors = new ArrayList<>();
        fillList();
    }

    private void fillList(){
        projectors.add(new Projector("Projector1", 2021, 500.0, "Sony"));
        projectors.add(new Projector("Projector2", 2020, 600.0, "Epson"));
        projectors.add(new Projector("Projector3", 2019, 800.0, "Panasonic"));
        projectors.add(new Projector("Projector4", 2022, 750.0, "Sony"));
        projectors.add(new Projector("Projector5", 2018, 700.0, "BenQ"));
    }

    private void showAllProjectors(){
        System.out.println("All Projectors:");
        projectors.forEach(System.out::println);
    }

    private void showProjectorsWithManufacturer(String specifiedManufacturer){
        System.out.println("\nProjectors from " + specifiedManufacturer + ":");
        projectors.stream()
                .filter(projector -> projector.getManufacturer().equals(specifiedManufacturer))
                .forEach(System.out::println);
    }

    private void showProjectorsWithCurrentYear(){
        Year currentYear = Year.now();
        int year = currentYear.getValue();
        System.out.println("\nProjectors from the year " + year + ":");
        projectors.stream()
                .filter(projector -> projector.getYearOfManufacture() == year)
                .forEach(System.out::println);
    }

    private void showProjectorWithPrice(double specifiedPrice){
        System.out.println("\nProjectors above $" + specifiedPrice + ":");
        projectors.stream()
                .filter(projector -> projector.getPrice() > specifiedPrice)
                .forEach(System.out::println);
    }

    private void showProjectorsSortedPrice(){
        System.out.println("\nProjectors sorted by ascending price:");
        projectors.stream()
                .sorted(Comparator.comparing(Projector::getPrice))
                .forEach(System.out::println);

    }

    private void showProjectorsSortedPriceDESC(){
        System.out.println("\nProjectors sorted by descending price:");
        projectors.stream()
                .sorted(Comparator.comparing(projector ->((Projector) projector).getPrice()).reversed())
                .forEach(System.out::println);

    }

    private void showProjectorsSortedYear(){
        System.out.println("\nProjectors sorted by ascending year of release:");
        projectors.stream()
                .sorted(Comparator.comparing(Projector::getYearOfManufacture))
                .forEach(System.out::println);

    }

    private void showProjectorsSortedYearDESC(){
        System.out.println("\nProjectors sorted by descending year of release:");
        projectors.stream()
                .sorted(Comparator.comparing(projector ->((Projector) projector).getYearOfManufacture()).reversed())
                .forEach(System.out::println);

    }

    public void getProjectorsFunctions(String specifiedManufacturer, double specifiedPrice){
        showAllProjectors();
        showProjectorsWithManufacturer(specifiedManufacturer);
        showProjectorsWithCurrentYear();
        showProjectorWithPrice(specifiedPrice);
        showProjectorsSortedPrice();
        showProjectorsSortedPriceDESC();
        showProjectorsSortedYear();
        showProjectorsSortedYearDESC();
    }
}
