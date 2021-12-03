package Chapter14;

// substring

public class SubString {
    
    public static void main(String[] args) { 
        
        String letters = "abcdefghjklmabcdefghijklm";
        
        // test substring methods 
        System.out.printf("Substring from index 20 to end is \"%s\"%n", 
                letters.substring(20));        
        System.out.printf("Substring from index 3 up to, but not including 6 is %s%n", 
                letters.substring(3, 6));
        
    }
}
