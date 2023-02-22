import java.io.*;

public class Main {
    public static void main(String[] args) {
String path = "input.txt";
String outputPath = "output.txt";
        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
            String currentLine = bufferedReader.readLine();
            while(currentLine!=null) {
                    String modifiedFile = currentLine.toUpperCase();
                    bufferedWriter.write(modifiedFile);
                    bufferedWriter.newLine();
                    currentLine= bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("No line: "+e.getMessage());
        }


    }

}
