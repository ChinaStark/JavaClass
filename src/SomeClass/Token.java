package SomeClass;

import Pojo.Student;

import java.io.Console;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        System.out.println(i);
        StringTokenizer tokenizer = new StringTokenizer("kk");
//        System.out.println(tokenizer);
        StringTokenizer stringTokenizer = new StringTokenizer("you are welcome", " ");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
//        Random random = new Random();
//        System.out.println(random.nextInt(2)+1);
//
//        Student student = new Student();
//        Class<? extends Student> aClass = student.getClass();
//        System.out.println(Arrays.toString(aClass.getDeclaredConstructors()));
//        Console console = System.console();
//        System.out.println("kkkx");
//        char[] chars = console.readPassword();
//        System.out.println(chars);
    }
}
