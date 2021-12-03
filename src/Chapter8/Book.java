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

// Fig. 8.10: Book.java
// Declaring an enum type with a constructor and explicit fields 
// and accessors for these fields

public enum Book 
{
    // declare constants of enum type
    JHTP("Java how to program", "2015"),
    CHTP("C How to Program", "2013"),
    IWTWWW("Internet & World Wide web How To Program", "2012"),
    CPPHTP("C++ how to program", "2014"),
    VHTP("Visual Basics how to program", "2005"),
    BHTP("B how to program", "2000");
    
    
    private final String title;
    private final String copyrightYear;
    
    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getCopyrightYear() {
        return copyrightYear;
    }
    
}
