package soquestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileArray {

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to my program. ");

        File file = new File("src/Random.txt");

        System.out.println("This Program will read and display a text file in an array");
        String[] arr;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            arr = new String[50];//
            int i = 0;
            String line;

            while ((line = br.readLine()) != null) {
                arr[i] = line;
                System.out.println(i + ". " + arr[i++] + "\n");
            }
            br.close();

        } catch (IOException e) {
            System.out.println("File not Found");
        }
    }
}
