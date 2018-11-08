import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            
                int nums = Integer.parseInt(reader.readLine());

                for(int i = 0; i < nums; i++) {
                    
                    int test = Integer.parseInt(reader.readLine());

                    if(test % 2 == 0)
                        System.out.println(test + " is even");
                    else
                        System.out.println(test + " is odd");
                }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

