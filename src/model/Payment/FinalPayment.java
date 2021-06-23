package model.Payment;

import model.Customer;

public class FinalPayment {
    IPrice priceStrat;

    public void setPriceStrat(IPrice pS) {
        this.priceStrat = pS;
    }

    public double finalPrice(Customer cust) {
        return priceStrat.provideAmount(cust);
    }
}
