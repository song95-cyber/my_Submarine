package cn.tedu.submarine;

import java.util.Random;

public class Mine extends SeaObject{


    Mine(int x, int y){
        Random rand = new Random();
        width = 11;
        height = 11;
        this.x = x;
        this.y = y;
        speed = rand.nextInt(5) + 1;
    }
}
