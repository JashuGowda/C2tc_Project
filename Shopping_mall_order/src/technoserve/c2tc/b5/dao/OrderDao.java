package technoserve.c2tc.b5.dao;

import technoserve.c2tc.b5.entities.Order;

public interface OrderDao {
	public void addOrder(Order order);
	public Order getOrder(Long id);
	public void updateOrder(Order order);
    public Order searchOrder(long id);
    public Order deleteOrder(long id);
    public void startTransaction();
	public void endTransaction();
   
}
