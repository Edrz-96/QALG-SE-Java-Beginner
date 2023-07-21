package com.qa.utility;

import java.util.Scanner;

public class UtilityScanner {
    // Contains helper functions for the Scanner class.
    static Scanner scan = new Scanner(System.in);
    public static String returnString(){
        return scan.nextLine().toLowerCase();
    }

    public static float returnFloat(){
        return Float.parseFloat(scan.nextLine());
    }

    public static void enterString(String para){
        System.out.println(para);
    }

    public static void close(){
        scan.close();
        System.out.println("... Closing connection ...");
    }
}
