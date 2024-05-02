package linkedlist;

public class Run {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(0, 300);
        list.add(0, 200);
        list.add(0, 100);
        list.append(400);
        list.append(500);
        list.remove(4);

        System.out.println("Index 0 : " + list.get(0));
        System.out.println("Index 1 : " + list.get(1));
        System.out.println("Index 2 : " + list.get(2));
        System.out.println("Index 3 : " + list.get(3));
        System.out.println("Index 4 : " + list.get(4));
    }
}
