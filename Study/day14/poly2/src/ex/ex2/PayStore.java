package ex.ex2;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("kakao"))
            return new KakaoPay();
        else if (option.equals("naver"))
            return new NaverPay();
        else if (option.equals("samsung"))
            return new SamsungPay();
        else
            return new DefaultPay();
    }
}
