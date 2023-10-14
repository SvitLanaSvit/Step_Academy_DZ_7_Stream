package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class DeviceDemo {
    private final List<Device> devices;

    public DeviceDemo(){
        devices = new ArrayList<>();
        fillList();
    }

    private void fillList(){
        devices.add(new Device("Device1", 2021, 500.0, "Black", "Phone"));
        devices.add(new Device("Device2", 2019, 800.0, "Silver", "Laptop"));
        devices.add(new Device("Device3", 2020, 400.0, "White", "Tablet"));
        devices.add(new Device("Device4", 2021, 900.0, "Black", "Phone"));
        devices.add(new Device("Device5", 2019, 700.0, "Silver", "Laptop"));
    }

    private void showAllDevices(){
        System.out.println("All devices: ");
        devices.forEach(System.out::println);
    }

    private void showDevicesWithColor(String specifiedColor){
        System.out.println("\nDevices with color '" + specifiedColor + "':");
        devices.stream()
                .filter(device -> device.getColor().equals(specifiedColor))
                .forEach(System.out::println);
    }

    private void showDevicesWithYear(int specifiedYear){
        System.out.println("\nDevices manufactured in the year " + specifiedYear + ":");
        devices.stream()
                .filter(device -> device.getYearOfManufacture() == specifiedYear)
                .forEach(System.out::println);
    }

    private void showDevicesWithPrice(double maxPrice){
        System.out.println("\nDevices with a price more than or equal to $" + maxPrice + " retained.");
        devices.stream()
                .filter(device -> device.getPrice() > maxPrice)
                .forEach(System.out::println);
    }

    private void showDevicesWithType(String specifiedDeviceType){
        System.out.println("\nDevices of type '" + specifiedDeviceType + "':");
        devices.stream()
                .filter(device -> device.getDeviceType().equals(specifiedDeviceType))
                .forEach(System.out::println);
    }

    private void showDevicesWithStartYearEndYear(int startYear, int endYear){
        System.out.println("\nDevices manufactured from " + startYear + " to " + endYear + ":");
        devices.stream()
                .filter(device -> device.getYearOfManufacture() > startYear && device.getYearOfManufacture() < endYear)
                .forEach(System.out::println);
    }

    public void getDevicesFunctions
            (String specifiedColor, int specifiedYear, double maxPrice, String specifiedDeviceType, int startYear, int endYear){
        showAllDevices();
        showDevicesWithColor(specifiedColor);
        showDevicesWithYear(specifiedYear);
        showDevicesWithPrice(maxPrice);
        showDevicesWithType(specifiedDeviceType);
        showDevicesWithStartYearEndYear(startYear, endYear);
    }
}
