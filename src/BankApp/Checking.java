package BankApp;

public class Checking extends Account {
    // List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize Checking account properties

    public Checking(String name, String socSecNum, double initDeposit) {

        super(name, socSecNum, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;

    }


    // List any methods specific to a Checking account

    public void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10,4));

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features" +
                "\n Debit card number: " + debitCardNumber +
                "\n Debit card PIN: " + debitCardPIN);
    }


}
