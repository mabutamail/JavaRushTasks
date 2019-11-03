import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamExample {


    private static final String GREETINGS_MESSAGE = "My name is %s, my age is %d!" + "\n";


    public static void main(String[] arr) throws FileNotFoundException {
        PrintStream filePrintStream = new PrintStream(
            "F:\\Java\\Projects\\JavaRushTasks\\example\\src\\main\\resources\\PrintStreamExample.txt");

        filePrintStream.println(223344555);
        filePrintStream.println("Hello world");
        filePrintStream.println(false + "\n");

        filePrintStream.println("Hello!");
        filePrintStream.println("I'm robot!");
        //  !!!     printf    !!!
        filePrintStream.printf("My name is %s, my age is %d!" + "\n", "Amigo", 18);

        filePrintStream.printf(GREETINGS_MESSAGE, "Amigo", 18);
        filePrintStream.printf(GREETINGS_MESSAGE, "R2-D2", 35);
        filePrintStream.printf(GREETINGS_MESSAGE, "C-3PO", 35);

        filePrintStream.close();

        System.out.println("test ok");
    }
}