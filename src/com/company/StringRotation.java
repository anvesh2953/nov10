package com.company;

import java.util.Scanner;

/**
 * Created by anves on 11/14/2016.
 */
public class StringRotation {
    public static boolean IsRotation(String s1, String s2){
        int len = s1.length();
        if(s2.length()!=len) return false;
        String S = s1+s1;
        // return isSubstring(S,s2);
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();
        if(IsRotation(s1,s2)){
            System.out.println("A String is rotation of another");
        }
        else System.out.println("A String is not rotation of another");
    }
}
