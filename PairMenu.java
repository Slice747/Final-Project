import java.util.Scanner;

public class PairMenu extends Itse2417Main implements FinalProject
{
    public PairMenu()
    {
        
    }

    public void begin() 
    {
       
           
          Itse2417Main.myscan();
           System.out.print("Enter a string: ");
           String str = in.next();
     
           int position;
           int length;
           if (str.length() % 2 == 1)
           {
              position = str.length() / 2;
              length = 1;
           }
           else
           {
              position = str.length() / 2 - 1;
              length = 2;
           }
           String result = str.substring(position, position + length);
     
           System.out.println("Middle: " + result);
        }
     }
     
     