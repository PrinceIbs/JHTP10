package Chapter8Exercises;

 
public class Ex816_HugeInteger {
    
    int[] hugeInteger = new int[40];
    
    public void parse(String hugeString) {
        try 
        {
           for (int counter = 0; counter < hugeString.length(); counter++) {
            hugeInteger[counter] = hugeString.charAt(counter);
        } 
        } catch(Exception e) {
            System.out.printf("An exception has occured: %s", e.getLocalizedMessage());
        }
        
    }
    
    public void subtract() {
        
    }
    
    @Override
    public String toString() {
        
        for (int integer : hugeInteger) 
            System.out.print(integer);
        
        System.out.println();
        return null;
    }
    
    
    // comparism methods
    
    public void isEqualTo() {
        
    }
    
    public void isGreaterThan() {
        
    }
    
    public void isLessThan() {
        
    }
    
    public void isGreaterThanOrEqualTo() {
        
    }
    
    public void isLessThanOrEqualTo() {
        
    }
    
}





class TestHugeInteger {
    public static void main(String[] args) {
        Ex816_HugeInteger test1 = new Ex816_HugeInteger();
        
        test1.parse("348488484848488732882938238923");
        
        test1.toString();
    } 
}
