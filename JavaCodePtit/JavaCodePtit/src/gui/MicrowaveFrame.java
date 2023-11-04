/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author DELL
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.*;
public class MicrowaveFrame extends JFrame{

    public MicrowaveFrame(String string) throws HeadlessException {
        super(string);
        setLayout(new GridLayout(1, 2));
        add(new JButton("Food to be placed here"));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        JTextField t1 = new JTextField("Time to be displayed here");
        p1.add(t1, BorderLayout.NORTH);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 3));
        for (int i = 1; i <= 9; ++i) {
            p2.add(new JButton("" + i));
        }
        p2.add(new JButton("0"));
        p2.add(new JButton("Start"));
        p2.add(new JButton("Stop"));
        
        p1.add(p2, BorderLayout.CENTER);
        
        add(p1);
    }
    
}
