package Chapter10;

// Fig. 10.9: PayrollSystemTest.java
// Employee hierachy test program

public class PayrollSystemTest 
{
    public static void main(String[] args)
    {
        // TODO: print employees processed 
        SalariedEmployee salariedEmployee = 
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = 
                 new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = 
                new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06); 
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        
        // create four-element Employee array
        Employee[] employees = new Employee[4];
        
        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        System.out.printf("Employees processed polymorphically: %n%n");
        
        // generally process each element in array employees
        for (Employee currentEmployee : employees)
        {
            System.out.println(currentEmployee); // invokes toString
            
            // determine weather element is ...
//            if currentEmployee instanceof BasePlusCommissionEmployee()
//            {
//                // downcast employee reference to BasePlusCommissionEmployee reference
//                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
//                
//                employee.setBaseSalary(1.10 * employee.getBaseSalary());
//                
//                System.out.printf("new salary with 10%% increase is: $%,.2f%n", 
//                        employee.getBaseSalary());
//            }
            
            // get type name for each object in employees array
            for (int j = 0; j < employees.length; j++)
            {
                System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
            }
        }
        
    }     
}
