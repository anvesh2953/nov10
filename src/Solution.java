import java.util.Stack;

import static java.lang.System.in;

/**
 * Created by anves on 12/18/2016.
 */
public class Solution {

    public static char oppo(char c){
        if(c=='{') return '}';
        else if (c=='(') return ')';
        else return ']';
    }
    static String[] braces(String[] values) {
        int l = values.length;
        String[] res=new String[l];
        boolean boo =true;
        int i =0;

        Stack<Character> st = new Stack<Character>();
        for(String s:values){
            boo = true;
            char []c = s.toCharArray();
            for(char x:c) {

                if (x == '{' | x == '(' | x == '[') {
                    st.push(x);
                } else {
                    if(st==null)
                    if (st.pop() != oppo(x)) {
                       res[i]="No";
                        boo = false;
                        i++;
                        break;
                    }
                }

            }
            if(boo==true & st==null) {
                res[i] = "Yes";
                i++;
            }
            else{
                res[i]="No";
                i++;

            }

        }

        return res;
    }

    public static void main(String[] args){

    }



}
