package Day05_ExceptionAndFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        // to create new file
        /*
         * File myFile = new File("demoFile.txt");
         * try {
         * myFile.createNewFile();
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         */

        // code to write a file
        // FileWriter fileWriter = new FileWriter("demoFile.txt");

        // fileWriter.write("this is first file created ");
        // fileWriter.write("Hello hiii ");
        // fileWriter.write("Khana khake jana ho!");
        // fileWriter.write("Main to thak gye! ");
        // fileWriter.close();

        // // Reading of file
        // File myFile = new File("demoFile.txt");
        // Scanner sc = new Scanner(myFile);
        // while (sc.hasNextLine()) {
        // String line = sc.nextLine();
        // System.out.println(line);
        // }
        // sc.close();

        // deleting of file
        File myFile = new File("demoFile.txt");
        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("some error");
        }

    }
}
