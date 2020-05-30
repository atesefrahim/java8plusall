package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {

    public List<Integer> readFile() throws IOException {
        String inputFile = "D:\\ibrahimat\\java8plusall\\src\\input.txt";


        BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(inputFile));

        List<Integer> inputList = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(inputFile))) {

            inputList = br.lines().
                    map(String::trim)
                    .map(Integer::parseInt).
                            collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        bufferedReader.close();

        return inputList;


    }
}
