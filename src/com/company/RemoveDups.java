package com.company;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NodeCounterGenerator;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by anves on 11/17/2016.
 */

class Node{
    int data;
    Node next=null;

}

public class RemoveDups{




    public static Node insert(Node head, int data){
        Node curr =head;
        if(curr==null){
            curr.data = data;
        }
        while(curr.next!=null){
            curr=curr.next;
        }
        Node n = new Node();
        n.data = data;
        curr.next =n;
        return head;
    }

    public static Node sumlist(Node head1, Node head2){
        int sum1=0;
        int sum2 =0;
        int carry =0;
        int i=0;
        Node curr = new Node();
        Node head = curr;
        /*if(head1==null | head1.next==null ){
            sum1=head1.data;
        }
        if(head2==null | head2.next==null ){
            sum2=head2.data;
        }*/
        while(head1.next!=null | head2.next!=null){
            sum1=head1.data+head2.data + carry;
            carry = sum1/10;
            head = insert(head,sum1%10);
            curr = curr.next;
        }
        i=0;
        /*while(head2.next!=null){
            sum2=sum2+head2.data*(int)Math.pow(10,i);
            head2=head2.next;
            i++;
        }
        return sum1+sum2;*/
        return head;

    }
    public static void partition(Node head, int k){
        Node start = head;
        Node end = head;
        head = head.next;
        while(head!=null) {

            if (head.data < k) {


                head.next = start;
                start = head;
            } else {

                end.next = head;
                end = head;
            }
            head = head.next;
        }
        Node curr =start;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

    public static void main(String [] args){
        //LinkedList <Integer> ll = new LinkedList<Integer>();
        Node head1 =new Node();
        Node head2 = new Node();
        int k=0;

        Scanner sc = new Scanner(System.in);

            head1.data = sc.nextInt();
            for (int i = 0; i < 3; i++) {
                head1 = insert(head1, sc.nextInt());
            }
        for (int i = 0; i < 3; i++) {
            head2 = insert(head2, sc.nextInt());
        }

            //System.out.println("Enter partiion element");
            //k = sc.nextInt();
        Node head = sumlist(head1, head2);
        while(head!=null) {
            System.out.println(head.data);
            head = head.next;
        }

           // partition(head, k);







    }
}
