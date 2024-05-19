import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to calculate");
        int iterator = sc.nextInt();
        System.out.println("Enter you integer in 1 line");
        while(iterator >=0){
            iterator --;

            //! Using String's

            // String nextIntegers = sc.nextLine();
            // int initialVal  = 0;
            // for(int i =0 ; i< nextIntegers.length();i++){
            //     String currentChar = nextIntegers.substring(i,i+1);
            //     initialVal += Integer.parseInt(currentChar);
            // }
            // System.out.println(initialVal);

            // ! Using integer method
            int initialVal  = 0;
            int nextInteger = sc.nextInt();
            
            while(nextInteger > 0){
                initialVal += nextInteger % 10;
                nextInteger = nextInteger / 10;
            }
            System.out.println(initialVal);
        }
    }
}
