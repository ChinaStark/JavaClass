package work.weekFive;

import java.util.Arrays;
import java.util.Comparator;

public class sortClass {
    public static void main(String[] args) {
        //1、对10个整数进行降序排序并输出。
        Integer[] a = {1,6,3,4,5,9,8,7,10,0};
        Arrays.sort(a, (o1, o2) -> o2 - o1);//when return true the change will be implements (change the o1 and o2)
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + "  ");
        }
    }


}
