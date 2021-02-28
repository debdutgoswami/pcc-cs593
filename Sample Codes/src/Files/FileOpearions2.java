package fileopearions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Contents of a file is written to the standard output device 
public class FileOpearions2 {
    
    public static void main(String[] args) {
        File f = null;
        FileReader fin = null;
            
        try {
            f = new File("input.txt");
            fin = new FileReader(f);
            int ch;  
           
            while((ch=fin.read())!= -1) {
                System.out.print((char)ch);
            }
        }
        catch(IOException e) {
            System.out.println(e);
        }
        finally {
            try {
                fin.close();                          
            }
            catch(IOException e) {
                System.out.println(e);
            }
        }
    }
}
