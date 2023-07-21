import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    static ArrayList<String> arr = new ArrayList<>();
    List<String> list = Arrays.asList("list", "LIST");

    public void printListItems() {
        System.out.println();;
    }

    public ArrayList printArrayItems() {
        return arr;
    }

    //add
    public boolean addItemToList(String str){
        return arr.add(str);
    }
    //remove

    //contains
    public boolean checkItemInlist(String str){
        return arr.contains(str);
    }

    // return contains
    public String returnItemFromList(String str){
        boolean personExists = arr.contains(str);
        if(personExists){
            return arr.get(arr.indexOf(str));
        }else {
            System.out.println("404, Person doesn't exist");
            return null;
        }

    }


}
