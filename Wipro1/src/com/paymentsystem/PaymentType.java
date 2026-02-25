package com.paymentsystem;
public interface PaymentType {
	boolean validate(int amount);
	default void check() {
		System.out.println("Validating Payment");
	}
	static void paymentstatus() {
		System.out.println("Amount should be greater than Rs.1000");
	}
}
