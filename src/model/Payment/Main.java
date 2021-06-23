package model.Payment;
import model.Customer;

import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main {
    public static void testPayment(Customer customer, double devices, FinalPayment fp){
        customer.setNewDev(devices);
        BigDecimal price = new BigDecimal( fp.finalPrice(customer)).setScale(2, RoundingMode.HALF_UP);;
        System.out.println( customer.getName() + " paga $"+  price + "  este mes.\n");
    }


    public static void main(String[] args) {
        Customer c1 = new Customer("Juan");
        Customer c2 = new Customer("Pedro");
        Customer c3 = new Customer("Monica");
        FinalPayment fp = new FinalPayment();
        PerDeviceModel ppf = new PerDeviceModel();
        ppf.setDiscount(new DeviceDiscount());
        fp.setPriceStrat(ppf);

        c1.setNewDev(105);
        c2.setNewDev(60);
        c3.setNewDev(3);

        System.out.println("---------------Mes 1---------------\n");
        System.out.println("Juan tiene 105 dispositivos:\n");
        testPayment(c1,105,fp);
        System.out.println("Pedro tiene 60 dispositivos:\n");
        testPayment(c2,60,fp);
        System.out.println("Monica tiene 3 dispositivos:\n");
        testPayment(c3,3,fp);

        System.out.println("---------------Mes 2---------------\n");
        System.out.println("Juan disminuye a 101 dispositivos:\n");
        testPayment(c1,101,fp);
        System.out.println("Pedro incrementa a 105 dispositivos:\n");
        testPayment(c2,105,fp);
        System.out.println("Monica incrementa a 7 dispositivos:\n");
        testPayment(c3,7,fp);

        System.out.println("---------------Mes 3---------------\n");
        System.out.println("Juan disminuye a 5 dispositivos:\n");
        testPayment(c1,5,fp);
        System.out.println("Pedro disminuye a 7 dispositivos:\n");
        testPayment(c2,7,fp);
        System.out.println("Monica mantiene 7 dispositivos:\n");
        testPayment(c3,7,fp);

    }
}
