package comm.example.bean;

//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//@ToString
public class Customer {
	private String customerID;
	private String customerName;
	private Address address;
	public Customer(String customerID, String customerName, Address address) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.address = address;
	}
	
	
	public Customer(String customerName, Address address) {
	
		this.customerName = customerName;
		this.address = address;
	}

	public Customer() {
		super();
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", address=" + address + "]";
	}


	
	

}
