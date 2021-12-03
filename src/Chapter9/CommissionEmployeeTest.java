package Chapter9;

// Fig. 9.5: CommissionEmployeeTest
//

public class CommissionEmployeeTest 
{
    public static void main(String[] args)
    {
        // instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee(
        "Salia", "Brick", "070-080-0900", 19000, .06);
        
        // get commission employee data
        System.out.println("Employee information obtained by get methods:");
        
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        
        
        employee.setGrossSales(12800);
        employee.setCommissionRate(.1);
        
        System.out.printf("%n%s:%n%s%n", "Updated employee information obtained by toString", employee);
    }
    
}
