// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Condition {

    static boolean condition;
    static boolean anotherCondition;
    static String action;

    public static void main(String[] args) {

//      If statements are one way we can change the Flow of Control in Java (FoC),
        if (condition) {
            System.out.println(" Success pathway");
        } else if (anotherCondition) {
            System.out.println("Additional pathway");
        } else {
            System.out.println("Failure pathway");
        }

//      Another FoC manipulation technique is to use the switch:case statement, this is a good way
//      to avoid the dreaded endless else if statement!

        switch (action) {
            case "case1":
                System.out.println("Case 1");
            case "case2":
                System.out.println("Case 2");
            case "case3":
                System.out.println("Case 3");
            default:
                System.out.println("Default case or failure pathway");
        }


    }
}