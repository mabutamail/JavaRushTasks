import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RuntimeEx {

    public static void main(String[] args) {
        String gnomeOpenCommand = "calc.exe //home//user//Documents//MyDoc.pdf";

        try {
            Runtime rt = Runtime.getRuntime();
            Process processObj = rt.exec(gnomeOpenCommand);

            InputStream stdin = processObj.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            BufferedReader br = new BufferedReader(isr);

            String myoutput = "";

            while ((myoutput=br.readLine()) != null) {
                myoutput = myoutput+"\n";
            }
            System.out.println(myoutput);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}