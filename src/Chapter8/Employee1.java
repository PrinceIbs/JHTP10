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

// Fig. 8.12: Empoloyee.java
// static variable used to maintain a count of the number of 
// Employee objects in the memory

public class Employee1 {
    private static int count = 0;
    private String firstName;
    private String lastName;
    
    public Employee1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++count; 
        System.out.printf("Employee constructor: %s %s; count = %d%n", 
                firstName, lastName, count);
    }
    
    public String getFirstName() {
       
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public static int getCount() {
        return count;
    }
    
}
