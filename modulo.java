import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            
            String test = "";
            ArrayList<Integer> combos = new ArrayList<>();
            while((test = reader.readLine())!=null) {
                int mod = Integer.parseInt(test) % 42;
                if(!combos.contains(mod))
                    combos.add(mod);
            }
            System.out.println(combos.size());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
