package Chapter14;

// Fig. 14.20: ValidateInput.java
// Validating user information using regular expressions

public class ValidateInput {
    
    // validate first name
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }
    
    // validate last name
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
    }
    
    // validate address
    public static boolean validateAddress(String address) {
        //return address.matches("([0-9][a-zA-Z'-,])+"); // My address
        return address.matches("\\d+\\s+([a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    // validate city
    public static boolean validateCity(String city) {
        return city.matches("[a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+");
    }
    
    // validate state
    public static boolean validateState(String state) {
        return state.matches("[a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]");
    }
    
    // validate zip
    public static boolean validateZip(String zip) {
        return zip.matches("\\d{5}");
    }
    
    public static boolean validatePhone(String phone) {
        //return phone.matches("0[7-9][0-1]\\d{8}"); // Validate Nigerian phone numbers
        //return phone.matches("0[7|8|9][0|1]\\d{8}"); // Validate Nigerian phone numbers
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }       
    
}
