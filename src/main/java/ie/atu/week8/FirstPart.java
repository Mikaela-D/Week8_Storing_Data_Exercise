package ie.atu.week8;

import java.io.*;

public class FirstPart {
    public static void main(String[] args) {
        {
            File myFile = new File("myFile1.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());
            String content = "Details to write";
            try {
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("Hello world");
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
