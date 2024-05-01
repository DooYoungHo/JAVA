package array;

public class ArrayDi_ {
    public static void main(String[] args) {
        // 2x3차원 배열 생성
        int[][] array;
        array = new int[][]{{1,2,3},{4,5,6}};

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                System.out.println("array [" + i + "][" + j + "] = " + array[i][j]);

        // 2x5차원 배열 생성
        // row = 2, column = 5 ( 2행, 5열 )
        int[][] arr = {
                {10, 20, 30 ,40 ,50},
                {60, 70, 80, 90, 100}
        };

        // foreach (enhanced for)
        // 단축키 -> iter
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
        // foreach 사용하지 못하는 경우, 배열의 index 값을 알아야할 때, 증가해야할 때


    }
}
