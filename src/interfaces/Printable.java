package interfaces;

public interface Printable extends Writeble{
    default void printLetter(){
        System.out.println("rrr");
    };
    void printWord(String word);
    int sum (int a, int b);
}
