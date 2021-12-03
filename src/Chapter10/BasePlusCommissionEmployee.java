package Chapter10;

// Fig. 10.8: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class extends CommissionEmployee

public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary; // base salary per week
    
    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
            double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        // TODO: validate baseSalary
        
        this.baseSalary = baseSalary;
    }
    
    // TODO: Add set method for base salary
    
    public void setBaseSalary(double baseSalary)
    {
        // TODO: validate base salary
        
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }
    
    @Override
    public String toString()
    {
        // TODO: print String representation of class
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), 
                "base-salary", getBaseSalary());
    }
}
