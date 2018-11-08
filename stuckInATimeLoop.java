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
            
            for(int i = 1; i < n + 1; i++) {
                System.out.println(i + " Abracadabra");
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
