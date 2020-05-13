package com.zyk.tank;

import com.zyk.tank.v1.SimpleTank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame {

    public static void main(String[] args) {

        Frame frame = new SimpleTank();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setTitle("坦克大战哦。");
        frame.setSize(800,800);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }




}
