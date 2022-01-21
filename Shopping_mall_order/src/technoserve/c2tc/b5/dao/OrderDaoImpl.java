package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.Order;

public class OrderDaoImpl implements OrderDao{
    EntityManager em;
	
	public OrderDaoImpl() {
		em=Configuration.getEntityManager();
	}

	@Override
	public void addOrder(Order order) {
		em.persist(order);
	
	}

	@Override
	public void updateOrder(Order order) {
		em.merge(order);

	}

	@Override
	public Order deleteOrder(long id) {
		Order order=getOrder(id);
		em.remove(order);
		return order;
	}

	@Override
	public Order getOrder(Long id) {
		Order order=em.find(Order.class, id);
		return order;
	}

	@Override
	public void startTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public Order searchOrder(long id) {
		Order order=em.find(Order.class, id);
		return order;
		
	}

	

}
