import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        C c = new C();
        try {
            c.readFiles(args);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
