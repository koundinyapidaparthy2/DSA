package Linked;

import java.util.Collections;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args){
        LinkedList<String> listItems = new LinkedList<String>();
        // ? Insert or remove can take o(1) time
        listItems.add("Volvo");
        listItems.add("Gopal");
        listItems.add("People");
        listItems.add("Rajesh Chatri");
        listItems.addFirst("Margin");
        listItems.remove(0);
        
        // ? Access time is 0(1)
        System.out.println(listItems.get(0));
        // !sorting
        Collections.sort(listItems);
        System.out.println(listItems);
    }
}
