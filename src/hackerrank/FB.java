package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FB {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result2.fizzBuzz(n);

        bufferedReader.close();
    }

}

class Result2 {

    public static void fizzBuzz(int n) {
        for(int i=1;i<n+1;i++){
            if(Math.floorMod(i,15)==0) System.out.println("FizzBuzz");
            else if(Math.floorMod(i,3)==0) System.out.println("Fizz");
            else if(Math.floorMod(i,5)==0) System.out.println("Buzz");
            else System.out.println(i);
        }

    }

}