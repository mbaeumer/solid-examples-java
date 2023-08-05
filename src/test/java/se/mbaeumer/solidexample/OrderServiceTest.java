package se.mbaeumer.solidexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void createOrder_Standard() {
        OrderService orderService = new OrderService();
        StandardOrder standardOrder = new StandardOrder();
        CreditCard creditCard = new CreditCard();
        orderService.createOrder(standardOrder, new Customer(), creditCard);
    }

    @Test
    void createOrder_Express() {
        OrderService orderService = new OrderService();
        ExpressOrder expressOrder = new ExpressOrder();
        CreditCard creditCard = new CreditCard();
        orderService.createOrder(expressOrder, new Customer(), creditCard);
    }

    @Test
    void createOrder_SuperExpress() {
        OrderService orderService = new OrderService();
        SuperExpressOrder superExpressOrder = new SuperExpressOrder();
        CreditCard creditCard = new CreditCard();
        orderService.createOrder(superExpressOrder, new Customer(), creditCard);
    }


}