package cn.tedu.submarine;

import java.util.Random;

public class TorpedoSubmarine extends SeaObject{

    TorpedoSubmarine(){
        width = 64;
        height = 20;
        x = -width;
        Random rand = new Random();
        y = rand.nextInt(479 - height - 150 + 1) + 150;
        speed = rand.nextInt(3) + 1;
    }

}
