package technoserve.c2tc.b5;

import technoserve.c2tc.b5.Service.UserService;
import technoserve.c2tc.b5.Service.UserServiceImpl;
import technoserve.c2tc.b5.entities.User;

public class Client1 {
	public static void main(String[] args) {
		UserService us=new UserServiceImpl();
		//create
		User user = new User();
		user.setId(2103);
		user.setName("Rakesh");
		user.setType("Customer");
		user.setPassword("c2z");
		//us.addUser(user);
		//Retrieve
		System.out.println("ID is: " + user.getId());
		System.out.println("Name is: " + user.getName());
		System.out.println("Type is: " + user.getType());
		System.out.println("Password is: " + user.getPassword());
		//update
		us.updateUser(user);
		System.out.println("Update is Succesfull");
		//Delete
	   // us.deleteUser(21034);
	    System.out.println("Delete is Succesfull");
	
	}

}