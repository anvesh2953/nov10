/**
 * Created by anves on 12/18/2016.
 */
import java.util.EmptyStackException;
import java.util.Scanner;
public class stack1<T>{
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        public StackNode(T data){
            this.data = data;
        }
    }
    private StackNode<T> top;
    public T pop(){
        if(top==null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }
    public void push(T item){
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }
    public T peek(){
        if(top == null) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top ==null;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        stack1 st = new stack1();
        st.push(3);
        st.push("Anvesh");
        st.push("Subhash");
        st.pop();
        st.pop();
        System.out.println(st.peek());
    }
}
