package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 4;

        int coupon = 0;
        // if 문을 사용했을 때

        if (grade == 1) coupon = 1000;
        else if (grade == 2) coupon = 2000;
        else if (grade == 3) coupon = 3000;
        else coupon = 500;

        System.out.println("발급받은 쿠폰 " + coupon);

        int grade2 = 3;
        int coupon2 = 0;

        // switch문을 사용했을 때
        switch (grade2){
            case 1:
                coupon2 = 1000;
                break;
            case 2:
                coupon2 = 2000;
                break;
            case 3:
                coupon2 = 3000;
                break;
            default:
                coupon2 = 500;
                break;
        }

        System.out.println("발급받은 쿠폰2 " + coupon2);

        // 2등급도 3등급과 같이 3000원 쿠폰을 지급한다고 가정해보자

        int grade3 = 2;
        int coupon3 = 0;

        switch (grade3){
            case 1:
                coupon3 = 1000;
                break;
            case 2:
            case 3:
                coupon3 = 3000;
                break;
            default:
                coupon3 = 500;
                break;
        }

        System.out.println("발급받은 쿠폰3 " + coupon3);

        // JAVA14이상 새로운 switch문
        int grade4 = 4;

        int coupon4 = switch (grade4){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰4 " + coupon4);
    }
}
