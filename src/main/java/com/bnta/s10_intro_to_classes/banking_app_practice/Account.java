package com.bnta.s10_intro_to_classes.banking_app_practice;

import java.util.Scanner;

public class Account {

    private int balance;
    private String name;
    private String id;

    public Account(int balance, String name, String id) {
        this.balance = balance;
        this.name = name;
        this.id = id;
    }

    // 2. DEPOSIT
    // Deposit method - takes amount as input
    public void deposit(int depositAmount) {
        // If amount is not equal to 0
        if (depositAmount > 0) {
            // Then increment the current amount with the deposit
            balance += depositAmount;
        }
    }

    // 3. WITHDRAW
    // Deposit method - takes amount as input
    public void withdraw(int withdrawAmount) {
        // If amount is not equal to 0
        if (withdrawAmount > 0) {
            // Then increment the current amount with the deposit
            balance -= withdrawAmount;
        }
    }

    // 4.
    public void options() {
        Scanner scanner = new Scanner(System.in);
        // Initialise customer name and id variables via the Account constructor above
        System.out.println("Welcome, " + name + "!");
        System.out.println("ID: " + id + "\n");
        System.out.println("Please select from the following options: ");
        System.out.println("1. View balance");
        System.out.println("2. Deposit amount");
        System.out.println("3. Withdraw amount");
        System.out.println("4. Exit");




    }




}
