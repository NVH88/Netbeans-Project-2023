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
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class ColorFrame extends JFrame implements ActionListener, ItemListener{
    private JPanel p = new JPanel();
    private JButton ok = new JButton("OK");
    private JComboBox<String> chon = new JComboBox<>();
    public ColorFrame(String string) throws HeadlessException {
        super(string);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        
        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(ok);
        chon.addItem("Xanh");
        chon.addItem("Do");
        chon.addItem("Tim");
        chon.addItem("Vang");
        ps.add(chon);
        
        add(ps, BorderLayout.SOUTH);
        ok.addActionListener(this);
        chon.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String color = chon.getSelectedItem().toString();
        if (color.equals("Xanh")) p.setBackground(Color.BLUE);
        if (color.equals("Do")) p.setBackground(Color.RED);
        if (color.equals("Tim")) p.setBackground(Color.MAGENTA);
        if (color.equals("Vang")) p.setBackground(Color.YELLOW);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String color = chon.getSelectedItem().toString();
        if (color.equals("Xanh")) p.setBackground(Color.BLUE);
        if (color.equals("Do")) p.setBackground(Color.RED);
        if (color.equals("Tim")) p.setBackground(Color.MAGENTA);
        if (color.equals("Vang")) p.setBackground(Color.YELLOW);
    }
    
    
}
