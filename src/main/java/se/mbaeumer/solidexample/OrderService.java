package se.mbaeumer.solidexample;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class OrderService {

    public void createOrder(Order order, Customer customer,
                            PaymentInstrument paymentInstrument){
        // do some validation

        // determine the expected delivery date
        Date expectedDelivery = order.calculateExpectedDeliveryDate();
        order.setExpectedDeliveryDate(expectedDelivery);

        // validate the payment (fraud check is performed in another method)
        paymentInstrument.validate();
    }

    public void cancelOrder(Order order){}

    public Order viewOrderDetails(Order order){return null;}

    public void changeOrder(Order order){}

    public List<Order> getOrdersByCustomer(Customer customer){return null;}

    public List<Order> getOrdersByCustomerAndDate(Customer customer, Date orderDate){return null;}
}