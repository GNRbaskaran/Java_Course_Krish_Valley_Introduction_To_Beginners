package Java_Constructor_Of_A_Class;

//a class Account of a bank.
class Account{
	private String name;  //name of the account holder
	private String accNo; //account number of the person
	private double balance; //balance in that account
	
	public Account() { //non-parametrized constructor
//		this.name = "";
//		this.accNo = "";
//		this.balance = 0.0;
		this("","",0.0);
	}
	
	public Account(String n, String id, Double b) { //parametrized constructor to directly assign values
		this.name = n; //set blank string as name
		this.accNo = id;
		this.balance = b;
	}
	
	public void setDetails(String n, String id) {
		name = n;
		accNo = id;
	}
	
	public void depositMoney(Double money) {
	balance += money;  //add money with the current balance and update balance
	}
	
	public void getDetails() {
		System.out.println("The Name Of The Account Holder: " + name);
		System.out.println("Account Number: " + accNo);
		System.out.println("Balance: " + balance);
		System.out.println();
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Account acc1 = new Account(); //non-parametrized constructor will mark
		Account acc2 = new Account("Jhon", "0123", 500D); //parametrized constructor will mark
		
		//set details for account 1
		acc1.setDetails("Gaurav", "0112");
		acc1.depositMoney(6000D);
		
		//display the account details
		System.out.println("Details of account 1: ");
		acc1.getDetails();
		System.out.println("Details of account 2: ");
		acc2.getDetails();
	}

}
