package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    private JButton btn = new JButton("OK"); 
    private JTextField f1 = new JTextField();
    private JTextField f2 = new JTextField();

    private static boolean inFibSeq(long a) {
        if (a <= 0) {
            return false;
        }
        if (a <= 2) {
            return true;
        }
        long f1 = 1;
        long f2 = 1;
        long f3 = 0;
        while (f1 + f2 <= a) {
            f3 = f1 + f2;
            if (f3 == a) {
                return true;
            }
            f1 = f2;
            f2 = f3;
        } 
        return false;
    }

    public Frame(String title) {
        super(title);
        JPanel p = new JPanel();
        f1.setPreferredSize(new Dimension(400, 30));
        JLabel l1 = new JLabel("Nhap N: ");
        p.setLayout(new FlowLayout());
        p.add(l1);
        p.add(f1);
        add(p, BorderLayout.NORTH);
        add(f2, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String a = f1.getText();
                try {
                    long n = Long.parseLong(a);
                    if (Frame.inFibSeq(n)) {
                        f2.setText(n + " la so fibonacci!");
                    }
                    else {
                        f2.setText(n + " khong la so fibonacci!");
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Moi nhap so nguyen!");
                }
            }
             
        });
    }
}
