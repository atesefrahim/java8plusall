package hackerrank;

import java.io.IOException;
import java.util.List;

public class TG {

    public static void main(String[] args) throws IOException {

        ReadFile readFile = new ReadFile();

        List<Integer> requestTime = readFile.readFile();


        /*
        int requestTimeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> requestTime = IntStream.range(0, requestTimeCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());
                */

        int result = Result.droppedRequests(requestTime);
        System.out.println(result);

        WriteFile writeFile = new WriteFile();
        writeFile.writeFile(result);



    }

}
class Result {

    public static int droppedRequests(List<Integer> requestTime) {

        // Write your code here
        int sumPerSec=1;
        int sumPerTenSec=1;
        int sumPerOneMin=1;
        int dropped=0;
        int sec=0;
        int hour=0;
        int tenSec = requestTime.get(0);
        int oneHour = requestTime.get(0);

        for(int i=0;i<requestTime.size()-1;i++){

            if(requestTime.get(i).equals(requestTime.get(i+1))){
                sumPerSec++;
            }

            else sumPerSec = 1;

            sumPerTenSec++;
            sumPerOneMin++;

            if(sumPerSec>3) {
                dropped++;
                sumPerSec--;
                sumPerTenSec--;
                sumPerOneMin--;
                continue;

            }

            if(requestTime.get(i) - tenSec <=10){
                if (sumPerTenSec > 20) {
                    dropped++;
                    sumPerOneMin--;
                    continue;
                }
            }
            else{
                sumPerTenSec=1;
                sec++;
                tenSec = requestTime.get(sec);
            }


            if(requestTime.get(i) - oneHour <=60){

                if(sumPerOneMin>60){
                    dropped++;
                }
            }
            else{
                hour++;
                oneHour = requestTime.get(hour);
                sumPerOneMin=1;
            }
        }
        return dropped;

    }
}