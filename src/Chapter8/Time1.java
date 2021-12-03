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
// Fig. 8.1: Time1.java
// Time1 class declaration maintains the time in 24-hour format
public class Time1 {
    private int hour;
    private int minute;
    private int second;
    
    public void setTime(int hour, int minute, int second) {
        
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || 
                second < 0 || second >= 60 ) {
            throw new IllegalArgumentException(
            "hour, minute and/or second was out or range");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second );
    }
    

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12: hour % 12,
                minute, second, (hour >= 12? "PM": "AM"));
    }
}
