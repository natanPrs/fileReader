import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\conta\\IdeaProjects\\readerFiles9\\Mouses.txt.txt";

        try {
            File file = new File(filePath);

            if (file.exists()) {
                FileInputStream fileInput = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInput);
                BufferedReader reader = new BufferedReader(inputStreamReader);

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                reader.close();
                inputStreamReader.close();
                fileInput.close();


            } else {
                System.out.println("The file does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}