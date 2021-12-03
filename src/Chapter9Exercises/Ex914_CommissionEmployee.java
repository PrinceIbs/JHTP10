package Chapter9Exercises;

// Exercise 9.14: CommissionEmployee.java



public class Ex914_CommissionEmployee extends Ex914_Employee
{   
    private double commissionRate;
    private double baseSalary;
    
    // Constructor
    public Ex914_CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
            double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        // validate commissionRate
        if (commissionRate < 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be >= 0.0 and < 1.0");
        
        this.commissionRate = commissionRate;
        
        // validate baseSalary
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }
    
    // Get methods
    
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    
    // Set methods
    
    public void setCommissionRate(double commissionRate)
    {
        // validate commissionRate
        if (commissionRate < 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        
        this.commissionRate = commissionRate;
    }
    
    public void setBaseSalary(double baseSalary)
    {
        // validate base salary
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }
    
    @Override
    public String toString()
    {
        return String.format("%sCommission rate %s%nBase salary %s%n", 
                super.toString(), getCommissionRate(), getBaseSalary());
    }
}













// Test CommissionEmployee
class TestCommissionEmployee
{
    public static void main(String[] args)
    {
        Ex914_CommissionEmployee employee = new Ex914_CommissionEmployee(
        "Pick", "Burrows", "404-414-424", .6, 2500);
        
        System.out.printf("%s", employee);
    }
}
