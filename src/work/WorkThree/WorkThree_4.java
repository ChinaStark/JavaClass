package work.WorkThree;

import java.util.ArrayList;

public class WorkThree_4 {
    public static void main(String[] args) {
        int i, j, s;
        ArrayList<Integer> integers = new ArrayList<>();
        for( i=2; i<=1000; i++ ){
            integers.clear();
            s=0;
            for( j=1; j<i; j++ ){
                if(i%j == 0){
                    s+=j;
                    integers.add(j);
                }
            }
            if(s == i){
                System.out.print(s+":");
                System.out.println(integers);
            }

        }
    }

}
