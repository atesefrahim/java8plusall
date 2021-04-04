package soquestions;

public class ArrayDraw {

    static int[][] array;
    static int number = 0, startP = 0;

    public static int[][] createSpiral(int size) {
        array = new int[0][0];
        number = 0;
        startP = 0;

        array = new int[size][size];

        createSpiral2(startP, size);

        return array;
    }

    public static int[][] createSpiral2(int start, int size) {


        if (start > size) {
            if (array.length > 3 && array.length % 2 == 0) array[start - 1][size] = 1;
            return array;
        }


        if (number == 0) number = 1;
        else number = 0;

        for (int i = start; i < size; i++) {
            for (int j = start; j < size; j++) {
                if (i == start || i == size - 1 || j == start || j == size - 1) array[i][j] = number;
                if (i == start + 1 && j == start) {
                    if (number == 1) array[i][j] = 0;
                    else array[i][j] = 1;
                }
            }
        }
        createSpiral2(start + 1, size - 1);
        return array;


    }

    public static void main(String[] args) {
        createSpiral(7);
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println("");
        }
        System.out.println(array[3][3]);

    }

}
