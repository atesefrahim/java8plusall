package soquestions;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(spinWords("This is java codding practice"));
    }

    public static String spinWords(String sentence) {
        String[] wordList = sentence.split(" ");
        String newSentence="";
        for(String wrd:wordList)
        {
            if(wrd.length()>4){
                if(newSentence.length()>0) newSentence=newSentence+" " +new StringBuilder(wrd).reverse().toString();
                else newSentence=new StringBuilder(wrd).reverse().toString();
            }
            else
            if(newSentence.length()>0) newSentence=newSentence+" "+wrd;
            else newSentence=wrd;
        }
        return newSentence;
    }
}
