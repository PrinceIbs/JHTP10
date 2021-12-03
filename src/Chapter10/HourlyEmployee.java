package Chapter10;

// Fig. 10.6: HourlyEmployee.hava
// HourlyEmployee class extends employee

public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;
    
    // constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, 
            double wage, double hours)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        // validate wage 
        if (wage < 0.0)
            throw new IllegalArgumentException("wage must be >= 0.0");
        
        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        
        this.wage = wage;
        this.hours = hours;
    }
    
    
    // Set methods
    
    public void wage(double wage)
    {
        if (wage < 0.0)
            throw new IllegalArgumentException("wage must be >= 0.0");
        
        this.wage = wage;
    }
    
    public void setHours(double hours)
    {
        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        
        this.hours = hours;
    }
    
    
    // Get methods
    
    public double getWage()
    {
        return wage;
    }
    
    public double getHours()
    {
        return hours;
    }
    
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings()
    {
        if (getHours() <= 40)
            return getWage() * getHours();
        else 
            return 40 * getWage() + (getWage() -  40) * getWage() * 1.5;
    }
    
    @Override
    public String toString()
    {
        return String.format("hourly employee: %s%n%s: $,.2f; %s: %,.2f", super.toString(),
                "hourly wage", getWage(), "hours worked", getHours());
        
    }
}
