import java.util.Scanner;
public class banking {
	
	public static void main(String args[]) {
		BankAccount obj1=new BankAccount("Prajit Paul","125");
		obj1.display();
	}

}

class BankAccount{
	int balance;
	int previousTransaction;
	String customer;
	String customerID;
	char option;
	BankAccount(String cname,String cid)
	{
		customer=cname;
		customerID=cid;
	}
	
	void deposit(int amount) {
		if(amount!=0)
			balance=balance+amount;
			previousTransaction=amount;	
	}

void withdraw(int amount) {
	if(amount!=0) {
		balance=balance-amount;
		previousTransaction=amount;
	}
}
void getPreviousTrasaction() {
	if(previousTransaction>0) {
		System.out.println("Deposited:- Rs. "+previousTransaction);
	}
	else if(previousTransaction<0) {
		System.out.println("Withdrawn:- Rs. "+Math.abs(previousTransaction));
	}
	else {
		System.out.println("No Transactions Occured");
	}
}
void display() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome "+customer);
	System.out.println("Your Bank ID is: "+customerID);
	System.out.println("\n");
	System.out.println("----------------------------------------------------------------");
	System.out.println("A. Check Balance");
	System.out.println("B. Deposit");
	System.out.println("C. Withdraw");
	System.out.println("D. Previous Transaction");
	System.out.println("E. Exit");
	option=sc.next().charAt(0);
	System.out.println("\n");
	System.out.println("Enter an Option");
	System.out.println("******************************************************************");
	do {
		switch(option)
	{
	case 'A':
		System.out.println("Balance= Rs."+balance);
		break;
	case 'B':
		System.out.println("Enter amount to be deposited");
		int deposit=sc.nextInt();
		System.out.println("Deposit amount= Rs."+deposit);
		break;
	case 'C':
		System.out.println("Enter amount to be withdraw");
		int withdraw=sc.nextInt();
		System.out.println("Deposit amount= Rs."+withdraw);
		break;
	case 'D':
		System.out.println("Previous Transaction");
		getPreviousTrasaction();
		break;
	case 'E':
		System.out.println("Have a good day ahead");
		break;
		
		default:
			System.out.println("Invalid Option!!! Try Again");
			break;
	}
	
}
	while(option!='E');
	System.out.println("Thanks for using our services..See you again !");
	System.out.println("******************************************************************");
	
}
}