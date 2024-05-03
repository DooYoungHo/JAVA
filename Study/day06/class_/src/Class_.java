public class Class_ {
    public static void main(String[] args) {
        String student1Name = "학생 1";
        int student1Age = 20;
        int student1Grade = 90;

        String student2Name = "학생 2";
        int student2Age = 21;
        int student2Grade = 85;

        System.out.println("이름 : " + student1Name + "나이 : " + student1Age + " 성적 : " + student1Grade);
        System.out.println("이름 : " + student2Name + "나이 : " + student2Age + " 성적 : " + student2Grade);

        /* 위 코드의 문제는 학생이 늘어날때마다 변수를 선언해줘야하며, 출력해주는 print 문을 추가해줘야함
        * 이런 문제를 어떻게 해결할 수 있을까?
        *  */

        // 배열을 사용하여 해결해보자
        String[] studentName = {"학생 1", "학생 2"};
        int[] studentAge = {20, 21};
        int[] studentGrade = {90, 85};

        for (int i = 0; i < studentName.length; i++)
            System.out.println("이름 : " + studentName[i] + "나이 : " + studentAge[i] + " 성적 : " + studentGrade[i]);

        /* 하지만 배열을 사용하더라도, 데이터 변경 작업을 할 때에는 어려우며 매우 조심해야 한다.
        * 그래서 'Student Class' 를 만들어서 사용한다. 예제는 'Student.java' 를 확인하면 된다. */
        Student student1 = new Student("학생 1", 20, 100);
        Student student2 = new Student("학생 2", 25, 99);
        // student 변수는 = Object(객체) 또는 Instance(인스턴스)
        Student[] students = new Student[5];
        students[0] = student1;
        students[1] = student2;
        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);
    }
}
