package hackerrank;

import java.io.IOException;
import java.util.List;

public class PJ {
    public static void main(String[] args) throws IOException {


        ReadFile rf = new ReadFile();

        List<Integer> cell = rf.readFile();


        int result = Result3.maxGameScore(cell);
        System.out.println(result);

        WriteFile wf = new WriteFile();

        wf.writeFile(result);


    }
}
class Result3 {

    /*
     * Complete the 'maxGameScore' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY cell as parameter.
     */

    public static int maxGameScore(List<Integer> cell) {

        // Write your code here

        int sum=0;
        int i=0;
        int score1=0;
        int score2 = 0;

        while(i<cell.size()-3)
        {
            if(cell.get(i+1)>0)
            {
                score1=score1 + cell.get(i+1);
                i++;
            }
            else if(cell.get(i+1)>cell.get(i+3)){
                score1 = score1 + cell.get(i+1);
                i++;
            }
            else {
                score1 = score1 + cell.get(i+3);
                i=i+3;
            }

        }
        i =0;

        while(i<cell.size()-3)
        {
            if(cell.get(i+1)>0)
            {
                score2=score2 + cell.get(i+1);
                i++;
            }
            else {
                score2 = score2 + cell.get(i+3);
                i=i+3;
            }

        }

        if(score1>score2) sum = score1;
        else sum = score2;

        while(i<cell.size()-1)
        {
            sum = sum + cell.get(i+1);
            i++;
        }

        return sum;

    }

}