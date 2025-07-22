package com.salman;

public class Owner 
{
    private String name;
    private String icNumber;
    
    public Owner(String name, String icNumber) {
        this.name = name;
        this.icNumber = icNumber;
    }

    @Override
    public String toString()
    {
    return "name: " + name + "\t" + icNumber;
    }

    public String getName() {
        return name;
    }

    public String getIcNumber() {
        return icNumber;
    }
}