package solid_principles.srp;

public class Book {

  private String name;
  private String text;


  public String trimName(){
    return name.trim();
  }

  public boolean isWordInText(String word){
    return text.contains(word);
  }

  // following method break the srp, must be define at the new class: Ex : BookPrinter
  public void sendTextToPrinter(){
  }


}
