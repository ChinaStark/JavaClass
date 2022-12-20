package Question.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class fun {
    public static void main(String[] args) {
        Object[][] ints = new Object[2][9];
        ints[1] = new Object[]{"fgfx"};
        ints[0] = new Object[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.deepToString(ints));
        System.out.println(System.identityHashCode(ints));
        System.out.println(System.identityHashCode(ints[0]));
    }
}
