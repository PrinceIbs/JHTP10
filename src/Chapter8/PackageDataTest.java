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

// Fig. 8.15: PackageDataTest.java
// Package-access members of a class are accessible by other classes
// in the same package

public class PackageDataTest {
    
    public static void main(String[] args) {
        PackageData packageData = new PackageData();
        PackageData packageData1 = new PackageData();
        
        System.out.printf("After instantiation:%n%s%n", packageData);
        
        // change package data access
        packageData.number = 77;
        packageData.string = "Goodbye";
        
        System.out.printf("%nAfter changing values:%n%s%n", packageData);
        //System.out.printf("%nAfter changing values for packageData1:%n%s%n", packageData1);
    }
    
}

class PackageData {
    int number;
    String string;
    
    public PackageData() {
        number = 0;
        string = "Hello";       
    }
    
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
}