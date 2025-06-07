   package com.payments;


    abstract class Payments {
    abstract void pay(double amount); // Abstract method
  }

    class CreditCardPayment extends Payments {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
   }

    // This is the main class and entry point
    public class payment {
    public static void main(String[] args) {
        CreditCardPayment p = new CreditCardPayment(); // Using abstraction
        p.pay(2500);
      }
    }
