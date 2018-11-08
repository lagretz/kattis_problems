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
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            if(M >= 45) {
                System.out.println(H + " " + (M-45));
            }
            else {
                int leftOver = M - 45;
                int minutes = 60 + leftOver;
                int hours = 0;
                if(H == 0)
                   hours = 23;
                else
                    hours = H - 1;
                System.out.println(hours + " " + minutes);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
