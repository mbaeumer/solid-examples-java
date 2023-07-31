package se.mbaeumer.solidexample;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class OrderService {

    public void createOrder(Order order, Customer customer){
        // do some validation


        // determine the expected delivery date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (order.getOrderType() == OrderType.EXPRESS){
            calendar.add(Calendar.DAY_OF_MONTH, 3);
        }else if (order.getOrderType() == OrderType.SUPEREXPRESS){
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }else{
            calendar.add(Calendar.DAY_OF_MONTH, 7);
        }

        order.setExpectedDeliveryDate(calendar.getTime());
        // save order data to the database


    }

    public void cancelOrder(Order order){}

    public Order viewOrderDetails(Order order){return null;}

    public void changeOrder(Order order){}

    public List<Order> getOrdersByCustomer(Customer customer){return null;}

    public List<Order> getOrdersByCustomerAndDate(Customer customer, Date orderDate){return null;}
}