package ex.counter;

public class MaxCounter {

    private int count;
    private final int max;
    // 생성자
    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }
    // 숫자 증가 메서드
    public void increment() {
        if (count < max)
            count++;
        else
            System.out.println("최대값에 도달했습니다...!");
    }
    // 현재 값 반환 메서드
    public int getCount() {
        return count;
    }
}
