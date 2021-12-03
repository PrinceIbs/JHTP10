/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author ISAAC
 */

// Fig. 8.13: EmployeeTest.java
// static member demonstration

public class EmployeeTest1 {
    
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d%n", Employee1.getCount());
        
        Employee1 e1 = new Employee1("Belek", "May");
        Employee1 e2 = new Employee1("Iron", "Rust");
        Employee1 e3 = new Employee1("Tite", "Jua");
        
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e3.getCount(): %d%n", e3.getCount());
        System.out.printf("via Employee1.getCount(): %d%n", Employee1.getCount());
        
        // get names of Employees
        System.out.printf("%nEmployee 1: %s %s%nEmployee 3: %s %s%n", 
                e1.getFirstName(), e1.getLastName(), 
                e3.getFirstName(), e3.getLastName());
    
    
    }
}
