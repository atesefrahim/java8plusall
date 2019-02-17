package java8.lambdaexpression;


public class LambdaUse {

    public static void main(String[] args) {

        /*LambdaInterface isGreaterThan = (i)-> (i/10)>3;
        System.out.println(isGreaterThan.computeTest(45));*/


        LambdaInterface reverseStr = (str) -> {

            String result="";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;

        };

        System.out.println(reverseStr.myStringFunc("Ibrahim"));


        LambdaGenericInterface<String> count = (strn) -> {

            int cnt = 0;
            String cntStr;

            for(int x=0; x<=strn.length()-1; x++)
                cnt++;

            cntStr=String.valueOf(cnt);

            return cntStr;
        };

        System.out.println("count of given string :"+count.compute("ates"));

    }
}
