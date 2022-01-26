package technoserve.c2tc.b5;

import java.time.LocalDateTime;

import technoserve.c2tc.b5.Service.OrderService;
import technoserve.c2tc.b5.Service.OrderServiceImpl;
import technoserve.c2tc.b5.Service.UserService;
import technoserve.c2tc.b5.Service.UserServiceImpl;
import technoserve.c2tc.b5.entities.Order;
import technoserve.c2tc.b5.entities.User;
import technoserve.c2tc.b5.entities.Order.Paymentmode;

public class Client {
	public static void main(String[] args)  {
		OrderService os=new OrderServiceImpl();
		Order order=new Order();
		//create
		UserService us=new UserServiceImpl();
		User user = new User();
		user.setId(210121);
		user.setName("Lavanya");
		user.setType("Customer");
		user.setPassword("L2z");
		order.setId(210121);
		order.setDateOfpurchase(LocalDateTime.now());
		order.setTotal(1999);
		order.setCustomer("Lavanya");
		order.setShop("Trends");
	    order.setPayment(Paymentmode.ONLINEPAYMENT);
	    us.addUser(user);
		os.addOrder(order);

	         	//us.addUser(user);
				//Retrieve
				System.out.println("ID is: " + user.getId());
				System.out.println("Name is: " + user.getName());
				System.out.println("Type is: " + user.getType());
				System.out.println("Password is: " + user.getPassword());
				//update
				//us.updateUser(user);
				//System.out.println("Update is Succesfull");
				//Delete
			    // us.deleteUser(21034);
			   // System.out.println("Delete is Succesfull");
		
			   System.out.println("Id is: " + order.getId());
			   System.out.println("Customer: " + order.getCustomer());
			   System.out.println("Shop: " + order.getShop());
			   System.out.println("DateOfpurchase: " + order.getDateOfpurchase());
			   System.out.println("Total: " + order.getTotal());
			   System.out.println("Payment: " + order.getPayment());
	  
	  
	}
}