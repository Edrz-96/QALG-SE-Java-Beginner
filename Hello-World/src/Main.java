// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");
        printHello();
        System.out.println(returnHello());
        System.out.println(returnParameter("Hello"));

        // These run in top-down order, if we call a method again under this comment you can expect
        // it to return an additional "Hello", there is no association to the order of methods below.

        printHello();
    }
    public static void printHello() {
        System.out.println("Hello");
    }
    public static String returnHello(){
        return "Hello";
    }
    public static String returnParameter(String parameter){
        return parameter;
    }
}