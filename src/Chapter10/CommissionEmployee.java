package Chapter10;

// Fig. 10.7: CommissionEmployee.java
// CommissionEmployee class extends Employee

public class CommissionEmployee extends Employee
{
    private double commissionRate;
    private double grossSales;
    
    // constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
            double commissionRate, double grossSales)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        // TODO: validate gross sales 
        // TODO: validate commissionRate
        
        
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    
    // TODO: Write set and get methods for commissionRate
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    public double getGrossSales()
    {
        return grossSales;
    }
    
    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }
    
    @Override
    public String toString()
    {
        // TODO: return String representation of the CommissionEmployee class
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), 
                "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }
        
}
