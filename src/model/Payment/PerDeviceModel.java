package model.Payment;

import model.Customer;

public class PerDeviceModel implements IPrice{
    double baseAmount = 0;
    IDiscount discount = new DeviceDiscount();

    @Override
    public void setBaseAmount(double amt) {
        if(amt < 6){baseAmount = 0;}
        else if(amt >= 6 && amt <= 49){baseAmount = 0.10 * amt;}
        else if(amt >= 50 && amt <= 99){baseAmount = 0.07 * amt;}
        else if(amt >= 100){baseAmount = 0.05 * amt;}
    }

    @Override
    public double provideAmount(Customer cust) {
        setBaseAmount(cust.getNewDev());
        return baseAmount + discount.calcDiscount(baseAmount, cust);
    }

    public void setDiscount(IDiscount disc) {
        discount = disc;
    }


}
