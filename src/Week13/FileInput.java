package Week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("test.txt"));
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
