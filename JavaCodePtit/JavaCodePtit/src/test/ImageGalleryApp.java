/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ImageGalleryApp {
    private List<Image> images = new ArrayList<>();
    private int currentImageIndex = 0;
    private JLabel imageView;
    
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new ImageGalleryApp().createAndShowGUI();
//        });
//    }
    
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Image Gallery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        imageView = new JLabel();
        imageView.setHorizontalAlignment(JLabel.CENTER);
        imageView.setVerticalAlignment(JLabel.CENTER);
        frame.add(imageView, BorderLayout.CENTER);
        
        JFileChooser fileChooser = new JFileChooser();
        JButton openButton = new JButton("Open Image");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
                    Image image = imageIcon.getImage();
                    images.add(image);
                    displayCurrentImage();
                }
            }
        });
        
        JButton previousButton = new JButton("Previous");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentImageIndex > 0) {
                    currentImageIndex--;
                    displayCurrentImage();
                }
            }
        });
        
        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentImageIndex < images.size() - 1) {
                    currentImageIndex++;
                    displayCurrentImage();
                }
            }
        });
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(openButton);
        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);
        
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
    
    private void displayCurrentImage() {
        if (!images.isEmpty()) {
            Image currentImage = images.get(currentImageIndex);
            ImageIcon imageIcon = new ImageIcon(currentImage);
            imageView.setIcon(imageIcon);
        }
    }
}
