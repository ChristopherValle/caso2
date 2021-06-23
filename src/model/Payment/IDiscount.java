package model.Payment;

import model.Customer;

public interface IDiscount {
    public double calcDiscount(double amt, Customer cust);
}
