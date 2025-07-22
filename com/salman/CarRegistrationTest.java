package com.salman;
public class CarRegistrationTest 
{
    public static void main(String[] args) {
        Car[] cars = 
        {
            new Car(new Owner("John Wayne", "111111111"), "ABC123", "BLUE", "Toyota", "Vios", 1.5, 2010),
            new Car(new Owner("Bea Arthur", "222222222"), "WEA888", "RED", "Nissan", "Teana", 2.0, 2010),
            new Car(new Owner("Jane Doe",   "444444444"), "C1118", "GREEN", "Toyota", "Vios", 1.5, 2012),
            new Car(new Owner("Ad Johnson", "555555555"), "TV798", "BLUE", "Toyota", "Vios", 1.5, 2012)
        };

        // Print header with alignment
        System.out.printf("%-6s%-20s%-12s%-12s%-8s%-6s%-10s%-10s%-14s%n",
            "Reg#", "Name", "IcNumber", "PlateNumber", "Color", "Year", "Brand", "Model", "EngineCapacity");
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Print each car with alignment
        int regNo = 1001;
        for (Car car : cars)
        {
            Owner owner = car.getOwner();
            System.out.printf("%-6d%-20s%-12s%-12s%-8s%-6d%-10s%-10s%-14.6f%n",
                regNo++,
                "name: " + owner.getName(),
                owner.getIcNumber(),
                car.getPlateNumber(),
                car.getColor(),
                car.getYear(),
                car.getBrand(),
                car.getModel(),
                car.getEngineCapacity()
            );
        }
    }
}