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
public class Time1Test {
    private static void displayTime(String header, Time1 t) 
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n%n",
                header, t.toUniversalString(), t.toString());   
    }
    
   
    public static void main(String[] args) 
    {
        Time1 time = new Time1();              
        
        displayTime("After time object is created", time);
        System.out.println();
        
        // change time and outputj update time
        time.setTime(13, 19, 00);
        displayTime("After calling setTime", time);
        
        // attempt to set time with invalid values
        try 
        {
            time.setTime(99, 99, 99); 
        } 
        catch  (IllegalArgumentException e) 
        {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        
        displayTime("After calling setTime with invalid values", time);

    }
    
}
