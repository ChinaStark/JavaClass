package Test;

import java.util.Random;

public class demoFour {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(26)+97;
        System.out.println(Character.toString(i));
    }
}
