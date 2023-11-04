package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    private JButton btn = new JButton("OK"); 
    private JTextField f1 = new JTextField();
    private JTextField f2 = new JTextField();
    private JTextField res1 = new JTextField();
    private JTextField res2 = new JTextField();

    public Frame(String title) {
        super(title);
        JPanel p = new JPanel();
        f1.setPreferredSize(new Dimension(200, 30));
        f2.setPreferredSize(new Dimension(200, 30));
        res1.setPreferredSize(new Dimension(400, 30));
        res2.setPreferredSize(new Dimension(400, 30));
        res1.setEditable(false);
        res2.setEditable(false);
        JLabel l1 = new JLabel("Nhap chieu dai: ");
        JLabel l2 = new JLabel("Nhap chieu rong: ");
        JLabel l3 = new JLabel("Chu vi: ");
        JLabel l4 = new JLabel("Dien tich: ");
        p.setLayout(new FlowLayout());
        p.add(l1);
        p.add(f1);
        p.add(l2);
        p.add(f2);
        add(p, BorderLayout.NORTH);
        JPanel cv = new JPanel();
        cv.setLayout(new FlowLayout());
        cv.add(l3);
        cv.add(res1);
        JPanel dt = new JPanel();
        dt.setLayout(new FlowLayout());
        dt.add(l4);
        dt.add(res2);
        JPanel grouped = new JPanel();
        grouped.setLayout(new BoxLayout(grouped, BoxLayout.PAGE_AXIS));
        grouped.add(cv);
        grouped.add(dt);
        add(grouped, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String a = f1.getText();
                String b = f2.getText();
                try {
                    Double h = Double.parseDouble(a);
                    Double w = Double.parseDouble(b);
                    if (h <= 0 || w <= 0) {
                        JOptionPane.showMessageDialog(null, "Do dai khong hop le!");
                        res1.setText("#");
                        res2.setText("#");
                    }
                    else {
                        Double d = h + w + h + w;
                        Double area = h * w;
                        res1.setText(String.format("%f", d));
                        res2.setText(String.format("%f", area));
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Moi nhap so!");
                    res1.setText("#");
                    res2.setText("#");
                }
            }
             
        });
    }
}
