package model;

public class Customer {
    String name;
    private double devices;
    private double newDevices;

    public Customer(String nam){
        name = nam;
    }

    public String getName(){return name;}
    public void setNewDev(double dev){
        devices = newDevices;
        newDevices = dev;
    }
    public double getNewDev(){return newDevices;}
    public double getDev(){return devices;}

}
