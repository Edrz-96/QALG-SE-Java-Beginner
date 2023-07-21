package com.qa.main;

import com.qa.menu.Menu;
import com.qa.utility.UtilityScanner;

public class Main {

    public static void main(String[] args) {
        try {
            Menu.run();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
          UtilityScanner.close();
        }

    }
}

