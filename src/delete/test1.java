package delete;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        SimpleDateFormat simpleFormat =new SimpleDateFormat("HH:mm:ss");

        while (true) {
            String datastring = simpleFormat.format(new Date());
            System.out.println(datastring);
        }
    }
}
