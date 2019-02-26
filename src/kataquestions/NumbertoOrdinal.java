package kataquestions;

public class NumbertoOrdinal {
    public static void main(String[] args) {

        System.out.println(numberToOrdinal(1560));
    }

    public static String numberToOrdinal( Integer number ) {

        String numberString = "";
        switch (number % 10) {
            case 0:
                numberString=number.toString();
                break;
            case 1:
                numberString = number + "st";
                break;
            case 2:
                numberString = number + "nd";
                break;
            case 3:
                numberString = number + "rd";
                break;
            case 4:
                numberString = number + "th";
                break;
            default:
                numberString = number + "th";
                break;

        }
        return numberString;

    }
}
