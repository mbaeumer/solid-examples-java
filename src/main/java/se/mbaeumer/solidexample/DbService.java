package se.mbaeumer.solidexample;

public interface DbService {

    public void saveOrder(Order order);

    void deleteOrder(Order order);

    void updateOrder(Order order);

    public void getAllOrders();

    public void getOrderById(Long id);
}
