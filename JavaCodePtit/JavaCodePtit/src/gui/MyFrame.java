package gui;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame(String title) throws HeadlessException {
        super(title);
        JButton ok = new JButton("OK");
        setLayout(new FlowLayout());
        add(ok);
    }
}