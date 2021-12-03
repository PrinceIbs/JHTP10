package Chapter14Exercises;

// Exercise 14.4: Random sentences
// 
import java.security.SecureRandom;
public class RandomSentences {

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        String[] article = {"the", "a", "one", "some", "many"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
        String sentence = "";
        String[][] dictionary = {article, noun, verb, preposition};

        for (int count = 0; count < 20; count++) {
            for (int counter = 0; counter < 6; counter++) {
                int pick = generator.nextInt(5);
                if (counter == 0)                    
                    sentence += article[pick]  + " ";
                else if (counter > 0 && counter < 4) {
                    sentence += dictionary[counter][pick] + " ";
                } else if (counter == 4) {
                    sentence += article[pick] + " ";
                } else {
                    sentence += noun[pick] + " ";
                }
            }                       
            System.out.println(sentence.trim() + ".");
            sentence = "";
        }               
    }
}
