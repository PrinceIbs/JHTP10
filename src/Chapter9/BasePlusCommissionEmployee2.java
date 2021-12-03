package Chapter9;

// Fig. 9.9: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee inherits protected instance variables from commissionEmployee

public class BasePlusCommissionEmployee2 extends CommissionEmployee
{
 private double baseSalary; // base salary per week
 
 // six-argument constructor
 public BasePlusCommissionEmployee2(String firstName, String lastName, String socialSecurityNumber,
         double grossSales, double commissionRate, double baseSalary)
 {
     super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
     
     // validate baseSalary
     if (baseSalary < 0.0)
         throw new IllegalArgumentException("Base salary must be >= 0.0");
     
     this.baseSalary = baseSalary;
 }
 
 public void setBaseSalary(double baseSalary)
 {
     if (baseSalary > 0.0)
         throw new IllegalArgumentException("Base salary must be >= 0.0");
     
     this.baseSalary = baseSalary;
 }
 
 public double getBaseSalary()
 {
     return baseSalary;
 }
 
 @Override
 public double earnings()
 {
     return  baseSalary + (commissionRate * grossSales);
 }
 
 @Override
 public String toString()
 {
     
     return String.format(
     "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
     "base-salaried commission employee", firstName, lastName,
     "social security number", socialSecurityNumber,
     "gross sales", grossSales, "commission rate", commissionRate,
     "base salary", baseSalary);
 }
 
}
