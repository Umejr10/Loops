import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class random1 {
    static Random random = new Random(); 
    public static void main(String[] args) {
        
        user(3, true);
        
    }
        public static <T, U> void user(int length, boolean value)
        {
                String abc = "abcdefghijklmnopqrstuvwxyz";
                String b = "";
                char c;
                List<Integer> s = new ArrayList<>();
            
                if (value == true && (length <= 26 && length >= 0)) 
                {
                    for (int i = 1; i<=length; i++) 
                    {
                        int r =  random.nextInt(26);
          
                        c = abc.charAt(r); // nimmt irgendein character aus "abc"
                        if (!b.contains(String.valueOf(c)) == true)  
                        {
                         // s.add(c);
                          b += c;
                          s.add(r);       
                        }
                        else if (b.contains(String.valueOf(c)) == true)
                        {
                            while(b.contains(String.valueOf(c)) == true) 
                            {
                                r =  random.nextInt(26);
                                c = abc.charAt(r);
                                if (b.contains(String.valueOf(c)) == true) 
                                {
                                    continue; 
                                }
                                else 
                                {
                                //s.add(c);
                                    b += c;
                                    s.add(r);
                                    break; 
                                }
                            }
            
                        }
                    }
       
                }
                else if (value != true && (length <= 26 && length >= 0)) 
                {
                    for (int i = 1; i<=length; i++) 
                    {
                        int r =  random.nextInt(26);
                        c = abc.charAt(r);
                        b += c;
                    }
                }
                else 
                {
                    System.out.println("An error has occured! Try again!");
                }
                System.out.println(b);
                System.out.println("Result " + s);
                
        }
    }

    
    

