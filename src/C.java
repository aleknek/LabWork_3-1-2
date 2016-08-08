import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C {

    public void readFiles(String[] arrayStringPath) throws ArrayIndexOutOfBoundsException, FileNotFoundException, IOException {

        String dir = null;

        try {
            dir = arrayStringPath[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        if (dir == null) {
            throw new FileNotFoundException("ERROR: File not found");
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dir));

        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
