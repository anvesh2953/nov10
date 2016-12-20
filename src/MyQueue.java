import java.util.Stack;

/**
 * Created by anves on 12/20/2016.
 */
public class MyQueue<T>{
    Stack<T> st_push = new Stack<T> ();
    Stack <T> st_pop = new Stack <T> ();
    public void Enqueue(T d){
        st_push.push(d);
    }
    public T Dequeue(){
        if(st_pop.isEmpty()){
            while(!st_push.isEmpty())
            {
                st_pop.push(st_push.pop());
            }
        }
        return st_pop.pop();
    }
    public static void main(String[] args){
        MyQueue q = new MyQueue();
        q.Enqueue(5);
        q.Enqueue(8);
        q.Enqueue(-7);
        System.out.println(q.Dequeue());
        q.Enqueue(9);
        System.out.println(q.Dequeue());

    }
}
