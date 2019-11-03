import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(
            "F:\\Java\\Projects\\JavaRushTasks\\example\\src\\main\\resources\\FileInputStreamExample.txt");

        int i;
//        while ((i = fileInputStream.read()) != -1) {
//            System.out.print((char) i);
//            //System.out.print("-");
//        }

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        int j;
        while((j = bufferedInputStream.read())!= -1){
            System.out.print((char)j);
        }

    }
}