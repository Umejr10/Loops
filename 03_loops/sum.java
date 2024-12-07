
import java.util.Scanner;

public class sum {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //1 übung
        /* 
        System.out.print("Gebe eine zahl ein: ");
        int zahl = input.nextInt();
        int result = 0;
        for (int i = 0; i <= zahl; i++) 
        {
            result += i;
        }
        System.out.println(result);
         */

        //2 Übung
        System.out.print("Gebe eine zahl ein: ");
        int zahl = input.nextInt();
        double result = 0;
        for (int i = 2; i <= zahl; i++) {
            
            result += 1.0 / (i * i);
        }

        System.out.printf("%f", result); 

        
}
}
