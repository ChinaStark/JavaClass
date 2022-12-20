package SomeClass;

import Pojo.Student;

import java.lang.reflect.Constructor;

public class ClassForinstance {
    public static void main(String[] args) {
        try {
            Class<?> cs = Class.forName("Pojo.Student");
            Constructor<?> declaredConstructor = cs.getDeclaredConstructor();
            Student o = (Student) declaredConstructor.newInstance();
            o.speak("jkh");
            System.out.println("\t\nRedbird".length());


            int i = Short.parseShort("568");
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
