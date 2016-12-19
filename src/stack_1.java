/**
 * Created by anves on 12/19/2016.
 */
import java.util.EmptyStackException;
import java.util.Scanner;
public class stack_1{
    private int stack_size;
    private int [] values;
    private int[] sizes;
    private int numofstacks = 3;
    stack_1(int stack_capacity){
        this.stack_size=stack_capacity;
        values = new int[stack_capacity*stack_size];
        sizes = new int[numofstacks];
    }
    public int indexoftop(int snum){

        int offset = snum * stack_size;
        return offset+sizes[snum]-1;
    }
    public void push(int value, int stackNum) {
        if(isfull(stackNum));
        values[indexoftop(stackNum)+1] = value;
        sizes[stackNum]++;
    }
    public int pop(int snum){
        if(isEmpty(snum)) throw new EmptyStackException();
        int value = values[indexoftop(snum)];
        values[indexoftop(snum)]=0;
        sizes[snum]--;
        return value;
    }
    public int peek(int snum){
        if(isEmpty(snum)) throw new EmptyStackException();
        return values[indexoftop(snum)];
    }
    public boolean isfull(int snum){
        return sizes[snum]==stack_size;
    }
    public boolean isEmpty(int snum){
        return sizes[snum]==0;
    }


    public static void main(String[] args){
        stack_1 st = new stack_1(5);
        st.push(3,0);
        st.push(4,1);
        st.push(5,1);
        st.push(9,2);
        st.push(8,2);
        st.pop(1);
        st.pop(2);
        System.out.println(st.peek(0)+" "+st.peek(1)+" "+st.peek(2));

    }
}