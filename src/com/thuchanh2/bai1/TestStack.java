package com.thuchanh2.bai1;

import com.thuchanh2.bai1.Node;
import com.thuchanh2.bai1.Stack;

public class TestStack {
        public static void main(String[] args) {
                Node n1 = new Node(1, null);
                Node n2 = new Node(2, n1);
                Node n3 = new Node(3, n2);
                Node n4 = new Node(4, n3);
                Node n5 = new Node(5, n4);
                Node n6 = new Node(6, n5);
                Node n7 = new Node(7, n6);
                Node n8 = new Node(8, n7);

                Stack stack = new Stack(n7, 7);

                stack.display();
                System.out.println("Empty: " + stack.isEmpty());
                System.out.println("numOfElement: " + stack.numOfElement());
                stack.push(n8);
                stack.display();
        }
}
