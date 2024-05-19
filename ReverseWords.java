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
    String[] SplitingString = userInput.split(" ");
    String finalOutput = "";
    for(int i=0;i<SplitingString.length;i++){
        String updatedCurrentString = "";
        for(int j=0; j<SplitingString[i].length();j++){
            updatedCurrentString = SplitingString[i].charAt(j) + updatedCurrentString;
        }
        finalOutput += updatedCurrentString + " ";
    }
    System.out.println(finalOutput);
   } 
}
