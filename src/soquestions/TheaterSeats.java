package soquestions;

public class TheaterSeats {

    public static void main(String[] args) {

        System.out.println(seatsInTheater(60, 100, 60, 1));
    }

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {

        if ((col <= nCols & col >= 1) & (row <= nRows & row >= 1)) {
            return (nCols - col + 1) * (nRows - row);
        } else
            return 0;

    }
}
