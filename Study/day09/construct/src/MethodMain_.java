public class MethodMain_ {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};
        for (MemberInit mem : members)
            System.out.println("이름 : " + mem.name + ", 나이 : " + mem.age + ", 성적 : " + mem.grade);

        /* 위 코드는 인스턴스 객체가 생길때마다 초기화 변수를 사용해줘야한다. 이르 더 간편하게 하기 위해 '생성자'를 사용한다 */
        MemberConstruct mem1 = new MemberConstruct("두영호",27,100);
        MemberConstruct mem2 = new MemberConstruct("김유진",25,100);

        MemberConstruct[] members2 = {mem1, mem2};
        for (MemberConstruct mem : members2)
            System.out.println("이름 : " + mem.name + ", 나이 : " + mem.age + ", 성적 : " + mem.grade);
    }
}
