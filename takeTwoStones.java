import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            int n = Integer.parseInt(reader.readLine());
            
            if(n % 2 != 0)
                System.out.println("Alice");
            else
                System.out.println("Bob");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

