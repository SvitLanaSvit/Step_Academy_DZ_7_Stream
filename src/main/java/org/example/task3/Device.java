package org.example.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Device {
    private String name;
    private int yearOfManufacture;
    private double price;
    private String color;
    private String deviceType;

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", deviceType='" + deviceType + '\'' +
                '}';
    }
}
