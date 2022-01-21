package technoserve.c2tc.b5;

import java.time.LocalDateTime;

import technoserve.c2tc.b5.Service.OrderService;
import technoserve.c2tc.b5.Service.OrderServiceImpl;
import technoserve.c2tc.b5.entities.Order;
import technoserve.c2tc.b5.entities.Order.Paymentmode;

public class Client {
	public static void main(String[] args)  {
		OrderService os=new OrderServiceImpl();
		Order order=new Order();
		order.setId(1421);
		order.setDateOfpurchase(LocalDateTime.now());
		order.setTotal(299);
		order.setCustomer("Amith");
		order.setShop("KFC");
	    order.setPayment(Paymentmode.ONLINEPAYMENT);
		os.updateOrder(order);

	   System.out.println("Id is: " + order.getId());
	   System.out.println("Customer: " + order.getCustomer());
	   System.out.println("Shop: " + order.getShop());
	   System.out.println("DateOfpurchase: " + order.getDateOfpurchase());
	   System.out.println("Total: " + order.getTotal());
	   System.out.println("Payment: " + order.getPayment());
	  
	  
	}
}