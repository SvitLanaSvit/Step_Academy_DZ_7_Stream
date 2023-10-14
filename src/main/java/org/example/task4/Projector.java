package org.example.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Projector {
    private String name;
    private int yearOfManufacture;
    private double price;
    private String manufacturer;

    @Override
    public String toString() {
        return "Projector{" +
                "name='" + name + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
