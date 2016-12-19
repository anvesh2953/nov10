package cracking_coding;

import java.util.Scanner;

/**
 * Created by anves on 12/17/2016.
 */
class Node{

    int data;
    Node next= null;

}
class partialsum{
    Node sum = null;
    int carry =0;
}
public class sumlist {

    public static void addlist(Node header , int x){

        if(header==null){
            header.data=x;
            return;
        }
        Node curr = header;
        while(curr.next!=null){
            curr = curr.next;
        }
        Node n = new Node();
        n.data = x;
        curr.next = n;
    }
    public static Node insertleft(Node h,int x){
      if(h==null){
          Node n = new Node();
          n.data = x;
          return n;
      }
      Node n = new Node();
        n.data = x;
        n.next = h;
        return n;
    }
    public static partialsum addition(Node h1,Node h2){
        if(h1==null & h2==null){
            partialsum sum = new partialsum();
            return sum;
        }
        partialsum sum = addition(h1.next,h2.next);
        int val = h1.data+h2.data+sum.carry;
        sum.sum =insertleft(sum.sum,val%10);
        sum.carry = val/10;
        return sum;
    }
    public static Node leftpad(Node h, int x){
       for(int i=0;i<x;i++){
           Node n = new Node();
           n.data = 0;
           n.next =h;
           h = n;
       }
       return h;
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lengths of the lists");
        int n = sc.nextInt();
        int m = sc.nextInt();
        Node head1 = new Node();
        Node head2 = new Node();
        System.out.println("Enter list values");
        head1.data = sc.nextInt();


        for(int i=0;i<n-1;i++) {
            addlist(head1, sc.nextInt());
        }
        head2.data = sc.nextInt();


        for(int i=0;i<m-1;i++) {
            addlist(head2, sc.nextInt());
        }
        if(n<m){
            head1 = leftpad(head1,m-n);
        }
        else{
            head2 = leftpad(head2,n-m);
        }

        Node curr1 = head1;
        partialsum sum = addition(head1,head2);
        Node curr = sum.sum;
        if(sum.carry==1){
            curr=insertleft(curr,1);
        }
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        /*Node curr2 = head2;
        while(curr2!=null){
            System.out.println(curr2.data);
            curr2=curr2.next;
        }*/





    }
}
