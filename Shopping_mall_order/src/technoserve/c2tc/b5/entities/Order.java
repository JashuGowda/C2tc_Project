package technoserve.c2tc.b5.entities;


import java.time.LocalDateTime;

//import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order1")
public class Order {
	@Id
	private long Id;
	private LocalDateTime dateOfpurchase;
	private float Total;
	//private List<String>Customers;
	public enum Paymentmode{CASH , ONLINEPAYMENT};
	@Enumerated(EnumType.STRING)
	private Paymentmode payment;
	private String Customer;
	private String Shop;
	
public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public LocalDateTime getDateOfpurchase() {
		return dateOfpurchase;
	}

	public void setDateOfpurchase(LocalDateTime dateOfpurchase) {
		this.dateOfpurchase = dateOfpurchase;
	}

	public float getTotal() {
		return Total;
	}

	public void setTotal(float total) {
		Total = total;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}


	public String getShop() {
		return Shop;
	}

	public Paymentmode getPayment() {
		return payment;
	}

	public void setPayment(Paymentmode payment) {
		this.payment = payment;
	}

	public void setShop(String shop) {
		Shop = shop;
	}

	/* public List<String> getCustomers() {
		return Customers;
	}

	public void setCustomers(List<String> customers) {
		Customers = customers;
	} */


}

	
	
	
	
	
	