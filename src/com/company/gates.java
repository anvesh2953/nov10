package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

/**
 * Created by anves on 11/14/2016.
 */
public class gates {
    public static int numGates(int[] a1, int[] a2){
        int i =0;
        int j =0;
        int gates =0;
        int max=0;
        sort(a2);
        while(i<a1.length & j<a2.length){
            if(a1[i]<a2[j]){
                i++;
                gates++;
                if(max<gates) max=gates;
            }
            else{
                j++;
                gates--;
            }

        }
        return max;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int [n];
        int[] arr2 = new int [n];
        for(int i =0; i<n ; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i =0; i<n ; i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(numGates(arr1,arr2)+"gates needed");
    }
}
