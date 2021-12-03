package Chapter9Exercises;

// Exercise 9.14: Employee.java

public class Ex914_Employee {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Ex914_Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    
    // Get methods
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    
    
    // Set methods
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s%n%s%n", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
