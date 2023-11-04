package bai1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chooser App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton colorButton = new JButton("Chọn màu");
        frame.add(colorButton);

        JPanel colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(300, 200));
        frame.add(colorPanel);

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(null, "Chọn màu", Color.BLACK);
                if (selectedColor != null) {
                    colorPanel.setBackground(selectedColor);
                }
            }
        });

        frame.setVisible(true);
    }
}
