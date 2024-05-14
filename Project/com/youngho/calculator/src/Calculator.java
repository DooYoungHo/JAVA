import java.util.LinkedList;

public class Calculator extends Operation {

    private static final LinkedList<String> linkedList = new LinkedList<>();

    private static int getIndex = 0;

    // 숫자인지 확인하는 메서드
    private static boolean isNumberic(String op) {
        if (op == null)
            return false;

        try {
            double num = Double.parseDouble(op);
            return true;
        }

        catch (NumberFormatException e) {
            return false;
        }
    }

    // 사칙연산인지 체크하는 메서드
    private static boolean isOperation(String op) {
        if (op == null)
            return false;

        return switch (op) {
            case "+", "-", "*", "/" -> true;
            default -> false;
        };
    }

    // 입력된 값을 리스트에 넣기
    private static void putInValue(String op) {

        if (getIndex != 0 && linkedList.get(getIndex - 1) != null) {

            String str = linkedList.get(getIndex - 1);

            if (isNumberic(str) && isNumberic(op)) {
                linkedList.set(getIndex - 1, op); // 이전 값을 덮어쓰기
                getIndex--;
            }
            else if (isOperation(str) && isOperation(op)) {
                linkedList.set(getIndex - 1, op); // 이전 사칙연산을 덮어쓰기
                getIndex--;
            }
            else
                linkedList.add(getIndex, op); // 그 외에는 현재 인덱스 위치에 추가
        }
        // 초기 처음에 index == 0 일때 작업
        else {
            if (isNumberic(linkedList.get(getIndex)))
                linkedList.set(getIndex, op);

            else if (isOperation(linkedList.get(getIndex)))
                linkedList.set(getIndex + 1, op);
        }
        getIndex++;
    }

    // 값을 빼내 계산하는 메서드
    private static double getValue() {

        double result = Double.parseDouble(linkedList.getFirst()); // 초기값으로 첫 번째 숫자를 설정
        double nextNumber = 0;

        for (int i = 1; i < linkedList.size(); i += 2) { // 인덱스를 2씩 증가시켜 연산자를 건너뛰며 진행
            String op = linkedList.get(i); // 현재 연산자

            if ((i + 1) >= linkedList.size()) {
                nextNumber = result;
            }
            else {
                nextNumber = Double.parseDouble(linkedList.get(i + 1)); // 다음 숫자
            }

            switch (op) {
                case "+" :
                    result += nextNumber;
                    break;
                case "-" :
                    result -= nextNumber;
                    break;
                case "*" :
                    result *= nextNumber;
                    break;
                case "/" :
                    result /= nextNumber;
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    break;
            }
        }

        return result;
    }

    // 실행하는 메서드
    public static void run(String op) {

        if (getIndex == 0) {
            linkedList.add("0");
        }

        if (op.equals("=")) {
            double result = getValue();
            if (result % 10 == 0)
                System.out.println((int) result);
            else
                System.out.println(result);

            linkedList.clear();
            getIndex = 0;
        }
        else {
            putInValue(op);
        }
    }

}