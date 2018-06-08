package BankApp;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();





        // Read a CSV File then create new accounts based on that data
        String file = "C:\\Users\\Kruszy\\IdeaProjects\\Bank Application\\src\\NewBankAccounts.csv";

        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String socSecNum = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);


            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, socSecNum, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, socSecNum, initDeposit));
            } else {
                System.out.println("Error reading account type");
            }



        }
        for (Account acc : accounts){
            System.out.println("\n*************");
            acc.showInfo();
        }


    }
}
