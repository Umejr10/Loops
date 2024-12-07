import java.util.Scanner;

public class even_odd {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
        /*
        System.out.print("Enter a number: ");
        int zahl = input.nextInt();
        System.out.print("Even: ");
        
        for (int i = 0; i <= zahl; i++) 
        {
            if (i % 2 == 0) 
            {
               System.out.print(i + " ");
            }
        }

        System.out.println("");
        System.out.print("Odd: ");
        for (int i = 0; i <= zahl; i++) 
        {
            if (i % 2 == 1) 
            {
               System.out.print(i + " ");
            }
        } */
        int zahl1 = Integer.parseInt(args[0]);
        int zahl2 = Integer.parseInt(args[1]);
        System.out.print("Even: ");
        for (int i = zahl1; i <= zahl2; i++) 
        {
            if (i % 2 == 0) 
            {
               System.out.print(i + " ");
            }
           
        }
        System.out.println("");
        System.out.print("Odd: ");
        for (int i = zahl1; i <= zahl2; i++) 
        {
            if (i % 2 == 1) 
            {
                System.out.print(i + " ");
            }
        }
    
    }
   
}