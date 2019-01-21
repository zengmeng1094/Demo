package DataStruct;

public class LinkedListReverse {

    public static LinkedNode createLinkedList(){
        LinkedNode node0 = new LinkedNode(0);
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        node0.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        return node0;
    }

    public static void printLinkedList(LinkedNode head){
        System.out.println(head);
        do {
            head = head.getNext();
            System.out.println(head);
        } while (head.getNext() != null);
    }

    //遍历反转
    public static LinkedNode reverse(LinkedNode head){
        //头节点为空或者只有一个头节点
        if (head == null || head.getNext() == null){
            return head;
        }
        //从第一个非头节点开始转换
        LinkedNode pre = head;
        LinkedNode cur = head.getNext();
        LinkedNode tmp;
        while(cur != null){
            tmp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = tmp;
        }
        head.setNext(null);
        return pre;
    }

    public static void main(String[] args) {
        //建立一个新的链表
        LinkedNode head = createLinkedList();
        //打印当前链表
        printLinkedList(head);
        //遍历反转
        LinkedNode reHead = reverse(head);
        printLinkedList(reHead);
    }

}

class LinkedNode{
    private int data;
    private LinkedNode next;

    public LinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "data=" + data +
                ", next=" + (next != null ? next.getData():null) +
                '}';
    }
}