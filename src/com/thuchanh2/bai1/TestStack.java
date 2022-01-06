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
            /*
                anh ví dụ nhé đầu tiên em có 7 cuốn sách là n1,n2,n3,n4,n5,n6,n7
                sau đó em xếp 7 cuốn vào trước (Stack stack = new Stack(n7, 7);)
                còn để 1 cuốn ra ngoài là n8
                nếu như em lại lấy 7 cuốn trước ra rồi xếp lại thì là (Stack stack = new Stack(n8, 8;)
                => nếu làm như này thì có phải em mất công mất sức không "nghĩa là thay vì em xếp lại để cho nó có 8 cuốn thì em chỉ cần đặt cuốn ở ngoài vào là đc đk anh"
                khi em có 7 cuốn sách em xếp vào giá xếp nhé. Mai em có thêm 1 cuốn nữa thay vì em lôi tất cả nó ra rồi xếp 8 cuốn lại
                thì em chỉ cần bỏ cuốn thứ 8 vào thôi (ý nghĩa của hàm push là vậy)  vâng ý trên em hiểu như anh ấy, em hiểu rồi
                oke em còn nữa em phải hiểu cái Stack stack = new Stack(n7, 7); là lần xếp đầu tiên

                Thay vì đó em làm thêm hàm push(Hàm này em thấy nó lấy giá trị cũ không. Chính cái đó nó chỉ cho mình biết là hiện
                 tại giá xếp đã có 7 sách rồi nếu cho thêm nữa vào thì nó sẽ là 8 sách
                 ) thì tự khác nó sẽ xếp thằng 8 vào và nó trả ra cho em 1 cái ngăn xếp có 8 cuốn sách
                nó là hàm này stack.push(n8);
                còn cái stack.display(); là hàm để hiển thị thôi
                Em hiểu đc mấy phần trên a nói:

            */
                Stack stack = new Stack(n7, 7);

                stack.display();
                System.out.println("Empty: " + stack.isEmpty());
                System.out.println("numOfElement: " + stack.numOfElement());
//              stack.pop();
//              stack.display();

                stack.push(n8);
                stack.display();
        }
}
