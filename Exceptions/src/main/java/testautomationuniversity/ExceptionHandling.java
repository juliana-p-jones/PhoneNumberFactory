package testautomationuniversity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        createNewFile();
        numbersExceptionHanding();
    }
    static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        //this line is the code we want to try
        try{file.createNewFile();
        //if this exception happens then...
            //if we wanted it to catch ANY exception, we can use polymorphism to catch all types of exceptions using Exception
        }catch (IOException ex){
            System.out.println("Directory does not exist.");
            ex.printStackTrace();
        }
    }
    public static void numbersExceptionHanding(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        //we COULD instantiate the fileReader in parenthesis after Try, and it would automatically close after trying it, instead of relying on a "finally" end statement
        try{
            fileReader = new Scanner(file);
        while(fileReader.hasNext()) {
            double num = fileReader.nextDouble();
            System.out.println(num);
        }
        //we can use the or symbol to include multiple exceptions
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
            //broad Exception must be listed last so these two can get printed first
        //}catch(Exception e){
        //}
        } finally{
            fileReader.close();
        }
    }
}
