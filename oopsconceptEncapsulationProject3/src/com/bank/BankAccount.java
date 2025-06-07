package com.bank;

public class BankAccount {
	private String accountHolder;
	private double balance;
	
	//constructor
	public BankAccount(String name) {
		this. accountHolder = name;
		this. balance = 0;
     }
    // Encapsulation with getter/setter
	public void  deposit(double amount) {
		balance += amount;
	}
	public void  withdraw(double amount) {
		if (balance >= amount)
            balance -= amount;
		else
	        System.out.println("insufficient funds");
	}
	public double getBalance() {
	        return balance;
	}
	 public String getAccountHolder() {
		    return accountHolder;	   
	}
	public static void main(String[] args) {
		 BankAccount acc = new BankAccount("sam");
		 acc.deposit(10000);
		 acc.withdraw(3000);
		 System.out.println("Holder: " + acc.getAccountHolder());
	     System.out.println("Balance:"+ acc.getBalance());
	     
	}
	  
   }
