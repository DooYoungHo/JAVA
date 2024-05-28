package numberplayer;

public class NumberPlayer {

    private int number;

    public NumberPlayer(int num) {
        this.number = num;
    }

    public void printSquaresUptoLimit() {
        // For limit = 30; output would be 1 4 9 16 25
        int i = 1;
        while (i <= number) {
            int squares = i * i;

            if (squares <= number)
                System.out.print(squares + " ");

            i++;
        }
        System.out.println();
    }

    public void printCubesUptoLimit() {
        // For limit = 30; output would be 1 8 27
        int i = 1;
        while (i <= number) {
            int cubes = ((i * i) * i);

            if (cubes <= number)
                System.out.print(cubes + " ");

            i++;
        }
        System.out.println();
    }
}
