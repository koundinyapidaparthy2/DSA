import java.util.Scanner;

public class stars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Integer Length");
        int val = sc.nextInt();
        for(int i = 0; i< val; i++){
            int j = 0;
            while( j <= i){
                if(j == i){
                    System.out.println("*");

                }else{

                    System.out.print("*");
                }
                j++;
            }
        }

    }
}
