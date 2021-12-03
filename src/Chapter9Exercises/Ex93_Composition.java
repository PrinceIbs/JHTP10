package Chapter9Exercises;

// Exercise 9.3: Rewrite Fig. 9.11 to use composition rather than inheritance

import Chapter9.CommissionEmployee1;


public class Ex93_Composition {
        
        private final String firstName;
        private final String lastName;
        private final String socialSecurityNumber;
        private double grossSales;
        private double commissionRate;
        private double baseSalary; // base salary per week
        
        //
        protected final CommissionEmployee1 employee1;
        
    // six-argument constructor
    public Ex93_Composition(String firstName, String lastName, String socialSecurityNumber,
            double grossSales, double commissionRate, double baseSalary) 
    {
         employee1 = new CommissionEmployee1(firstName, lastName, 
                socialSecurityNumber, grossSales, commissionRate);
        
        // validate baseSalary
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.firstName = employee1.getFirstName();
        this.lastName = employee1.getLastName();
        this.socialSecurityNumber = employee1.getSocialSecurityNumber();
        this.grossSales = employee1.getGrossSales();
        this.commissionRate = employee1.getCommissionRate();
        this.baseSalary = baseSalary;
        
    }
    
    // set base salary
    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary <= 0.0)
            throw new IllegalArgumentException("Base salary musy be >= 0.0");
        
        this.baseSalary = baseSalary;
    }
    
    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    // calculate earnings
    
    public double earnings()
    {
        return getBaseSalary() + employee1.earnings();
    }
    
    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString()
    {
        return String.format("%s %s%n%s: %.2f", "base-salaried", employee1.toString(), 
                "base salary", getBaseSalary());
    }
    
}











// Test class
class CompositionTest 
{
    public static void main(String[] args)
    {
      // instantiate CommissionEmployee object
        Ex93_Composition employee = new Ex93_Composition(
        "Salia", "Brick", "070-080-0900", 19000, .06, 1400);
        
        // get base-salaried employee data
        System.out.println("Employee information obtained by get methods: \n");
        
        System.out.printf("%s %s%n", "First name is", employee.employee1.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.employee1.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.employee1.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.employee1.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.employee1.getCommissionRate());   
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());  
        
        employee.setBaseSalary(1000);
        
        System.out.printf("%n%s: %n%n%s%n", "Updated information obtained by toString", 
                employee.toString());
    }
    
}