import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    try{
        File myFile = new File("firstFile.txt");
        FileWriter myWriter = new FileWriter(myFile);
        Scanner myReader = new Scanner(myFile);
        if(myFile.createNewFile())
        {
            System.out.println("File "+ myFile.getName()+" is created.");
        }
        else
        {
            System.out.println("File "+ myFile.getName() +" exists");
        }
        myWriter.write("This is random text\nMore text");
        myWriter.close();
        System.out.println("Successfully wrote to file.");
        while(myReader.hasNextLine())
        {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }

    catch (IOException e)
    {
        System.out.println("Exception occurs");
        e.printStackTrace();
    }
    }
}
