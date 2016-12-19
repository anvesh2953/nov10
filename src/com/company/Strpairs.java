package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by anves on 11/15/2016.
 */
public class Strpairs {

    public static int MatchPairs(String s){
        Stack st = new Stack();
        int i=0;
        int index =-1;
        if(!Character.isUpperCase(s.charAt(0))) return -1;
        while(i<s.length()){
            if(Character.isUpperCase(s.charAt(i))){
                st.push(s.charAt(i));
                i++;
            }
            else{
                if(Character.toLowerCase((char)st.pop())==s.charAt(i)){
                    index=i;
                    i++;
                }
                else{
                    return index;
                }

            }
        }
        return index;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        System.out.println(MatchPairs(s));
    }
}
