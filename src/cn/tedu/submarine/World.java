package cn.tedu.submarine;

public class World {
    public static void main(String[] args) {
        ObserveSubmarine[] oses = new ObserveSubmarine[3];
        oses[0] = new ObserveSubmarine();
        oses[1] = new ObserveSubmarine();
        oses[2] = new ObserveSubmarine();
        for(int i = 0; i < oses.length; i++){
            System.out.println(oses[i].x + "." + oses[i].y);
            oses[i].move();
        }
        TorpedoSubmarine[] tses = new TorpedoSubmarine[3];
        tses[0] = new TorpedoSubmarine();
        tses[1] = new TorpedoSubmarine();
        tses[2] = new TorpedoSubmarine();

        for(int i = 0; i < oses.length; i++){
            System.out.println(tses[i].x + "." + tses[i].y);
            tses[i].move();
        }

        MineSubmarine[] mses = new MineSubmarine[3];
        mses[0] = new MineSubmarine();
        mses[1] = new MineSubmarine();
        mses[2] = new MineSubmarine();

        for(int i = 0; i < mses.length; i++){
            System.out.println(mses[i].x + "." + mses[i].y);
            mses[i].move();
        }

        Mine[] ms = new Mine[3];
        ms[0] = new Mine(3, 3);
        ms[1] = new Mine(3,2);
        ms[2] = new Mine(1,1);

        for(int i = 0; i < ms.length; i++){
            System.out.println(ms[i].x + "." + ms[i].y);
            ms[i].move();
        }

        Bomb[] bs = new Bomb[3];
        bs[0] = new Bomb(1, 3);
        bs[1] = new Bomb(4,6);
        bs[2] = new Bomb(3, 4);

        for(int i = 0; i < bs.length; i++){
            System.out.println(bs[i].x + "." + bs[i].y);
            bs[i].move();
        }


    }
}
