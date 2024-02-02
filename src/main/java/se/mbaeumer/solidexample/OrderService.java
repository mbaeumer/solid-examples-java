package se.mbaeumer.solidexample;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class OrderService {

    private final DbService dbService;

    public OrderService(DbService dbService) {
        this.dbService = dbService;
    }

    public void createOrder(Order order, Customer customer,
                            PaymentInstrument paymentInstrument){
        // do some validation

        // determine the expected delivery date
        Date expectedDelivery = order.calculateExpectedDeliveryDate();
        order.setExpectedDeliveryDate(expectedDelivery);

        // validate the payment (fraud check is performed in another method)
        paymentInstrument.validate();

        // save order to the database
        this.dbService.saveOrder(order);
    }

    public void cancelOrder(Order order){}

    public Order viewOrderDetails(Order order){return null;}

    public void changeOrder(Order order){}

    public List<Order> getOrdersByCustomer(Customer customer){return null;}

    public List<Order> getOrdersByCustomerAndDate(Customer customer, Date orderDate){return null;}
}