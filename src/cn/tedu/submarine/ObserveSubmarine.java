package cn.tedu.submarine;

import java.util.Random;

public class ObserveSubmarine extends SeaObject{

    ObserveSubmarine(){
        width = 63;
        height = 19;
        x = -width;
        Random rand = new Random();
        y = rand.nextInt(479 - height - 150 + 1) + 150;
        speed = rand.nextInt(3) + 1;

    }
}
