package com.paymentsystem;
import java.util.*;
public class onlinepayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount1 = sc.nextInt();
		PaymentType validator = amount -> amount > 1000;
		//PaymentType.check();
	    //PaymentType.paymentstatus();
	    if(!validator.validate(amount1)) {
            System.out.println("Invalid amount!");
            return;
        }else {
        		System.out.println("Valid amount!");
        }
	    payment payment;
	    System.out.println("Choose Payment Method:");
	    System.out.println("1. Credit Card");
	    System.out.println("2. UPI");
	    int choice = sc.nextInt();
	    if (choice == 1) {
            payment = new CreditCardPayment(amount1);
        } else if (choice == 2) {
            payment = new UPIPayment(amount1);
        } else {
            System.out.println("Invalid payment option");
            return;
        }
 
        payment.paymentprocess();
	    sc.close();
	}
}