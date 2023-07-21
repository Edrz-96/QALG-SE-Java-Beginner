import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Looping looper = new Looping();
        looper.loopString("Str");
        looper.loopStringWhile("Counting", 1);


        Collections col = new Collections();
        col.addItemToList("str");
        col.printArrayItems();
        System.out.println(col.returnItemFromList("str"));


    }}