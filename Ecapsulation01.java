class BankAccount{
//declaring private variable to prevent direct access 	
	private int bal;

//to give controlled access getters and setters are used 
//	to set and get data.
	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
	  	if (bal > 0) {
			this.bal = bal;
		} else {
			System.out.println("Inavalid Data");
			System.exit(0);
		}
	}
	
}

class Customer{
	private int cId;
	private String cName;
	private long cNum;
	
	public Customer(int cId, String cName, long cNum) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cNum = cNum;
	}
	public Customer() {
		cId =2;
		cName = "Alex";
		cNum = 9876543210L;
	}
	public int getcId() {
		return cId;
	}
	public String getcName() {
		return cName;
	}
	public long getcNum() {
		return cNum;
	}	
	
}

public class Ecapsulation01 {

	public static void main(String[] args) {
//		BankAccount	Class
//		BankAccount ba = new BankAccount();
//		ba.setBal(-10000);
//		System.out.println(ba.getBal());
	
//		Customer Class
		Customer c = new Customer(1, "Rohit", 9588697458L);
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
		Customer c1 = new Customer();
		System.out.println(c1.getcId());
		System.out.println(c1.getcName());
		System.out.println(c1.getcNum());
	}

}
