package lists;

import java.util.*;

public class ListRun {
    public static void main(String[] args) {

        List<String> lists = List.of("Apple", "Banana", "Grape");

        for (String list : lists)
            System.out.println(list);

        System.out.println("Size : " + lists.size());
        // List.of로 추가한 list는 add or remove 불가함.

        List<Board> boards = new Vector<>();

        boards.add(new Board("제목 1", "내용 1", "작가 1"));
        boards.add(new Board("제목 2", "내용 2", "작가 2"));
        boards.add(new Board("제목 3", "내용 3", "작가 3"));
        boards.add(new Board("제목 4", "내용 4", "작가 4"));
        boards.add(new Board("제목 5", "내용 5", "작가 5"));

        boards.remove(2);
        boards.remove(3);

        for (int i = 0; i < boards.size(); i++) {
            Board b = boards.get(i);
            System.out.println("Subject : " + b.getSubject() + ", Content : " + b.getContent() + ", Writer : " + b.getWriter());
        }

        Student[] stu = {new Student(1,"영호"), new Student(2, "찬호"), new Student(3, "도영")};
        List<Student> listStudent = List.of(stu);
        List<Student> students = new ArrayList<>(listStudent);
    }
}
