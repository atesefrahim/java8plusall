package soquestions;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

        System.out.println(lcs("abcdef", ""));
    }

    public static String lcs(String x, String y) {
        // your code here
        StringBuilder stringBuilder = new StringBuilder();
        if (x.contains(y)) return y;
        else
        {

            char[] yChar = y.toCharArray();
            char[] xChar = x.toCharArray();
            for(int i=0; i<yChar.length;i++){

                for (int w=0;w<xChar.length;w++){
                    if(xChar[w]==yChar[i]){
                        stringBuilder.append(yChar[i]);
                        xChar[w]=' ';
                        break;
                    }
                }
            }
            return stringBuilder.toString();
        }

    }

}
