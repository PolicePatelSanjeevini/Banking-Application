import java.util.Scanner;
class BankOp{
	private int AccNo;
	private String Name;
	private float Balance;
	
	BankOp(int AccNo,String Name,float Balance){
		this.AccNo=AccNo;
		this.Name=Name;
		this.Balance=Balance;
	}
	
	public void Deposit(int amt) {
		if(amt>0) {
			this.Balance+=amt;
			System.out.println("Deposit successfully.");
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public void Withdraw(int amt) {
		if(amt<=Balance && amt>0) {
			this.Balance-=amt;
			System.out.println("Withdraw successfully");
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public float getBalance() {
		return this.Balance;	
	}
	public void getDetails() {
		System.out.println("AccNo displayed: "+AccNo);
		System.out.println("Account holder Name: "+Name);
		System.out.println("Balance displayed: "+Balance);
		
	}
	
}
public class BankApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Create an account: ");
		System.out.println("Enter account number: ");
		int AccNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder name: ");
		String Name=sc.nextLine();
		System.out.println("Enter initial balance: ");
		float Bal=sc.nextFloat();
		BankOp obj=new BankOp(AccNo, Name, Bal);
		System.out.println("---------------------Bank Menu-----------------");
		int choice;
		do {
			System.out.println("1.Deposit 2.Withdraw 3.getBalance 4.getDetails 5.Exit");
			System.out.println("Enter a choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter Amount to Deposit: ");
			       int amt=sc.nextInt();
			       obj.Deposit(amt);
			       break;
			case 2:System.out.println("Enter Amount to withdraw: ");
		           int amt1=sc.nextInt();
		           obj.Withdraw(amt1);
		           break;
			case 3:System.out.println("Balance is: "+obj.getBalance());
	               break;
			case 4:obj.getDetails();
			       break;
			case 5:System.out.println("Thankyou for visiting...");
			       break;
			default:System.out.println("Invalid choice..");
			
			     
			}
		}while(choice!=5);
		
		sc.close();
	}

}
