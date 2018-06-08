package BankApp;

public abstract class Account implements IRate {
    // List common properties for savings and checking accounts
    private String name;
    private String socSecNum;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;


    // Constructor to set base properties and initialize account

    public Account(String name, String socSecNum, double initDeposit) {
        this.name = name;
        this.socSecNum = socSecNum;
        balance = initDeposit;

        //Set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();



    }

    public abstract void setRate();



    private String setAccountNumber(){
        String lastTwoOfSocSecNum = socSecNum.substring(socSecNum.length()-2,socSecNum.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()* Math.pow(10,3));
        return lastTwoOfSocSecNum + uniqueID + randomNumber;

    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued interest: " + accruedInterest + "$");
        printBalance();


    }

    // List common methods

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing " + amount + "$");
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing " + amount + "$");
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring " + amount + "$ to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now: " + balance + "$");
    }

    public void showInfo() {
        System.out.println(
                "Name: " + name +
                "\nAccount number: " + accountNumber +
                "\nBalance: " + balance +
                "\nRate: " + rate + "%"
        );


    }
}
