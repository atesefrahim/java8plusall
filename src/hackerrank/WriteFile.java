package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void writeFile(Integer input) throws IOException {

        String outputFile = "D:\\ibrahimat\\java8plusall\\src\\output.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));

        bufferedWriter.write(String.valueOf(input));
        bufferedWriter.newLine();

        bufferedWriter.close();

    }
}
