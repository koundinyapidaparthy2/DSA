/*
 * Given a string Master = "Krishna is a handsome boy"
 * Reverse the above words of the string
 * Expect output would be " anhsirK si a emosdnah yob"
 * 
 */

import java.util.Scanner;

public class ReverseWords {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String userInput = sc.nextLine();
    sc.close();
    // String[] SplitingString = userInput.split(" ");
    // String finalOutput = "";
    // for(int i=0;i<SplitingString.length;i++){
    //     String updatedCurrentString = "";
    //     for(int j=0; j<SplitingString[i].length();j++){
    //         updatedCurrentString = SplitingString[i].charAt(j) + updatedCurrentString;
    //     }
    //     finalOutput += updatedCurrentString + " ";
    // }
    // System.out.println(finalOutput);

    // ! here time complexity is n*2

    String[] words = userInput.split(" ");
    StringBuilder finalOutput = new StringBuilder();
    for( String currentWord: words){
        StringBuilder reverseWord = new StringBuilder(currentWord);
        finalOutput.append(reverseWord.reverse()).append(" ");
    }
    System.out.println(finalOutput.toString().trim());
   } 
}
