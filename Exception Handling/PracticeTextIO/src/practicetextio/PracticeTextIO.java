
package practicetextio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PracticeTextIO {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D:\\New folder\\File2.txt");
        PrintWriter write = new PrintWriter(f);
        write.print("I want to Write here Something. \n");
        write.append("JAVA is fucking shit.\n");
        write.append("Kichu hobe na amare diya.\n");
        write.append("Lav los kichu nai, jibontai pura los!\n");
        write.close();
        
        Scanner s = new Scanner(f);
        System.out.println(s.nextLine());
        
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
        s.close();
    }
    
}
