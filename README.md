# BankApp
Java exercise - simple console bank app

Bank Application

Scenario: You are a back-end developer and need to create an application to handle new customer bank account requests.

Your application should do the following:

- Read a .csv file for names, social security numbers, account type, and initial deposit
- Use a proper data structure to hold all these accounts
- Both savings and checking accounts share the following properties:
  deposit()
  withdraw()
  transfer()
  showInfo()
  
  11-Digit Account Number (generated with the following process: 1 or 2 dependig on Savings or Checking account, last two digits of SSN, unique 5-digit number, and a random 3-digit number)
  
- Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
- Checking Account holders are asigned a Debit card with a 12-digit number adn 4-digit PIN
- Both accounts will use an interface that determines the base interest rate.
  Saving accounts will use .25 points less than the base rate
  Checking accounts will use 15% of the base rate
- the showInfo method should reveal relevant account information as well as information specific to the Checking account or Savings account
  
