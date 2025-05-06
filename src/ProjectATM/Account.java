package ProjectATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double savingsBalance = 0;
	private double checkingBalance = 0;
	
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
 
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	
	/* Set the customer number */
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
		
	}
	
	/* get the customerNumber */
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	/* set the pinNumber */
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	/* get the pinNumber */
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	/* set savings balance*/
	
	public double setSavingsBalance(int savingsBalance) {
		this.savingsBalance=savingsBalance;
		return savingsBalance;
	}
	
	/* get the savingsBalance */
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	/* Calculate Savings Withdrawal */
	public double calcSavingsWithdraw(double amount) {
		savingsBalance = (savingsBalance - amount);
		return savingsBalance;
	}
	
	/*Calculate Savings Account Deposit*/
	
	public double calcSavingsDeposit(double amount) {
		savingsBalance = (savingsBalance+amount);
		return savingsBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance+amount);
		return checkingBalance;
	}
	
	/*Customer Checking Account Withdraw input */
	 
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount)>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " +moneyFormat.format(checkingBalance));
			}
		else {
			System.out.println("Balance cannot be negative." + "\n");
			
		}
	}
	
	public void getSavingsWithdrawInput() {
		
		System.out.println("Savings Account Balance: " + moneyFormat.format(savingsBalance));
		System.out.println("Amount you want to Withdraw from Savings Account: ");
		double amount = input.nextDouble();
		
		if((savingsBalance - amount)>=0) {
			calcSavingsWithdraw(amount);
			System.out.println("New Savings Account Balance: " + savingsBalance + "\n");
		}
		else {
			System.out.println("Balance cannot be negative" + "\n");
		}
	}
	
	/* Customer Checking Account Deposit Input*/
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from checking Account: ");
		double amount=input.nextDouble();
		
		if((checkingBalance+amount)>=0) {
			calcCheckingDeposit(amount);
			System.out.println("New checking Account Balance: " + moneyFormat.format(checkingBalance));
			
		}
		else {
			System.out.println("Balance cannot be negative." + "\n");
		}
		
	}
	
	public void getSavingsDepositInput() {
		System.out.println("Savings Account Balance: " + moneyFormat.format(savingsBalance));
		System.out.println("Amount you want to Deposit from savings Account: ");
		double amount = input.nextDouble();
		
		if ((savingsBalance+amount)>=0) {
			calcSavingsDeposit(amount);
			System.out.println("New Savings Account Balance: "+ moneyFormat.format(savingsBalance));
		}else {
			System.out.println("Amount cannot be negative");
		}
	}
	
	
	

}
