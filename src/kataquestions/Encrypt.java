package soquestions;

public class Encrypt {
    public static void main(String[] args) {

        System.out.println(encryptThis("108RuYYFUhnS [ ]76 70lhKzIbWQlk 100m..."));
    }

    public static String encryptThis(String text) {
        // Implement me! :)
        int ascii=0, count=0;
        StringBuilder stringBuilder = new StringBuilder();
        if (text==null||text.length()==0) return text;
        for(String s: text.split(" ") ){
            if(s.length()==0)
            {
                stringBuilder.append(" ");
                continue;
            }

            count++;
            if(count>1)
            {
                stringBuilder.append(" ");
            }
            if (!Character.isLetterOrDigit(s.charAt(0)))
            {
                stringBuilder.append(s.charAt(0));
            }
            else
            {
                ascii = s.charAt(0);
                stringBuilder.append(ascii);
            }

            if(s.length()>1) {

                StringBuilder stringBuilder2 = new StringBuilder(s.substring(1,s.length()));

                char c=s.charAt(1);
                char c2=s.charAt(s.length()-1);
                stringBuilder2=stringBuilder2.replace(0,1,String.valueOf(c2));
                stringBuilder2=stringBuilder2.replace(stringBuilder2.length()-1,stringBuilder2.length(),String.valueOf(c));

                stringBuilder.append(stringBuilder2.toString());
            }


        }
        return stringBuilder.substring(0,stringBuilder.length()).toString();
    }

}
