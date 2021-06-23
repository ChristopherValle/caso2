package model.Payment;

import model.Customer;

public class DeviceDiscount implements IDiscount{
    @Override
    public double calcDiscount(double amt, Customer cust) {
        if(cust.getDev() > cust.getNewDev()){return amt * 0.25;}
        else if(cust.getDev() < cust.getNewDev()){return -amt * 0.05;}
        else {return 0;}
    }
}
