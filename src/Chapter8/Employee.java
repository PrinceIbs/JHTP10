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

// Fig. 8.8: Employee.java
// Employee class with references to other objects.

public class Employee 
{
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
       // this(firstName, lastName, birthDate, hireDate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
    
    public String toString() {
        return String.format("%s, %s Hired: %s Birthdaty: %s",
                lastName, firstName, hireDate, birthDate);
    }
}
