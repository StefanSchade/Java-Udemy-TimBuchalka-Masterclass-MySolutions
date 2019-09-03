package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Challenge_BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }


    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    @Override
    public String toString() {
        return this.customerName + "'s account";
    }

    public int depositFund(double amount) {

        System.out.print(this.toString() + " deposit " + amount + " : ");

        if (amount >= 0) {
            System.out.print("old balance = " + this.balance);
            this.balance += amount;
            System.out.print(" --> ");
            System.out.print("new balance = " + this.balance);
            System.out.println();
            return 1;
        } else {
            System.out.printf("Can not deposit negative amount");
            System.out.println();
            return -1;
        }
    }


    public int withdraw(double amount) {

            System.out.print(this.toString()+ " withdraw " + amount + " : ");
        if(amount <= balance) {
            System.out.print("old balance = " + this.balance);
            this.balance -=amount;
            System.out.print(" --> ");
            System.out.print("new balance = " + this.balance);
            System.out.println();
            return 1;
        } else {
            System.out.printf("Can not withdraw more than balance");
            System.out.println();
            return -1;
        }



    }

    public Challenge_BankAccount(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    public static void main(String[] args) {

        Challenge_BankAccount acTim = new Challenge_BankAccount(1234,"Tim");
        Challenge_BankAccount acStefan = new Challenge_BankAccount(1235,"Stefan");


        acStefan.depositFund(100);
        acStefan.withdraw(50);
        acStefan.withdraw(50);
        acStefan.withdraw(50);

        acTim.depositFund(1000);
        acTim.depositFund(-1000);
        acTim.withdraw(50);
        acTim.withdraw(50);
        acTim.withdraw(50);



    }

}
