package linkedlist;

// Node 클래스 생성
public class Node<E> {
    public E item;      // 연결 리스트의 값
    public Node<E> next;    // 연결 리스트 다음 값이 들어있는 레퍼런스(주소)값

    // Node 생성자
    public Node(E newItem) {
        this.item = newItem;
        this.next = null;
    }
    // Node 생성자
    public Node(E newItem, Node<E> nextNode) {
        this.item = newItem;
        this.next = nextNode;
    }
}
