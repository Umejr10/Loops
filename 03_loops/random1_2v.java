
import java.util.Random;

public class random1_2v {

    static Random rnd = new Random();

    public static void main(String[] args) 
    {
        user(5, false);
    }

    public static void user(int length, boolean unique) 
    {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder b = new StringBuilder();

        if (length > 26 || length < 0) 
        {
            System.out.println("An error has occurred! Try again!");
            return;
        }

        if (unique == true) 
        {
            boolean[] used = new boolean[26];
            int zähler = 0;

            while (zähler < length) 
            {
                int r = rnd.nextInt(26);
                if (!used[r])  // Prüfen, ob der Buchstabe schon verwendet wurde
            { 
                    b.append(abc.charAt(r)); // Hinzufügen des Buchstabens
                    used[r] = true;          // Markieren als verwendet
                    zähler++;
            }    
            }
        }
        else 
        {
            for (int i = 0; i < length; i++) {
                int r = rnd.nextInt(26);
                b.append(abc.charAt(r)); // Hinzufügen ohne Prüfung
        }
    }
    System.out.println("Result: " + b.toString());
    
}
}
