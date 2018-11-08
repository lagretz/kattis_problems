import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            String st = reader.readLine();
            String[] arr = st.split(" ");
            System.out.println(arr[1]);
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


