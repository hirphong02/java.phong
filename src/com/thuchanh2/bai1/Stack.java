package com.thuchanh2;


public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public Stack(Node top, int size) {
        this.top = top;
        this.size = size;
    }

    // đẩy phần tử lên trên cùng của stack
    public void push(Node node) {
        //private int item;
        //private Node next;

        node.setNext(top); // set lại thuộc tính next cho node truyền vào bằng top hiện tại của Stack
        this.setTop(node); // khi Node truyền vào đã đc set lại next tiếp đến là dùng cái node do truyền vào cho Stack
        this.size ++; //Tăng size cho Stack
        // Mục đích của hàm này là dùng set lại giá trị cho Stack;
        /* ví dụ đầu tiên node
         Node n1 = new Node(1, null);
        Node n2 = new Node(2, n1);
        Node n3 = new Node(3, n2);
        Node n4 = new Node(4, n3);
        Node n5 = new Node(5, n4);
        Node n6 = new Node(6, n5);
        Node n7 = new Node(7, n6);
        Hiện tại chỉ có từ n1 => n7
        Stack stack = new Stack(n7, 7);
        => top hiện tại đang = n7 => index =7, top = n7

        nghĩa là rút 7 thì đến n6 à anh
        Không phải em, cái này nó hơi trìu tượng nên a đang tìm cách giải thích
        Em thấy n7 nó chứ n6 không (Node n7 = new Node(7, n6)); vâng

        Node n8 = new Node(8, n7);

        stack.push(n8); n8 là tham so truyền vào có index là 8, n7 là node next
        dòng node.setNext em hiểu đơn giản là n8 truyền vào đang là (8, n7) thì giờ n8 giá trị next của n8 bị thay đổi bằng top hiện tại(node.setNext(top))
        mà top hiện tại đang là n7
        => n8 = (8,n7) => giá trị vẫn giữ nguyên => node.setNext(top); hàm này bị thừa (cái này không hẳn là thừa mà nó dùng khi stack chưa có giá trị hiện tại em nhé)

        => this.setTop(node); gán top mới(n8) với gán size mới(size cũ đang là 7 => size mới = size cũ +1 = 8)
        => stack có giá trị mới là top = n7 và size = 8  => stack(8, n8)
        => nó tượng tự như mình gắn Stack stack = new Stack(n7, 7) => cái này là thủ công còn cái push là dùng theo phương thức;
        stack.display();
        anh ơi thằng n7 là top à
        còn last in first out thì s anh
        last in first là gì em
        ví dụ em xếp 1 chồng bát em xếp 5 cái bát thì cái cuối cùng là cái mình lấy ra đầu tiên
        nó có cái index đó em //index là gì v a
        thực ra nó là thế này trong stack nó chứ size với node top
        size thì em biết đc khi em getSize ra là em biết có mấy cái bát
        từ size em sẽ biết được là Node top đi cùng với nó là gì
        mà trong Node lại có thuộc tính index => lấy index của nó ra thì dùng top.getIndex
        cái bài này là lớp chồng lớp lên nó hơi rối
        vì nếu khai báo private Node top thì tương tự top nó là con của class Node và có các thuộc tính như index và Node next
        trong next nó lại tương tự như Node top lại có thuộc tính index vs Node next
        => cái bài toán này nó là vòng tròn
        em phải hiểu đc lớp và đối tượng tạo từ lớp
        anh gth pop đi a
        pop nó chỉ là kiểm tra xem top đó có tồn tại trong ngăn sếp stack không thôi em



        */
    }

    public int pop(Node top) {
        // Đầu tiên là truyền Node top
        if (top.getNext() != null){ //kiểm tra xem next cuốn đầu có sách không
            // kiểm tra xem thằng top có giá trị next hay không thì dùng
            // "là kiểm tra xem tk next của top có rỗng hay khong ak" đúng rồi em
            // Node thì có index vs Node next nếu next = null thì là trả về 1(ví dụ em kiểm tra thì khi ra trị trả về
            // là 1 thì em hiển thị câu là có sách đó trong xếp
            // còn không thì nó return - 1 thì hiển thị không có) anh vd về sách dc k
            // ví dụ
            //        Node n1 = new Node(1, null);
            //        Node n2 = new Node(2, n1);
            //        Node n3 = new Node(3, n2);
            //        Node n4 = new Node(4, n3);
            //        Node n5 = new Node(5, n4);
            //        Node n6 = new Node(6, n5);
            //        Node n7 = new Node(7, n6);
            //        stack.pop(n7)
            //  anh ví dụ thế này. Hiện tại em không biết là có bao nhiêu cuốn sách nhé
            //Em chỉ biết thằng đầu tiên là n7 và giờ em muốn kiểm tra xem sau thằng n7 có thằng nào không.
            //Nếu có thì em lấy nó ra
            //đầu tiên là em lấy đc thằng n7 ra rồi em kiểm tra xem sau thằng n7 còn thằng nào nữa không thì em lấy tiếp
            // thì em dùng pop nếu pop trả về 1 thì em biết vẫn còn để lấy tiếp
            // cũng như bán hàng ấy em không biết trong kho con mấy cái. khi em bán 1 cái và trong kho vẫn còn thì nó
            // trả ra là 1 và em biết là nó vẫn còn để em hiển thị cho khác hàng biết là shop mình vẫn còn hàng
            //em hiểu sơ bộ rôi chứ. em hiểu rồi. đungs k anh
            //thực ra hiểu đơn giản thì là vậy còn tùy ứng dụng vào từng bài
            //không hẳn là bọn này sử dụng pop là để kiểm tra còn hay không mà có thể nó dùng để
            // next tiếp như tivi em xem không biết có bao nhiêu kênh nên nó cứ bấm tiếp nếu còn thôi
            //nói chung quy lại thì hàm này dùng để kiểm tra nó tồn tại hay không
            //vâng e hiểu r
            return 1;// có thì trả về 1 là lấy nó ra
        }
        return -1;// không thì trả về - 1 là không có
    }
            //hàm này viết như này à anh
    // Hàm này dùng để kiểm tra thằng stack gọi đến nó có giá trị top hay không nếu top== null thì nó trả ra true
    //viết như này là đúng rồi. boolean là true false. em lại cứ tưởng điều kiện rồi trả về
    // this.top == null == là toán tử so sánh đúng không em
    //=> this.top == null cái này 1 là đúng 2 là sai => nó là true hoặc false đơn giản mà :D
    // v thì return luôn điều kiện là đc à anh
    // thực ra cái này là viết tắt nếu dễ hiểu thì sẽ IF(this.top == null){ vâng em cx định viết v
    //thế nên nếu nắm chắc toán tử so sánh thì sẽ hiểu luôn
    // còn hiện tại chắc em hiểu == kia là = đúng ko đúng r :o
    // học dần dần mỗi ngày có 1 cái mới sẽ hiểu thêm 1 cái mới

    public boolean isEmpty(){
        if (this.top == null){
            return true;
        }
        return false;
    }

    public int numOfElement() {
    //Hàm này đúng rồi mà em
        //khi khởi tạo stack là có top vs size mà
        //yêu cầu đề bài là trả về size của stack => this.size là size đó em
        //Em phải hiểu đc từ khóa this nghĩa là gì
        // Stack a = new Stack(8,n8)
        //vi dụ a.numOfElement thì this.size là giá trị top cua a => this.size = 8;
        // còn Stack b = new Stack(9,n9) thì this.size = 9
        //this.size phụ thuộc vào đối tượng chấm đế phương thức đó nếu a chấm đến thì trả ra 8 còn b thì trả ra 9
        // this nó có nhiệm vụ là lấy giá trị của đối tượng gọi đến phương thức đó
        //em hiểu đc ko. em hiểu r
        return this.size;
    }

    public void display() {
        Stack tmp = new Stack();//Biến này là biến trung gian
        tmp.setTop(this.top);//nhìn thấy từ khóa this không em.Nó là gán giá trị hiện tại của đối tượng gọi đến nó cho biến trung gian
        //tmp (ví dụ top đang là n8)
        tmp.setSize(this.size);
        while(tmp.size != 0) {//khi biến trung gian có giá trị rồi thì while nó them size ví dụ size đang là 8 thì while chạy 8 lần
            if (tmp.top == null) break; //break có chức năng là nhảy qua lượt lặp này luôn. Nếu top == null thì lần lặp này nó bỏ qua bước dưới"
            System.out.println("Item = " + tmp.top.getItem());//Hiển thị item
            tmp.setTop(tmp.top.getNext());//set lại top cho tmp "cái nó truyền vào là ntn v a"
            //Node n1 = new Node(1, null);
            //        Node n2 = new Node(2, n1);
            //        Node n3 = new Node(3, n2);
            //        Node n4 = new Node(4, n3);
            //        Node n5 = new Node(5, n4);
            //        Node n6 = new Node(6, n5);
            //        Node n7 = new Node(7, n6);//n6 là next của n7
            // vòng thứ nhất top đang là n7 đi. Nhìn lên trên => getNext của nó lại là n6 => top đc thay đôi là n6 "em hiểu rồi"
            //thực ra bọn này thiếu tmp.size-- ( để cho size nó giảm giần về 0 còn kết thúc vòng lặp )
            //
        }

    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
