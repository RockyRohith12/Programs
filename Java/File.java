import java.io.*;

public class File {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("sample.txt"); 
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine(); 
            System.out.println("First Line: " + line);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file!");
        }
    }
}

