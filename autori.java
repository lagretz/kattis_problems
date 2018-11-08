import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
            String fullName = reader.readLine();
            int n = fullName.length();
            
            String shortVer = "";
            for(int i = 0; i < n; i++) {
                if(Character.isUpperCase(fullName.charAt(i))) {
                    shortVer = shortVer + fullName.charAt(i);
                }   
            }
            System.out.println(shortVer);
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

