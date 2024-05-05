public class VarChange_ {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 값 변경
        a = 20;
        System.out.println("a값 변경...");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 값 변경
        b = 30;
        System.out.println("b값 변경...");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        ValueData dataA = new ValueData(10);
        ValueData dataB = dataA;        // 같은 인스턴스를 가리킴 ( 즉 참조하는 주소값이 같음 ) -> 실제 생성된 객체는 하나임

        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // 인스턴스가 가리키는 레퍼런스 값을 변경
        dataA.value = 20;
        System.out.println("dataA.value = 20 ...!");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataB.value = 30;
        System.out.println("dataB.value = 30 ...!");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        initValues(dataB,10);   // 메서드를 활용해서 값을 변경시킬 수 있음 (레퍼런스 값 변경)
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // 멤버 변수(필드)값은 int = 0, boolean = false, String = null 로 자동 초기화
        // but, 지역변수는 직접 초기화를 시켜줘야함.
        InitData data = new InitData();
        System.out.println("초기화 값 확인");
        System.out.println("data.value1 = " + data.value1);
        System.out.println("data.value2 = " + data.value2);
        System.out.println("data.value3 = " + data.value3);
        System.out.println("data.name = " + data.name);
    }

    public static void initValues(ValueData v, int i) {
        v.value = i;
    }
}
