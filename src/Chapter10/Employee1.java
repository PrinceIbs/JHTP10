package Chapter10;

// Fig. 10.13: Employee.java
// Employee abstract superclass that implements payable
public abstract class Employee1 implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    
    // constructor
    public Employee1(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        
    }
    
    // Get methods
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s", 
                getFirstName(), getLastName(), getSocialSecurityNumber());
    } 
    
    
    // Note that this class does not necessarily implement Payable's abstract method getPaymentAmount 
    // because it's an abstract class
}
