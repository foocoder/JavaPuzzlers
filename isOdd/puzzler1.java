import java.io.IOException;
import java.util.Scanner;

class puzzler1{
    public static boolean isOdd(int i){
        System.out.println(i&1);
        return ( i&1 ) ==1;
    }
    public static void main(String args[]) throws IOException{
        System.out.print("Input a Interger:");
        Scanner cin = new Scanner(System.in);
        int i = cin.nextInt();
        System.out.println("\nThe Input number is :"+i);
        System.out.println("The number input isOdd:"+isOdd(i));
    }

}
