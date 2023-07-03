package practice.datastructure;

import java.util.Arrays;

public class ArrayCopy {
    static int size ;
    static Object[] array;
    public static void remove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(array, index+1, array, index,
                    numMoved);
        array[--size] = null; // clear to let GC do its work
    }
    public static void main(String[] args) {
        array = new Object[]{1,2,4,12,45,23,34};
        size = array.length;
        remove(2);
        System.out.println(Arrays.toString(array));
        System.out.println(1%2);
    }
}
