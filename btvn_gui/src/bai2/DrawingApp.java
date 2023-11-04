package bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class DrawingApp {
    public JFrame frame;
    private JPanel drawingPanel;
    private JComboBox<String> shapeSelector;
    private JComboBox<String> fillTypeSelector;

    private Color selectedColor = Color.BLACK;
    private String selectedShape = null;
    private boolean isFilled = false;

    private JButton drawButton;
    private JButton colorButton;

    private JTextField widthField;
    private JLabel widthLabel;

    private JTextField heightField;
    private JLabel heightLabel;

    private JTextField sideField;
    private JLabel sideLabel;

    private JTextField ovalField;
    private JLabel ovalLabel;
    
    private JTextField lineField;
    private JLabel lineLabel;

    public int a, b, c ,d, nLines;

    public DrawingApp() {
        frame = new JFrame("DrawingApp");
        frame.setBounds(370, 100, 800, 600);

        shapeSelector = new JComboBox<>(new String[]{"Hình Vuông", "Hình Chữ Nhật", "Hình Tròn", "Hình Đa Giác"});

        fillTypeSelector = new JComboBox<>(new String[]{"Rỗng", "Đặc"});

        drawButton = new JButton("Vẽ");
        colorButton = new JButton("Chọn Màu");
        // hình chữ nhật
        widthField = new JTextField(3);
        widthLabel = new JLabel("Chiều rộng: ");
        heightField = new JTextField(3);
        heightLabel = new JLabel("Chiều cao: ");
        // hình vuông
        sideField = new JTextField(3);
        sideLabel = new JLabel("Độ dài cạnh: ");
        // hình tròn
        ovalLabel = new JLabel("Đường kính: ");
        ovalField = new JTextField(3);
        // hình đa giác
        lineLabel = new JLabel("Số cạnh: ");
        lineField = new JTextField(3);

        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (selectedShape != null) {
                    g.setColor(selectedColor);
                    int x = (getWidth() - 100) / 2;
                    int y = (getHeight() - 100) / 2;

                    if (selectedShape.equals("Hình Vuông")) {
                        if (isFilled) {
                            g.fillRect(x, y, c, c);
                        } else {
                            g.drawRect(x, y, c, c);
                        }
                    } else if (selectedShape.equals("Hình Chữ Nhật")) {
                        if (isFilled) {
                            g.fillRect(x, y, a, b);
                        } else {
                            g.drawRect(x, y, a, b);
                        }
                    } else if (selectedShape.equals("Hình Tròn")) {
                        if (isFilled) {
                            g.fillOval(x, y, d, d);
                        } else {
                            g.drawOval(x, y, d, d);
                        }
                    } else if (selectedShape.equals("Hình Đa Giác")) {
                        int[] xPoints = new int[nLines];
                        int[] yPoints = new int[nLines];
                        Random random = new Random();
                        for (int i = 0; i < nLines; i++) {
                            xPoints[i] = random.nextInt(x + 300); 
                            yPoints[i] = random.nextInt(y + 300); 
                        }
                        if (isFilled) {
                            g.fillPolygon(xPoints, yPoints, nLines);
                        } else {
                            g.drawPolygon(xPoints, yPoints, nLines);
                        }
                    }
                }
            }
        };

        shapeSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateControlPanel();
            }
        });

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedShape = (String) shapeSelector.getSelectedItem();
                isFilled = fillTypeSelector.getSelectedIndex() == 1;
                if (selectedShape.equals("Hình Vuông")) {
                    c = Integer.parseInt(sideField.getText());

                } else if (selectedShape.equals("Hình Chữ Nhật")) {
                    a = Integer.parseInt(widthField.getText());
                    b = Integer.parseInt(heightField.getText());
                } else if(selectedShape.equals("Hình Tròn")) {
                    d = Integer.parseInt(ovalField.getText());
                } 
                else if(selectedShape.equals("Hình Đa Giác")) {
                    nLines = Integer.parseInt(lineField.getText());
                }
                drawingPanel.repaint();
            }
        });

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColor = JColorChooser.showDialog(frame, "Chọn Màu", selectedColor);
            }
        });

        JPanel controlsPanel = new JPanel();
        controlsPanel.add(shapeSelector);
        controlsPanel.add(fillTypeSelector);  
        controlsPanel.add(colorButton);

        controlsPanel.add(widthLabel);
        controlsPanel.add(widthField);

        controlsPanel.add(heightLabel);
        controlsPanel.add(heightField);

        controlsPanel.add(sideLabel);
        controlsPanel.add(sideField);

        controlsPanel.add(ovalLabel);
        controlsPanel.add(ovalField);

        controlsPanel.add(lineLabel);        
        controlsPanel.add(lineField);

        controlsPanel.add(drawButton);

        sideLabel.setVisible(true);
        sideField.setVisible(true);

        widthLabel.setVisible(false);
        widthField.setVisible(false);
        heightLabel.setVisible(false);
        heightField.setVisible(false);

        ovalField.setVisible(false);
        ovalLabel.setVisible(false);

        lineField.setVisible(false);
        lineLabel.setVisible(false);

        frame.add(controlsPanel, BorderLayout.NORTH);
        frame.add(drawingPanel, BorderLayout.CENTER);
    }
    
    public void updateControlPanel() {
        String selectedShape = (String) shapeSelector.getSelectedItem();
    
        if (selectedShape.equals("Hình Vuông")) {
            sideLabel.setVisible(true);
            sideField.setVisible(true);

            widthLabel.setVisible(false);
            widthField.setVisible(false);
            heightLabel.setVisible(false);
            heightField.setVisible(false);

            ovalField.setVisible(false);
            ovalLabel.setVisible(false);

            lineField.setVisible(false);
            lineLabel.setVisible(false);
        } else if (selectedShape.equals("Hình Chữ Nhật")) {
            widthLabel.setVisible(true);
            widthField.setVisible(true);
            heightLabel.setVisible(true);
            heightField.setVisible(true);

            sideLabel.setVisible(false);
            sideField.setVisible(false);

            ovalField.setVisible(false);
            ovalLabel.setVisible(false);

            lineField.setVisible(false);
            lineLabel.setVisible(false);
        } else if(selectedShape.equals("Hình Tròn")) {
            ovalField.setVisible(true);
            ovalLabel.setVisible(true);

            sideLabel.setVisible(false);
            sideField.setVisible(false);

            widthLabel.setVisible(false);
            widthField.setVisible(false);
            heightLabel.setVisible(false);
            heightField.setVisible(false);

            lineField.setVisible(false);
            lineLabel.setVisible(false);
        } else if(selectedShape.equals("Hình Đa Giác")){
            lineField.setVisible(true);
            lineLabel.setVisible(true);

            sideLabel.setVisible(false);
            sideField.setVisible(false);

            widthLabel.setVisible(false);
            widthField.setVisible(false);
            heightLabel.setVisible(false);
            heightField.setVisible(false);
                
            ovalField.setVisible(false);
            ovalLabel.setVisible(false);
        }
    }
}
