package technoserve.c2tc.b5.Service;

import technoserve.c2tc.b5.entities.Order;

public interface OrderService {
public void addOrder(Order order);
public void updateOrder(Order order);
public long deleteOrder(long id);
public void searchOrder(long id);
//public String addItem(String item);
//public boolean cancelMall(long id);

}
