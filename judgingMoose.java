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
            int right = Integer.parseInt(st.nextToken());
            int left = Integer.parseInt(st.nextToken());
            
            if(right == left && left != 0 && right != 0) {
                System.out.println("Even " + (right+left));
            }
            else if(right != left) {
                int higher = 0;
                if(right > left)
                    higher = right;
                else
                    higher = left;
                System.out.println("Odd "+ (higher * 2));
            }
            else
                System.out.println("Not a moose");
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

