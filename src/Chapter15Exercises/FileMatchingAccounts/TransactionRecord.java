package Chapter15Exercises.FileMatchingAccounts;

// TransactionRecord.java
// Objects of this class contains account number and amount for transaction
public class TransactionRecord {
    
    private int account; // account number
    private double amount; // amount for transaction
    
    public TransactionRecord(int account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    
    public void setAccount(int account) {
        this.account = account;
    }
    
    public int getAccount() {
        return account;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
    
}
