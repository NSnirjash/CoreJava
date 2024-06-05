
package textio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class TextIO {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\File.txt");
        PrintWriter write = new PrintWriter(f);
        write.print("I want to Write here Something. \n");
        write.append("JAVA is fun.\n");
        
        write.close();
        
        Scanner s = new Scanner(f);
        System.out.println(s.nextLine());
        
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
        s.close();
    }
    
}
