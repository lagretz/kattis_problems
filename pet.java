import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 1; i < 6; i++){
                StringTokenizer st = new StringTokenizer(reader.readLine());
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total = total + Integer.parseInt(st.nextToken());
                }
                map.put(i, total);
            }
        
            int highest = 0;
            int winner = 0;
            for(int k : map.values()) {
                if(k > highest)
                    highest = k;
            }
            for(int e : map.keySet()) {
                if(map.get(e) == highest)
                    winner = e;
            }
            System.out.println(winner + " " + highest);
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
