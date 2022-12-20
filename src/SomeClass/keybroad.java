package SomeClass;

import java.io.Console;

public class keybroad {
    public static void main(String[] args) {
        Console console = System.console();
        char[] chars = console.readPassword();
        System.out.println(chars);

    }
}
