
package practicebinaryio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeBinaryIO {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("D:\\New folder\\File3.dat");
        FileOutputStream fos = new FileOutputStream(f);
        for(int i = 1; i <=100; i++){
            fos.write(i);
        }
        
        FileInputStream fis = new FileInputStream(f);
        System.out.println(fis.read());
        
        int value;
        while ((value = fis.read())!=-1) {
            
            System.out.println(value);
        }
    }
    
}
