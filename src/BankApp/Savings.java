package BankApp;

public class Savings extends Account {
    // List properties specific to a Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize Savings account properties
    public Savings(String name, String socSecNum, double initDeposit) {
        super(name, socSecNum, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;

    }


    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));

    }

    // List any methods specific to a Savings account
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features" +
        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
        "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
    }

}
