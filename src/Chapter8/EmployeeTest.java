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
public class EmployeeTest {
    
    public static void main(String[] args) {
        Date birth = new Date(01, 01, 1960);
        Date hire = new Date(12, 31, 1979);
        Employee employee = new Employee("John", "Pick", birth, hire);
        
        System.out.println(employee);
    }
    
}
