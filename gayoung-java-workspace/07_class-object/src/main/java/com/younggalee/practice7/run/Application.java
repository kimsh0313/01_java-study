package com.younggalee.practice7.run;

import com.younggalee.practice7.controller.ProductManeger;
import com.younggalee.practice7.controller.ProductManeger_ArrayList;

public class Application {
    public static void main(String[] args) {
//        ProductManeger pm = new ProductManeger();
        ProductManeger_ArrayList pm = new ProductManeger_ArrayList();
        pm.mainMenu();
    }
}
