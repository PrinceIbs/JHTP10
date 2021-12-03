package Chapter10;

// Fig. 10.1: PolymorphismTest.java

import Chapter9.BasePlusCommissionEmployee1;
import Chapter9.CommissionEmployee;

public class PolymorphismTest 
{    
    public static void main(String[] args) 
    {
        // assign super class reference to subclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "222-212-2022", 1000, .06);
        
        // assign subclass reference to subclas variable 
        BasePlusCommissionEmployee1 basePlusCommissionEmployee = new BasePlusCommissionEmployee1(
        "Bob", "Lewis", "333-333-3333", 5000, .04, 300);
        
        // TODO: print commissionEmployee.toString()
        
        // TODO: print basePlusCommissonEmployee.toString()
        
        // invoke toString on subclass object using superclass variable
        
        // invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n", "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee2);
                
        
    }
}
