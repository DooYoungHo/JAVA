package simplecalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal;
    private BigDecimal interest;
    private BigDecimal year;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int year) {
        this.year = new BigDecimal(year);

        return principal.add(
                principal.multiply(interest)
                        .multiply(this.year));
    }
}

//public class SimpleInterestCalculator {
//    private double principal;   // 금액
//    private double interest;   // 이자율
//
//    public SimpleInterestCalculator(String principal, String interest) {
//        try {
//            this.principal = Double.parseDouble(principal);
//            this.interest = Double.parseDouble(interest);
//        }
//        catch (NumberFormatException e) {
//            System.out.println("Error");
//        }
//    }
//
//    public BigDecimal calculateTotalValue(int year) {
//        double totalAmount = principal + (principal * interest * year);
//        String decimalValue = Double.toString(totalAmount);
//        BigDecimal returnValue = new BigDecimal(decimalValue);
//
//        return returnValue;
//    }
//}
