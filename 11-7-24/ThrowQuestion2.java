import java.io.*;

public class ThrowQuestion2 {

    public static void method() throws FileNotFoundException {

        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        try (BufferedReader fileInput = new BufferedReader(file)) {
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new FileNotFoundException();

    }

    public static void main(String args[]) {
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}