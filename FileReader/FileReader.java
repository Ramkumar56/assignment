import java.io.*;
import java.io.File;

public class FileReader {
    public static void main(String[] args)  {
        File file = new File("C:\\Users\\Lenovo\\Notepad\\example.txt");
        //Writer
        FileWriter Fwriter= null;
        try {
            Fwriter = new FileWriter(file);
            BufferedWriter BuffWriter = new BufferedWriter(Fwriter);
            BuffWriter.write("Zoho");
            BuffWriter.newLine();
            BuffWriter.write("Zoho School for Graduate");
            BuffWriter.flush();

            //Reader
           // FileReader Freader= new FileReader(file);
            BufferedReader BuffReader= new BufferedReader(new java.io.FileReader(file));
            String line=BuffReader.readLine();
            int lineCount=0;
            int wordCount=0;
            int charCount=0;
            while(line!=null){
                lineCount++;
                String[] words=line.split(" ");
                wordCount=wordCount+words.length;
                charCount=charCount+line.length();
                line=BuffReader.readLine();
            }


            System.out.println("Number of lines  "+lineCount);
            System.out.println("Number of words  "+wordCount);
            System.out.println("Number of characters "+charCount);


            BuffWriter.newLine();
            BuffWriter.newLine();
            BuffWriter.write("Number of lines "+lineCount);
            BuffWriter.newLine();
            BuffWriter.write("Number of Words "+wordCount);
            BuffWriter.newLine();
            BuffWriter.write("Number of characters "+charCount);
            BuffWriter.flush();
            BuffWriter.close();
        } catch (IOException e) {

        }


    }
}
