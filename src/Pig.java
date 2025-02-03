public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) 
    {
        String[] sentenceList = sentence.split(" ");
        String[] newSentenceList = new String[sentenceList.length];
        for(int i =0; i<sentenceList.length; i++)
        {
            String word = sentenceList[i];
            if(!word.startsWith("a") && !word.startsWith("e") && !word.startsWith("i") && !word.startsWith("o") && !word.startsWith("u"))
            {
                char first = word.charAt(0);
                String body = word.substring(1, word.length());
                word = body+first+"ay";  
            }
            newSentenceList[i]= word;
        }
        
        String newSentence = "";
        for(String word: newSentenceList)
        {
            newSentence += word +" ";
        }

        return newSentence.substring(0,newSentence.length()-1);
    }









    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  