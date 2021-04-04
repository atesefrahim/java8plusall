package soquestions;


public class ConsecutiveNumber {
    static int count =0;
    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
        //System.out.println(rangeExtraction(new int[] {-16,-15,-13,-11,-8,-6,-4,-3,-1,1,2,5,7,8,11,14,16,17}));
    }

    public static String rangeExtraction(int[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int rangeStart = array[i];
            sb.append(rangeStart);
            for (int j = i + 1; j <= array.length; j++) {
                if (j == array.length || array[j] != rangeStart + (j - i)) {
                    if (j - i >= 3) {
                        sb.append('-').append(array[j - 1]);
                        i = j - 1;
                    }
                    sb.append(',');
                    break;
                }
            }

        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
