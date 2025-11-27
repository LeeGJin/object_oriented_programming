package Week13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("newHello.txt");

        String s = "Hello new world";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            f.write((byte) ch);
        }
        f.write('\r');
        f.write('\n');
        f.close();
    }
}
