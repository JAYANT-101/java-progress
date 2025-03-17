import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling  {
    public static void main(String[] args) {
        // Making a new file
        /*
        File MyFile=new File("Test.txt");
        try {
            MyFile.createNewFile();
        } catch (IOException e) {
            System.out.println("File not made");
            throw new RuntimeException(e);
        }


//        Code to write to a file
        try {
            FileWriter fileWriter=new FileWriter("Test.txt");
            fileWriter.write("Jayant is a god\nok");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File not made");
            throw new RuntimeException(e);
        }


//        Reading a file
        File myFile=new File("Test.txt");
        try {
            Scanner sc=new Scanner(myFile);
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

         */
//        Deleting a file
        File muFile=new File("Test2.txt");
        if(muFile.delete()){
            System.out.println("I have deleted "+muFile.getName());
        }
        else {
            System.out.println("some error occurred");
        }
    }
}
