package se.mbaeumer.solidexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void createOrder_Standard() {
        OrderService orderService = new OrderService();
        StandardOrder standardOrder = new StandardOrder();
        orderService.createOrder(standardOrder, new Customer());
    }

    @Test
    void createOrder_Express() {
        OrderService orderService = new OrderService();
        ExpressOrder expressOrder = new ExpressOrder();

        orderService.createOrder(expressOrder, new Customer());
    }

    @Test
    void createOrder_SuperExpress() {
        OrderService orderService = new OrderService();
        SuperExpressOrder superExpressOrder = new SuperExpressOrder();
        orderService.createOrder(superExpressOrder, new Customer());
    }


}