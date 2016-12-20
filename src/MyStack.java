/**
 * Created by anves on 12/20/2016.
 */
import java.util.Stack;
public class MyStack{
    public static Stack sort_stack(Stack <Integer> s){
        Stack<Integer> buffer = new Stack<Integer>();
        while(!s.isEmpty()){
            int temp = s.pop();
            while(!buffer.isEmpty() && temp<buffer.peek() )
            {
                s.push(buffer.pop());
            }
            buffer.push(temp);
        }
        return buffer;
    }
    public static void main(String [] args){
        Stack st = new Stack();
        st.push(5);
        st.push(6);
        st.push(3);
        st.push(19);
        st.push(-9);
        Stack b = sort_stack(st);
        while(!b.isEmpty()){
            System.out.println(b.pop());
        }
    }

}
