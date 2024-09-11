import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReaderWriter {
    public static void main(String[] args) {
        
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt"; 

        try (InputStream inputStream = new FileInputStream(inputFilePath);
             OutputStream outputStream = new FileOutputStream(outputFilePath)) {

    
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File content has been copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
