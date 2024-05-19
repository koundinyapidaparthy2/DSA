import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class bruteForce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("At Which number you want to stop");
            int stopTakingInputAt = sc.nextInt(); 
            List<Integer> storeIntegers= new ArrayList<Integer>();
            System.out.println("Please provide the integers");
            while(true){
                int userEnteredInput = sc.nextInt();
                if(stopTakingInputAt ==  userEnteredInput){
                    while(true){
                        if(storeIntegers.isEmpty()){
                            break;
                        }
                        else{
                            System.out.println(storeIntegers.remove(1));
                        }
                    }
                    break;
                }
                else{
                    storeIntegers.add(userEnteredInput);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("No input was provided. Please ensure you provide an input.");
        }
    }
}
