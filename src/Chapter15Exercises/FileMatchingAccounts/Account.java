package Chapter15Exercises.FileMatchingAccounts;

// Account.java
// 
public class Account {
    
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    
    // initializes an Account with default values
    public Account() {
        this(0, "", "", 0.0); // call to other constructor
    }
    
    // initializes an account with given values
    public Account(
            int account, String firstName, String lastName, double balance) {
                
        this.account = account;       
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    
    // adds transaction amount to account balance
    public void combine(TransactionRecord transactionRecord) {
        this.balance += transactionRecord.getAmount();
    }
    
    // set account number
    public void setAccount(int account) {
        this.account = account;
    }
    
    // get account number
    public int getAccount() {
        return account;
    }
    
    // set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // get firstName
    public String getFirstName() {
        return firstName;
    }
    
    // set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // get last name
    public String getLastName() {
        return lastName;
    }
    
    // set account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // get account balance
    public double getBalance() {
        return balance;
    }
    
}
