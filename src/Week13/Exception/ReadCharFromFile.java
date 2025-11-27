package Week13.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharFromFile {
    int readCharFromFile(String filename) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(filename);
        int ch = f.read();

        f.close();
        return ch;
    }

    int readCharFromFile1(String filename) {
        int ch = 0;
        try (FileReader f = new FileReader(filename)) {
            ch = f.read();
        } catch (FileNotFoundException e) {
            System.out.println("file not found\n");
        } catch (IOException e) {
            System.out.println("i/o error\n");
        }
        return ch;
    }

    public static void main(String[] args) {
        ReadCharFromFile f = new ReadCharFromFile();
        try {
            int ch = f.readCharFromFile("test3.txt");
            System.out.println((char) ch);
        } catch (FileNotFoundException e) {
            System.out.println("file not found\n");
        } catch (IOException e) {
            System.out.println("i/o error\n");
        }
    }
}
