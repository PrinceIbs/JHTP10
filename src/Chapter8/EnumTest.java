/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;
import java.util.EnumSet;

/**
 *
 * @author ISAAC
 */
public class EnumTest {
    
    public static void main(String[] args) {
        
       System.out.println("All books:");
       
       // print all books in enum book
       for (Book book : Book.values())           
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
       
       System.out.printf("%nDisplay a range of enum constants: %n");
       
       for (Book book : EnumSet.range(Book.CPPHTP, Book.BHTP))
          System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
    }
    
}
