package Chapter14Exercises;

// AmountInWords.java
// Exercise 14.21: Takes in numbers between 0 to 1000000 and output the number in words

public class AmountInWords {

    public static String amountInWords(int amount) {
        // get list of possible words
        String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens1 = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourtheen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens2 = {null, "Twenty", "Thirty", "Fouty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String amountInWords = "<Out of range>";

        // implementation
        if (amount >= 0 && amount < 10) { // 0 - 9
            amountInWords = units[amount];
        } else if (amount >= 10 && amount < 20) { // 10 - 19
            amountInWords = tens1[amount % 10];
            
        } else if (amount >= 10 && amount < 100) { // 10 - 99
            String unit =  amount % 10 > 0 ? units[amount % 10] : "";
            amountInWords = tens2[(amount / 10) - 1] + " " + unit;
            
        } else if (amount >= 100 && amount < 1000) { // 100 - 999
            String unit = amount % 100 > 0 ? " and " + amountInWords(amount % 100) : "";
            int hundred = Integer.parseInt(String.valueOf(String.valueOf(amount).charAt(0)));
            amountInWords = units[hundred] + " hundred" + unit;
            
        } else if (amount >= 1000 && amount < 10000) { // 1000 - 9999
            String unit = amount % 1000 > 0 ? ", " + amountInWords(amount % 1000) : "";
            int thousand = Integer.parseInt(String.valueOf(String.valueOf(amount).charAt(0)));
            amountInWords = units[thousand] + " thousand" + unit;
            
        } else if (amount >= 10000 && amount < 100000) { // 10000 - 99999
            String unit = amount % 1000 > 0 ? ", " + amountInWords(amount % 1000) : "";
            int tenThousand = Integer.parseInt(String.valueOf(amount).split("")[0] + 
                    String.valueOf(amount).split("")[1]);
            amountInWords = amountInWords(tenThousand) + " thousand" + unit;
            
        } else if (amount >= 100000 && amount < 1000000) { // 100000 - 999999
            String unit = amount % 1000 > 0 ? ", " + amountInWords(amount % 1000) : "";
            int hundredThousand = Integer.parseInt(String.valueOf(amount).split("")[0] + 
                    String.valueOf(amount).split("")[1] + String.valueOf(amount).split("")[2]);
            amountInWords = amountInWords(hundredThousand) + " thousand" + unit;
            
        }
        
         //handles special cases
        switch(amount) {          
            case 1000000:
                amountInWords = "One million"; // 1000000           
                break;
        }

        return amountInWords;
    }
    
    public static String decimalPoint(double point) {
        int intPoint = (int) point;
        String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String pointInWords = "point " + units[intPoint / 10] + " " + units[intPoint % 10];
        
        return pointInWords;
    }
    
    public static String processDoubleAmount(double amount) {
        String amountInWords = "";
        int intAmount = (int) amount;
        double decimalPoint =  (amount - intAmount) * 100;
        
        amountInWords = amountInWords(intAmount) + ". " + decimalPoint(decimalPoint);
        return amountInWords;
    }
    
    public static void main(String[] args) {       
        System.out.println(processDoubleAmount(999999));
//        for (int number = 0; number <= 1000; number ++) {
//            System.out.printf("%d - %s%n", number, amountInWords(number));
//        }
    }
}
