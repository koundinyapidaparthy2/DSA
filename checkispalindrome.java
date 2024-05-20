import java.util.Scanner;

public class checkispalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String currentString = sc.nextLine().trim();
        StringBuilder updatedString = new StringBuilder(currentString);
        String reversedString = updatedString.reverse().toString().trim();
        if(currentString.compareTo(reversedString) == 0){
            System.out.println("Yes it is a palindrome");
        }
        else{
            System.out.println("No it is not a palindrome");
        }
    }
}
