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

            for(int i = 0; i < n; i++) {
               StringTokenizer st = new StringTokenizer(reader.readLine());
               int a = Integer.parseInt(st.nextToken());
               int b = Integer.parseInt(st.nextToken());
               int c = Integer.parseInt(st.nextToken());
               if(a + b == c || a - b == c || b - a == c 
                    ||(double)a / (double)b == c || (double)b / (double)a == c
                    || a * b == c)
                   System.out.println("Possible");
                else 
                  System.out.println("Impossible");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
  
