package Interface;

import java.util.Scanner;

public class IntAssign {

	public static void main(String[] args) {
		IBankAccount account = new BankAccount();
        System.out.println("Transacting using  Account");
        transactOnAccount(account);
        System.out.println();

	}
	
	public static void transactOnAccount(IBankAccount account) {
		Scanner scan = new Scanner(System.in);
		int n = 1;
		while(n == 1) {
			System.out.println("Enter choice: ");
			char choice = scan.next().charAt(0);
			switch(choice) {
				case 'd': {
					System.out.println("Enter the amount to be deposited: ");
					account.Deposit(scan.nextDouble());
					printBalance("Deposit ", account);
					break;
				}
				case 'w': {
					System.out.println("Enter the amount to withdraw");
					double am = scan.nextDouble();
					if (am > 5000) {
						System.out.println("Withdraw attempt failed");
						break;
					}
					else if  (account.Balance()< am) {
						System.out.println("Insufficient Balance");
						break;
					}
					account.Withdraw(am);
					printBalance("Withdrawl ",account);
					break;
				}
				case 'b': {
					System.out.println("The balance is: "+account.Balance());
					break;
				}
			}
			System.out.println("ENter 1 to continue or 0 to stop: ");
			n = scan.nextInt();
		}
	}
	public static void printBalance(String message,IBankAccount account) {
		System.out.println("The balance after "+ message + "is" + account.Balance());
	}
}

interface IBankAccount {
	final double INIT_AMOUNT = 10000;
	public void Deposit(double amount);
	public void Withdraw(double amount);
	public double Balance();
}

class BankAccount implements IBankAccount {
	double deposit;
	double withdrawl;
	public void Deposit(double amount) {
		deposit = deposit+amount;
	}
	public void Withdraw(double amount) {
		withdrawl = withdrawl+amount;
	}
	public double Balance() {
		return INIT_AMOUNT+(deposit - withdrawl);
	}
}




