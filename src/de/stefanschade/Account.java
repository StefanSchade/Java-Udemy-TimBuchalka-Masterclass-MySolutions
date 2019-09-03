package de.stefanschade;

public class Account {

    private static int idCounter = 0;

    private int account_nr;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    private Account() {
        // private constructor
    }

    public Account(String customerName, String phoneNumber, String customerEmail) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.customerEmail = customerEmail;
        this.account_nr = ++this.idCounter;
        System.out.println("New Account #" + this.account_nr + " for " + this.customerName + "/" + this.phoneNumber + "/" + this.customerEmail + "/");
    }


    public Account(String customerName) {
        this(customerName, "", "");
    }


    public Account(String customerName, String phoneNumber) {
        this(customerName, phoneNumber, "");
    }


    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Account.idCounter = idCounter;
    }

    public int getAccount_nr() {
        return account_nr;
    }

    public void setAccount_nr(int account_nr) {
        this.account_nr = account_nr;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double amount) {
        this.balance += amount;
        System.out.print("AC#" + account_nr + " ");
        System.out.println("new balance: " + balance);
    }

    public void withdrawFund(double amount) {
        if (this.balance < amount) {
            System.out.print("AC#" + account_nr + " ");
            System.out.println("No whitdrawl, insufficient balance");
        } else {
            this.balance -= amount;
            System.out.print("AC#" + account_nr + " ");
            System.out.println("new balance: " + balance);
        }
    }

}
