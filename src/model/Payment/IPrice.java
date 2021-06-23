package model.Payment;

import model.Customer;

public interface IPrice {
    public void setBaseAmount(double amt);
    public double provideAmount(Customer cust);

}
