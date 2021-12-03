package Chapter14;

// length, charAt, getChars 
public class StringMiscellaneous {
    
    public static void main(String[] args) {
        
        String s1 = "hello there";
        char[] charArray = new char[5];
        
        System.out.printf("s1: %s", s1);
        
        //
        System.out.printf("%nLength of s1: %d", s1.length());
        
        //
        System.out.printf("%nThe string in reversed is: ");
        for (int counter = s1.length() - 1; counter >= 0; counter--) 
            System.out.printf("%c ", s1.charAt(counter));
        
        //
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe character array is: ");
        
        for (char character : charArray)
            System.out.print(character);
        
        System.out.println();
    }
}
