package SomeClass;

import java.nio.charset.StandardCharsets;

public class Stringfun {
    public static void main(String[] args) {
        String str = "abc你好";
        byte[] bytes = str.getBytes();
        System.out.println(new String(bytes,0,6));
    }
}
