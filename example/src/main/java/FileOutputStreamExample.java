import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(
            "F:\\Java\\Projects\\JavaRushTasks\\example\\src\\main\\resources\\FileOutputStreamExample.txt",
            true);

        String greetings = "Привет! Добро пожаловать на JavaRush!\n";

        fileOutputStream.write(greetings.getBytes());

        fileOutputStream.close();
    }
}