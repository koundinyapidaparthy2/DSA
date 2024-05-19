import java.util.Scanner;
public class mutlitply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide 1st integer");
        long firstValue = sc.nextLong();
        System.out.println("Please provide 1st integer");
        long secondValue = sc.nextLong();
        long finalOutput = firstValue * secondValue;
        System.out.println(" Multiply those values this is the output "+ finalOutput);
    }
}