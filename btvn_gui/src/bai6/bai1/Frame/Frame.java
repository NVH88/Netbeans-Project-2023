package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener {
    private JButton button = new JButton("OK");
    private JTextField field1 = new JTextField();
    private JTextField field2 = new JTextField();
    private JTextField res = new JTextField();

    public Frame(String title) {
        super(title);
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Nhap a:");
        JLabel l2 = new JLabel("Nhap b:");
        field1.setPreferredSize(new Dimension(240, 30));
        field2.setPreferredSize(new Dimension(240, 30));
        res.setPreferredSize(new Dimension(240, 30));
        p.add(l1);
        p.add(field1);
        p.add(l2);
        p.add(field2);
        add(p, BorderLayout.NORTH);
        add(res, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String a = field1.getText();
                String b = field2.getText();
                try {
                    double a_d = Double.parseDouble(a);
                    double b_d = Double.parseDouble(b);
                    if (a_d == 0) {
                        if (b_d == 0) {
                            res.setText("Phuong trinh vo so nghiem");
                        } else {
                            res.setText("Phuong trinh vo nghiem");
                        }
                    } else {
                        double n = -b_d / a_d;
                        res.setText("Phuong trinh co nghiem: " + n);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Input khong hop le, moi nhap so thuc");
                }
            }

        });
    }
}
