package kataquestions;

public class MaskData {
    public static void main(String[] args) {

        System.out.println(maskify("1234-2345-3456-4567"));
    }

    public static String maskify(String creditCardNumber) {
        // Add code here
        if((creditCardNumber.length()<6) ||(creditCardNumber.length()==0)) return creditCardNumber;

        char[] creditChar = creditCardNumber.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(creditChar[0]);
        for(int index=1;index<creditChar.length-4;index++){
            if(creditChar[index]=='-')
            {
                stringBuilder.append('-');
                continue;
            }
            if(Character.isDigit(creditChar[index])){
                stringBuilder.append("#");
            }
            else
            {
                stringBuilder.append(creditChar[index]);

            }
        }

        stringBuilder.append(creditCardNumber.substring(creditCardNumber.length()-4));
        return stringBuilder.toString();
    }
}
