package com.younggalee.practice2.run;

import com.younggalee.practice2.dto.Circle;
import com.younggalee.practice2.dto.Point;
import com.younggalee.practice2.dto.Rectangle;

public class Application {
    public static void main(String[] args) {
        Point[] cirArr = new Circle[2];
        Point[] rectArr = new Rectangle[2];

        cirArr[0] = new Circle(1, 2, 3);
        cirArr[1] = new Circle(3, 3, 4);

        System.out.println("===== circle =====");
        for (int i=0 ; i<cirArr.length; i++){
            cirArr[i].draw();
        }

        rectArr[0] = new Rectangle(-1, -2, 5, 2);
        rectArr[1] = new Rectangle(-1, -2, 5, 2);

        System.out.println("===== rectangle =====");
        for (int i=0 ; i<rectArr.length; i++){
            rectArr[i].draw();
        }

    }
}
