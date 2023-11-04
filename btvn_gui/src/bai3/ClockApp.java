package bai3;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        frame.setSize(400, 400); // Điều chỉnh kích thước cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ClockPanel clockPanel = new ClockPanel();
        frame.add(clockPanel);

        frame.setVisible(true);
    }
}

class ClockPanel extends JPanel {
    private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat hourMinuteFormat = new SimpleDateFormat("HH:mm");
    private Timer timer;

    public ClockPanel() {
        timer = new Timer(1000, e -> {
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 40; // Giảm kích thước đồng hồ

        // Vẽ đồng hồ
        g.setColor(Color.WHITE);
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // Vẽ kim giờ, phút, giây
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        drawHand(g, centerX, centerY, hour, radius * 0.5, 12, hour * 30);
        drawHand(g, centerX, centerY, minute, radius * 0.7, 6, minute * 6);
        drawHand(g, centerX, centerY, second, radius * 0.9, 3, second * 6);

        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        drawNumber(g, centerX, centerY, "3", radius * 0.85);
        drawNumber(g, centerX, centerY, "6", radius * 0.85);
        drawNumber(g, centerX, centerY, "9", radius * 0.85);
        drawNumber(g, centerX, centerY, "12", radius * 0.85);

        g.setFont(new Font("Arial", Font.PLAIN, 15));
        String time = timeFormat.format(now.getTime());
        g.drawString("Time (24h): " + time, centerX - 50, centerY + radius + 20);
    }

    private void drawHand(Graphics g, int centerX, int centerY, int value, double length, int width, int angle) {
        double radians = Math.toRadians(90 - angle);
        int x = (int) (centerX + length * Math.cos(radians));
        int y = (int) (centerY - length * Math.sin(radians));
        g.setColor(Color.BLACK);
        ((Graphics2D) g).setStroke(new BasicStroke(width));
        g.drawLine(centerX, centerY, x, y);
    }

    private void drawNumber(Graphics g, int centerX, int centerY, String number, double distance) {
        double angle = Math.toRadians(90 - (30 * Integer.parseInt(number)));
        int x = (int) (centerX + distance * Math.cos(angle));
        int y = (int) (centerY - distance * Math.sin(angle));

        g.drawString(number, x, y);
    }
}
