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
// Fig. 8.4: ThisTest.java
// this used to implicitly and explicitly to refer to members of an object.

public class ThisTest 
{ 
    public static void main(String[] args) 
    {
        SimpleTime time = new SimpleTime(13, 53, 9);
        System.out.println(time.buildString());
    }
    
    
}

class SimpleTime {
    
    private int hour;
    private int minute;
    private int second;
    
    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String buildString() 
    {        
        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", 
                this.toUniversalString(), "toUniversalString()", toUniversalString());
    }
    
    public String toUniversalString() 
    {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
