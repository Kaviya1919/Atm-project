package atmtransaction;

import java.util.Scanner;

public class AtmTransaction {
	public static void main(String[]args) {
		int balance=10000,withdraw = 0,deposit;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose the option what you want");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter money to be withdrawn : ");
				if(balance >= withdraw) {
					balance= balance - withdraw;
					System.out.println("Please Collect Your Money");
					}
				else {
					System.out.println("Insufficient Balance");
					
				}
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Enter the money to be deposited: ");
				deposit = sc.nextInt();
				balance = balance+deposit;
				System.out.println("Your Money Sucessfully Deposited");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Balance : "+balance);
				System.out.println("Choose 1 for withdraw");
				break;
			case 4:
				System.exit(0);
			}
			
			
			
		}
		
	}

	

	}


