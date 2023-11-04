package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener {
    private JButton btn = new JButton("OK"); 
    private JTextField f1 = new JTextField();
    private JTextField f2 = new JTextField();

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
                    if (n <= 0) {
                        throw new Exception();
                    }
                    long res = (1 + n) * n;
                    res /= 2;
                    f2.setText("Tong " + n + " so nguyen duong dau tien la: " + res);
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Moi nhap so nguyen duong!");
                }
            }
             
        });
    }
}
