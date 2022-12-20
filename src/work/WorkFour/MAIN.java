package work.WorkFour;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[3];
        for (int i = 0; i < 3; i++){
            System.out.println("请输入:");
            int n = scanner.nextInt();
            if (n < 0){
                try {
                    throw  new RectTestexception();
                } catch (RectTestexception e) {
                    String message = e.getMessage();
                    System.out.println(message);
                }
            }
            a[i] = n;
        }
        if (a[0]* a[0] + a[1]* a[1] == a[2]* a[2]){
            System.out.println("这是一个三角形");
        }
        System.out.println("这不是一个三角形");

    }
}
