import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            
            int faktor = a * (f - 1) + 1;
            System.out.println(faktor);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

