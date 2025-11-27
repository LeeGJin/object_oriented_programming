package Week13;

import java.util.Formatter;

public class PrintStream {
    public static void main(String[] args) {
        //1
        System.out.printf("%.2f\n", Math.PI);

        //2
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("Hello %s\n", "Hong Gil Dong");
        System.out.print(sb);

        //3
        String pi = String.format("%.2f",123.456);
        System.out.println(pi);
    }
}
