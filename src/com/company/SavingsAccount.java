package com.company;

public class SavingsAccount{

    int balance;

    public SavingsAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Hello!\nYour balance is "+balance);
    }

    public int deposit(int amountToDeposit){
        balance += amountToDeposit;
        System.out.println("You just deposited "+amountToDeposit);
        return amountToDeposit;
    }

    public int withdraw(int amountToWithdraw){
        balance -= amountToWithdraw;
        System.out.println("You just withdrew "+amountToWithdraw);
        System.out.println("You just withdrew "+amountToWithdraw);
        return amountToWithdraw;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        savings.checkBalance();
        savings.withdraw(300);
        savings.checkBalance();
        savings.deposit(600);
        savings.checkBalance();
    }
    //ДЭН ГО ПИТЬ
}