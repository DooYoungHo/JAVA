package arraylist;

public class Run {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);

        list.add(0, 1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        list.remove(3);
        list.remove(3);
        list.printList();
    }
}
