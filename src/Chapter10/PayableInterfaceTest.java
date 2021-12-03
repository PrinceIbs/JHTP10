package Chapter10;

// Fig. 10.15: PayableInterfaceTest.java
// Payable interface test program processing Invoices and Employees polymorphically

public class PayableInterfaceTest {
    public static void main(String[] args) {
        // create four-element Payable array
        Payable[] payableObjects = new Payable[4];
        
        // populate array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 374.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee1("John", "Smith", "111-11-1111", 374.00);
        payableObjects[3] = new SalariedEmployee1("Lisa", "Bernes", "88-888-8", 374.00);
        
        System.out.println("Invoices and Employees processed polymorphically");
        
        // generically process each element in array payableObjects
        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), 
                    "payment due", currentPayable.getPaymentAmount());
        }
    }
}
