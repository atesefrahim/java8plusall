package java8.collectionAPI;

import java.util.ArrayList;
import java.util.List;

public class DimensionalGrowth {

    public static void main(String[] args) {
        List<String> coordinates = new ArrayList<>();
        coordinates.add("3 3");
        coordinates.add("3 7");
        coordinates.add("4 3");
        coordinates.add("2 3");


        System.out.println(findMaxCountAlternative1(coordinates));
        System.out.println(findMaxCountAlternative2(coordinates));

    }

    private static int findMaxCountAlternative2(List<String> coordinates) {
        int maxCount =0, peak = 0;
        return findMinCoordinates(coordinates);
    }

    private static int findMaxCountAlternative1(List<String> coordinates) {
        int maxCount =0, peak = 0;
        int[][] dimension = findMaxCoordinates(coordinates);

        for (String element: coordinates ) {
            String[] coors = element.split(" ");
            for (int x =0; x<Integer.parseInt(coors[0]); x++){
                for(int y=0; y<Integer.parseInt(coors[1]); y++){
                    dimension[x][y] = dimension[x][y] + 1;
                    if(dimension[x][y]>peak){
                        maxCount =1;
                        peak = dimension[x][y];
                    } else if(dimension[x][y]==peak){
                        maxCount+=1;
                    }
                }
            }
        }
        return maxCount;
    }

    public static int[][] findMaxCoordinates(List<String> coordinates){
        int maxXPos = 0;
        int maxYPos = 0;
        for (String element: coordinates ){
            String[] coors = element.split(" ");
            if(maxXPos < Integer.valueOf(coors[0]))
                maxXPos = Integer.valueOf(coors[0]);
            if(maxYPos < Integer.valueOf(coors[1]))
                maxYPos = Integer.valueOf(coors[1]);
        }
        return new int[maxXPos][maxYPos];
    }

    public static int findMinCoordinates(List<String> coordinates){
        int minXPos = Integer.parseInt(coordinates.get(0).split(" ")[0]);
        int minYPos = Integer.parseInt(coordinates.get(0).split(" ")[1]);
        for (String element: coordinates ){
            String[] coors = element.split(" ");
            if(Integer.valueOf(coors[0]) < minXPos)
                minXPos= Integer.valueOf(coors[0]);
            if( Integer.valueOf(coors[1])< minYPos)
                minYPos = Integer.valueOf(coors[1]);
        }

        return minXPos * minYPos;
    }
}
