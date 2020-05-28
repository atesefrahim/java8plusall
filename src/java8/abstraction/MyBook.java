package java8.abstraction;

public class MyBook extends Book {

    @Override
    void setTitle(String s) {
        this.title=s;

    }

    @Override
    String getTitle() {
        return super.getTitle();
    }
}
