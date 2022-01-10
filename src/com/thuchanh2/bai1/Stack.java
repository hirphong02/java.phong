package com.thuchanh2.bai1;


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

    // Đẩy phần tử lên trên cùng của stack
    public void push(Node node) {
        this.setTop(node); // khi Node truyền vào đã đc set lại next tiếp đến là dùng cái node do truyền vào cho Stack
        this.size ++; // Tăng size cho Stack
    }

    // Nếu ngăn xếp không rỗng, lấy phần tử trên đỉnh ngăn xếp ra khỏi ngăn xếp
    public int pop(Node top) {// Truyền Node top
        if (top.getNext() != null) { // Kiểm tra xem next gtri đầu có giá trị nào không
            return 1;// Có thì trả về 1 là lấy nó ra
        }
        return -1;// Không thì trả về - 1 là không có
    }

    // Trả về giá trị true nếu ngăn xếp rỗng, ngược lại trả về false.
    public boolean isEmpty() {
        if (this.top == null){
            return true;
        }
        return false;
    }

    // Trả về số phần tử hiện có trong ngăn xếp.
    public int numOfElement() {
        return this.size;
    }

    // In danh sách ra màn hình
    public void display() {
        Stack tg = new Stack();//  biến trung gian
        tg.setTop(this.top);// Gán giá trị hiện tại của đối tượng gọi đến nó cho biến trung gian
        tg.setSize(this.size);
        while(tg.size != 0) {//khi biến trung gian có giá trị rồi thì while nó them size ví dụ size đang là 8 thì while chạy 8 lần
            if (tg.top == null) break; // Nếu top == null thì lần lặp này nó bỏ qua bước dưới
            System.out.println("Item = " + tg.top.getItem());//Hiển thị item
            tg.setTop(tg.top.getNext());//set lại top cho tg
        }
        tg.size--; // cho sz giảm dần về 0 kết thúc vòng lặp
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
