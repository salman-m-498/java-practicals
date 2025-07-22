package com.salman;

public class Car
{
    private static int regCounter = 1001;
    private int regNumber;
    private Owner owner;
    private String plateNumber;
    private String color;
    private String brand;
    private String model;
    private double engineCapacity;
    private int year;

    public Car(Owner owner, String plateNumber, String color, String brand, String model, double engineCapacity, int year)
    {
        this.regNumber = regCounter++;
        this.owner = owner;
        this.plateNumber = plateNumber;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.year = year;
    }

    // Accessors
    public int getRegNumber() { return regNumber; }
    public Owner getOwner() { return owner; }
    public String getPlateNumber() { return plateNumber; }
    public String getColor() { return color; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getEngineCapacity() { return engineCapacity; }
    public int getYear() { return year; }

    @Override
    public String toString()
    {
        return String.format("%-6d%-20s%-12s%-12s%-8s%-6d%-10s%-10s%-14.6f",
            regNumber,
            "name: " + owner.getName(),
            owner.getIcNumber(),
            plateNumber,
            color,
            year,
            brand,
            model,
            engineCapacity
        );
    }
}