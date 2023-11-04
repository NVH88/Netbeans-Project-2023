package gui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ColorFrame f = new ColorFrame("hello");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}