package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame {
    private JTextField displayField;
    private String s;
    private boolean calced;

    public Calculator() {
        this.calced = false;
        s = "0";
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        String[] buttonLabels = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "√", "^", "+",
            "C", ".", "="   
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                calced = true;
                Object result = evaluateExpression(s);
                displayField.setText(String.valueOf(result));
            } else if (buttonText.equals("C")) {
                // Xóa màn hình
                s = "";
                displayField.setText("");
            } else {
                // Thêm số hoặc phép toán vào màn hình
                if (calced) {
                    s = "";
                    displayField.setText("");
                    calced = false;
                }
                if (isOp(buttonText)) {
                    if (s.length() == 0) {
                        s += "0 ";
                    }
                    s += " " + buttonText + " ";
                }
                else s += buttonText;
//                System.out.println(s);
                displayField.setText(displayField.getText() + buttonText);
            }
        }
        
        public boolean isOp (String s) {
            if (s.length() != 1)
                return false;
            char op = s.charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '^' || op == '√')
                return true;
            return false;
        }
        
        public int ut(char op) {
            if (op == '+' || op == '-')
                return 1;
            if (op == '*' || op == '/')
                return 2;
            if (op == '√')
                return 3;
            return 4;
        }
        
        public String calc(String a, String b, char op) {
            try {
                Double A = Double.parseDouble(a);
                Double B = Double.parseDouble(b);
                if (op == '+') 
                    return A + B + "";
                if (op == '-') 
                    return A - B + "";
                if (op == '*') 
                    return A * B + "";
                if (op == '/') {
                    if (B == Double.parseDouble("0"))
                        return "Error";
                    return A / B + "";
                }
                return Math.pow(A, B) + "";
            } catch (Exception e) {
                return "Error";
            }
        }

        private Object evaluateExpression(String s) {
            // tính toán
            try {
                Stack<String> st = new Stack<>();
                Stack<Character> op = new Stack<>();
                String[] x = s.split("\\s+");
                for (String i : x) {
//                    System.out.println(i);
                    if (!isOp(i)) {
                        st.add(i);
                    }
                    else {
                        while (op.size() > 0 && (ut(op.peek()) >= ut(i.charAt(0)))) {
                            if (op.peek() == '√') {
                                op.pop();
                                long num = Long.parseLong(st.pop());
                                st.add(Math.sqrt(num) + "");
                            }
                            else {
                                String a = st.pop();
                                String b = st.pop();
                                st.add(calc(b, a, op.pop()));
                            }
                        }
                        op.add(i.charAt(0));
                    }
                }
                while (op.size() > 0) {
                    if (op.peek() == '√') {
                        op.pop();
                        double num = Double.parseDouble(st.pop());
                        st.add(Math.sqrt(num) + "");
                    }
                    else {
                        String a = st.pop();
                        String b = st.pop();
                        st.add(calc(b, a, op.pop()));
                    }
                }
                return st.peek();
            } catch (Exception e) {
                return "Error!";
            }
        }
    }
}
