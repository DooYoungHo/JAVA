package circularlinkedlist;

public class CircularLinkedList<E> implements IntegerListInterface<E> {
    private Node<E> tail;
    private int numItems;

    public CircularLinkedList() {
        numItems = 0;       // 아이템 값 초기화
        tail = new Node(-1);     // 더미 헤드 설정
        tail.next = tail;       // 원형 연결 리스트 생성
    }

    // Node[index]에 item 값 추가하는 메소드
    public void add(int index, E item) {
        // [index] 유효성 체크
        if (index >= 0 && index <= numItems) {
            Node<E> prevNode = getNode(index - 1);      // prevNode = index 이전의 Node
            Node<E> newNode = new Node(item, prevNode.next);    // 새로운 Node 추가
            prevNode.next = newNode;        // prevNode 가 newNode 참조하도록 설정
            // 마지막 노드인지 체크
            if (index == numItems) {
                tail = newNode;
            }
            numItems++;     // 노드 개수 추가
        }
    }

    // Node 마지막에 item 추가하는 메소드
    public void append(E item) {
        Node<E> prevNode = tail;    // prevNode 마지막 Node 로 설정
        Node<E> newNode = new Node<>(item, prevNode.next);      // newNode 생성
        prevNode.next = newNode;       // prevNode 참조값을 newNode 로 추가 (즉, 리스트 마지막에 newNode 값을 추가)
        tail = newNode;     // tail newNode 가리킴
        numItems++;         // 노드 개수++;
    }

    // Node[index]번 Node 삭제
    public E remove(int index) {
        // 유효한 index 인지 조건 체크
        if (index >= 0 && index <= (numItems -1)) {
            Node<E> prevNode = getNode(index - 1);  // index 이전의 노드 주소 가져오기
            E rItem = prevNode.next.item;       // 삭제할 아이템 값 =  rItem
            prevNode.next = prevNode.next.next;     // 삭제할 노드값 건너뛰기
            // 마지막 노드인지 체크
            if (index == numItems)
                tail = prevNode;
            numItems--;     // 노드 개수--;
            return rItem;
        }
        else return null;
    }

    // Node item 값을 찾아 삭제
    public boolean removeItem(E x) {
        Node<E> currNode = tail.next;
        Node<E> prevNode;

        // for 돌면서 노드별 item 확인, 여러 개가 있어도 순차적으로 앞에 있는 것을 삭제
        for (int i = 0; i < numItems; i++) {
            prevNode = currNode;
            currNode = prevNode.next;
            if (((Comparable)(currNode.item)).compareTo(x) == 0) {
                prevNode.next = currNode.next;
                numItems--;
                return true;
            }
        }
        return false;
    }

    // Node[index] item 값 찾는 메소드
    public E get(int index) {
        if (index >= 0 && index <= (numItems - 1)) {
            return getNode(index).item;
        }
        else return null;
    }

    // Node[index] item 값 x로 바꾸는 메소드
    public void set(int index, E x) {
        if (index >= 0 && index <= (numItems - 1)) {
            getNode(index).item = x;
        }
        else System.out.println("Error by set Method...");
    }

    // Node[index] 참조값 찾는 메소드
    private Node<E> getNode(int index) {
        // 조건 확인
        if (index >= -1 && index <= numItems) {
            Node<E> currNode = tail.next;   // currNode = 더미헤더
            // 인덱스 값 찾기위한 순회
            for (int i = 0; i <= index; i++) {
                currNode = currNode.next;
            }
            return currNode;
        }
        else return null;
    }

    // item 값이 있는 index 추출하는 메소드
    public final int NOT_FOUND = -123;
    public int indexOf(E x) {
        Node<E> currNode = tail.next;       // 더미헤더 설정
        for (int i = 0; i <= numItems; i++) {
            currNode = currNode.next;
            if (((Comparable)(currNode.item)).compareTo(x) == 0) {
                return i;       // 인덱스 값 return
            }
        }
        return NOT_FOUND;       // 없을 경우 error return
    }

    // 원형 연결 리스트 길이 구하기
    public int len() {
        return numItems;
    }

    // 원형 연결 리스트 비었는지 확인
    public boolean isEmpty() {
        return numItems == 0;
    }

    // 원형 연결 리스트 초기화
    public void clear() {
        numItems = 0;
        tail = new Node(-1);
        tail.next = tail;
    }
}
