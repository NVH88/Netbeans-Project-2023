package bai1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserApp {
    private static Color backgroundColor = Color.WHITE;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chooser App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JButton colorButton = new JButton("Chọn màu");
        frame.add(colorButton, BorderLayout.NORTH);

        JPanel colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100, 100));
        frame.add(colorPanel, BorderLayout.CENTER);

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(null, "Chọn màu", backgroundColor);
                if (selectedColor != null) {
                    backgroundColor = selectedColor;
                    colorPanel.setBackground(backgroundColor);
                }
            }
        });

        frame.setVisible(true);
    }
}
