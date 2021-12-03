package Chapter9;

// Fig. 9.7: BasePlusCommissionEmplyeeTest.java
//

public class BasePlusCommissionEmployeeTest 
{
    public static void main(String[] args)
    {
      // instantiate CommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
        "Salia", "Brick", "070-080-0900", 19000, .06, 1400);
        
        // get base-salaried employee data
        System.out.println("Employee information obtained by get methods: \n");
        
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());   
        System.out.printf("%s %.2f%n", "Bsse salary is", employee.getBaseSalary());  
        
        employee.setBaseSalary(1000);
        
        System.out.printf("%n%s: %n%n%s%n", "Updated information obtained by toString", 
                employee.toString());
    }
}
