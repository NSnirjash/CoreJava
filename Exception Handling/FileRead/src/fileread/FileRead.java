/*
 * Question:
 * Write a Java program to create a method that reads a file and 
 * throws an exception if the file is not found.
 */
package fileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {
        try {
            readFile("File.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String File) throws FileNotFoundException {
        File f = new File("D://File.txt");

        Scanner scanner = new Scanner(f);

        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }

}
