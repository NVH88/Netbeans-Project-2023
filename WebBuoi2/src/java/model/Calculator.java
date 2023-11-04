package model;

public class Calculator {
    private String num1, num2, op;

    public Calculator() {
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    public String getResult() {
        String res;
        try {
            Double a = Double.parseDouble(num1), b = Double.parseDouble(num2);
            if (op.equals("+"))
                res = (a + b) + "";
            else if (op.equals("-"))
                res = (a - b) + "";
            else if (op.equals("*"))
                res = (a * b) + "";
            else if (b == 0)
                res = "Khong the chia cho 0";
            else res = (a / b) + "";
        } catch (Exception e) {
            res = e.toString();
        }
        return res;
    }
}