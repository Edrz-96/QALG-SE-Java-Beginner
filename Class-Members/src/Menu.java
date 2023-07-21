public class Menu {
    public static void run() {
        Calculator calc = new Calculator();
        String action = getAction();
        Action(action, calc);
    }

    public static String getAction() {
        String menuMsg = "==================================================\n" + "Calculator System:\n"
                + "==================================================\n" + "\t- Add - add two parameters together"
                + "\n" + "\t- Subtract - subtract an input from the second" + "\n"
                + "\t- Multiply - multiply parameters together" + "\n" + "\t- Divide - divide a parameter by the other"
                + "\n" + "\t=====\n" + "\t- Exit - Exit Application\n"
                + "==================================================\n";
        System.out.println(menuMsg + "What calculation do you want to perform?");

        return Utility.returnString();

    }

    public static void Action(String action, Calculator calc) {
        switch (action) {
            case "add":
                Utility.enterString("Enter Number");
                System.out.println(
                        "Your answer is: " + calc.add(Utility.returnFloat(), Utility.returnFloat()));
                break;
            case "subtract":
                System.out.println(
                        "Your answer is: " + calc.sub(Utility.returnFloat(), Utility.returnFloat()));
                break;
            case "divide":
                try {
                    System.out
                            .println("Your answer is: " + calc.div(Utility.returnFloat(), Utility.returnFloat()));
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
                break;
            case "multiply":
                System.out.println("Your answer is: " + calc.mul(Utility.returnFloat(), Utility.returnFloat()));
                break;
            default:
                System.out.println("No match found");
                break;

        }

    }
}
