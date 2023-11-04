package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    private JButton btn = new JButton("OK"); 
    private JTextField f1 = new JTextField();
    private JTextField f2 = new JTextField();

    private static boolean isPrime(long a) {
        if (a < 2) {
            return false;
        }
        if (a < 4) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
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
                    if (Frame.isPrime(n)) {
                        f2.setText(n + " la so nguyen to!");
                    }
                    else {
                        f2.setText(n + " khong la so nguyen to!");
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Moi nhap so nguyen!");
                }
            }
             
        });
    }
}
