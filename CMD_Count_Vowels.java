import java.util.HashMap; 
import java.util.Scanner;

/**Java CMD program for counting the vowels of the entered text.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Count_Vowels{

    /** main class for interacting with the user */
    public static void main(String[] args){

        /** while loop to keep the program running */
        while(true){
            System.out.println("Please enter your text: ");
            Scanner input = new Scanner(System.in);

            /** reading the next line of text and storing it in a string variable*/
            String input_Text = input.nextLine();

            /** passing the lower cased text to vowels_counter method and storing the result in result hashmap variable */
            HashMap result = vowels_Counter(input_Text);
            System.out.println("There are  " 
                +result.get('a')+ " a,  "
                +result.get('e')+ " e,  "
                +result.get('i')+ " i,  "
                +result.get('o')+ " o,  "
                +result.get('u')+ " u  in this text.");
            System.out.println("**************************");
        }
    }

    /** 
     * method for counting the vowels
     * @param text  String text 
     * @return vowels   a hashmap of vowel chracters and their counts   
     * <pre>
     *      vowels_Counter("HELLOW world"); // Output: {a=0, e=1, u=0, i=0, o=2}
     *      vowels_Counter("HHHSSS"); // Output: {a=0, e=0, u=0, i=0, o=0}   
     * </pre>
    */
    public static HashMap vowels_Counter(String text){

        /** initializing some variables to store the counts of different vowels */
        int a, e, i, o, u;
        a = e = i = o = u = 0;

        /** lower casing the text for counting the captial letters and small letters of a vowel as one */
        String Lower_Cased_Text = text.toLowerCase();
        for(int j=0; j<text.length(); j++){
            switch (Lower_Cased_Text.charAt(j)){
                case 'a':
                    a++;
                    break;

                case 'e':
                    e++;
                    break;

                case 'i':
                    i++;
                    break;

                case 'o':
                    o++;
                    break;

                case 'u':
                    u++;
                    break;
            }
        }
    HashMap<Character, Integer> vowels = new HashMap<Character, Integer>();
    vowels.put('a',a);
    vowels.put('e',e);
    vowels.put('i',i);
    vowels.put('o',o);
    vowels.put('u', u);
    return vowels;
    }
}
