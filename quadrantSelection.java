import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
        
            if(x > 0) {
                if(y > 0)
                    System.out.println("1");
                else
                    System.out.println("4");
            }
            else {
                if(y > 0)
                    System.out.println("2");
                else
                    System.out.println("3");
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

