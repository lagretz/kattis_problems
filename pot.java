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
            
            double arr[] = new double[n];
            
            for(int i = 0; i < n; i++) {
                int num = Integer.parseInt(reader.readLine());
                int pow = num % 10;
               
                String val = String.valueOf(num);
                String seperate = val.substring(0, val.length() - 1);

                int realNum = Integer.parseInt(seperate);
                arr[i] = Math.pow(realNum, pow);
            }
            
            int ans = 0;
            for(int j = 0; j < arr.length; j++) {
                ans = ans + (int)arr[j];
            }
            System.out.println(ans);
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
