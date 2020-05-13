package com.zyk.tank.v1;

import java.awt.*;

public class SimpleTank  extends Frame {


    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.fillRect(200,200,50,50);

        System.out.println("git test");

    }
}
