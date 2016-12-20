import java.util.Stack;

/**
 * Created by anves on 12/20/2016.
 */
public class stackWithmin extends Stack<Integer> {
    Stack<Integer> s;
    public stackWithmin(){
        s = new Stack<Integer>();
    }
    public void push(int val){
        if(val<min()){
            s.push(val);
        }
        super.push(val);
    }
    public Integer pop(){
        int val = super.pop();
        if(val==min()){
            s.pop();
        }
        return val;
    }



    public int min(){
        if(this.isEmpty()) return Integer.MAX_VALUE;
        return s.peek();
    }

    public static void main(String [] args){
        stackWithmin s = new stackWithmin();
        s.push(5);
        System.out.println(s.min());
        s.push(3);
        System.out.println(s.min());
        s.push(-5);
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.push(-10);
        System.out.println(s.min());
        s.push(7);
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
    }
}
