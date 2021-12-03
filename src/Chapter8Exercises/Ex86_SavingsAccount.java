package Chapter8Exercises;

// Exercise 8.6: Savings Account
public class Ex86_SavingsAccount {

    static double annualInterestRate = 0.05;
    public double savingsBalance;

    public Ex86_SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        return monthlyInterest;
    }

    public void modifyInterestRate(double rate) {
        if (rate < 1.0 || rate > 100) {
            throw new IllegalArgumentException("rate must be between 1-100");
        }
        this.annualInterestRate = rate / 100;
    }

}



// Class to test SavingsAccount
class SavingsAccountTest {

    public static void main(String[] args) {
        Ex86_SavingsAccount saver1 = new Ex86_SavingsAccount(2000.00);
        Ex86_SavingsAccount saver2 = new Ex86_SavingsAccount(3000.00);

        System.out.println("Saver1:");
        for (int month = 1; month <= 12; month++) {
            System.out.printf("Month %02d interest rate: %.2f%n", month, saver1.calculateMonthlyInterest());

            saver1.savingsBalance += saver1.calculateMonthlyInterest();
        }

        System.out.printf("New saver1 total balance: %.2f%n%n", saver1.savingsBalance);

        System.out.println("Saver2:");
        for (int month = 1; month <= 12; month++) {
            System.out.printf("Month %02d interest rate: %.2f%n", month, saver2.calculateMonthlyInterest());

            saver2.savingsBalance += saver2.calculateMonthlyInterest();
        }

        System.out.printf("New saver2 total balance: %.2f%n", saver2.savingsBalance);
    }
}
