package se.mbaeumer.solidexample;

import java.util.Date;
import java.util.List;

public class Order {
    private Long id;
    private List<OrderItem> orderItems;

    private Customer customer;

    private Date orderDate;

    private Date expectedDeliveryDate;


}
