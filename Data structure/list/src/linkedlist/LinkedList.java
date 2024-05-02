package linkedlist;

public class LinkedList<E> implements IntegerListInterface<E> {
    private Node<E> head;       // 헤드 Node 객체
    private int numItems;       // Node item 개수 확인 변수

    // 초기화
    public LinkedList() {
        numItems = 0;                   // item 값 초기화
        head = new Node<>(null, null);      // (dummy head) 값 설정
                                                             // 이로써 head -> dummy head 가리킴
    }

    // 연결 리스트 index 번에 item 넣기
    public void add(int index, E item) {
        // index가 0 이상이고, index가 numItems보다 작거나 같으면
        if (index >= 0 && index <= numItems) {
            // prevNode 객체에 getNode method를 통해 리턴받은 레퍼런스 값 넣어주기
            Node<E> prevNode = getNode(index - 1);
            // 새로운 노드 객체 생성
            Node<E> newNode = new Node<>(item, prevNode.next);
            // prevNode 주소값 초기화
            prevNode.next = newNode;
            // Node Item 증가
            numItems++;
        }
    }

    // 연결 리스트에 item 넣기
    public void append(E item) {
        // prevNode 초기화
        Node<E> prevNode = head;
        // 연결 리스트의 끝을 찾아감
        while (prevNode.next != null)
            prevNode = prevNode.next;
        // 새로운 값을 넣을 Node 객체 초기화
        Node<E> newNode = new Node<>(item, null);
        // 이전 참조를 새로운 값을 참조하게 함
        prevNode.next = newNode;
        // Node Item 증가
        numItems++;
    }

    // 연결 리스트 [index]번 째 item 삭제하기
    public E remove(int index) {
        // [index]가 0과 같거나 크고, [index]가 Item 수보다 작으면
        // parameter index 가 유효한지 체크
        if (index >= 0 && index < numItems) {
            // prevNode 값 가져오기 (index 이전 노드 불러오기)
            Node<E> prevNode = getNode(index - 1);
            // prevNode 참조 값 받아오기
            Node<E> currNode = prevNode.next;
            // 삭제할 'currNode' 가 참조하는 레퍼런스 값을 prevNode 에 넣어주기
            prevNode.next = currNode.next;
            // Item 삭제
            numItems--;

            return currNode.item;
        }
        else return null;
    }

    // 연결 리스트에서 item 값 찾아 삭제하기
    public boolean removeItem(E x) {
        Node<E> currNode = head;
        Node<E> prevNode;

        // 연결 리스트 순회하며 삭제할 값 찾기 (x의 값이 리스트에 여러 개 존재할 경우 순서에 의해 앞의 값을 삭제)
        for (int i = 0; i < numItems; i++) {
            prevNode = currNode;
            currNode = currNode.next;
            // x 값을 찾았다면
            if (((Comparable)(currNode.item)).compareTo(x) == 0) {
                // prevNode 의 참조값을 삭제할 노드가 참조하고 있던 값으로 바꿔주기
                prevNode.next = currNode.next;
                numItems--;
                return true;
            }
        }
        return false;
    }

    // Node [index]번에 있는 item 값 가져오기
    public E get(int index) {
        if (index >= 0 && index <= (numItems - 1)) {
            return getNode(index).item;
        }
        else return null;
    }

    // [index]번의 Node 가 참조하는 레퍼런스(주소)값 가져오기
    public Node<E> getNode(int index) {
        // index >= -1 은 'dummy head' 가 존재하기 때문
        if (index >= -1 && index <= (numItems - 1)) {
            Node<E> currNode = head;
            for (int i = 0; i <= index; i++) {
                currNode = currNode.next;
            }
            return currNode;
        }
        else return null;
    }

    // 연결 리스트의 특정 인덱스에 해당하는 노드의 데이터 값을 변경
    public void set(int index, E x) {
        if (index >= 0 && index <= (numItems - 1)) {
            getNode(index).item = x;
        }
        else {
            System.out.println("Error by set Method...");
        }
    }

    // 데이터 x가 어느 위치에 있는지 확인하는 메소드
    public final int NOT_FOUND = -123;
    public int indexOf(E x) {
        Node<E> currNode = head;
        for (int i = 0; i < numItems; i++) {
            currNode = currNode.next;
            if (((Comparable)(currNode.item)).compareTo(x) == 0)
                return i;
        }
        return NOT_FOUND;
    }

    // 연결 리스트 길이 구하기
    public int len() {
        return numItems;
    }

    // 연결 리스트가 비었는지 확인
    public boolean isEmpty() {
        return numItems == 0;
    }

    // 연결 리스트 초기화
    public void clear() {
        numItems = 0;
        head = new Node<>(null,null);
    }
}
