package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> currentArrayDetails = new ArrayList<String>();
        Predicate<String> isExist = current -> current == "Gopal";
        // ? Insert or remove time is o(n)
        currentArrayDetails.add("Gopal");
        currentArrayDetails.add("rajesh");
        currentArrayDetails.add(0,"At First");
        // currentArrayDetails.remove(0);
        currentArrayDetails.removeIf(isExist);
        currentArrayDetails.remove(0);

        // ? Access time is 0(1)
        System.out.println(currentArrayDetails.get(0));
        
        // !sorting
        Collections.sort(currentArrayDetails);
        for( String i: currentArrayDetails){
            System.out.println(i);
        }
    } 
}
