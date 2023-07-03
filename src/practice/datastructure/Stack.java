package practice.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {
    private Object[] arry;
    private int index=0;
    void push(Object data){
        if(arry==null){
            arry = new Object[index+1];
        }else {
            arry = Arrays.copyOf(arry, index+1 );
        }
        arry[index]=data;
        index = index+1;
    }
    void pop(){
        Object[] copyArray = new Object[index-1];
        for (int i = 1; i < arry.length; i++) {
            copyArray[i-1]=arry[i];
        }
        index = index-1;
        arry = copyArray;
    }

    void printStack(){
        System.out.println(Arrays.toString(arry));
    }
    public static void main(String[] args) {
        int oldCapacity = 12;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println("new capacity is "+newCapacity);
        List<String> myList = new ArrayList<>();
        myList.add("Saket");
        Stack st = new Stack();
        st.push(12);
        st.push(15);
        st.push(17);
        st.printStack();
        st.pop();
        System.out.println("after pop..");
        st.printStack();
        System.out.println("after push..");
        st.push(20);
        st.printStack();
    }
}
