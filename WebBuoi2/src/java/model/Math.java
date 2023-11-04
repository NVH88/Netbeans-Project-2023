/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Math {
    private String num1, num2, op;
    
    public Math(){}

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getResult() {
        String res = "";
        try {
            double a = Double.parseDouble(num1), b = Double.parseDouble(num2);
            if (op.equals("+")) 
                res = (a + b) + "";
            if (op.equals("-")) 
                res = (a - b) + "";
            if (op.equals("*")) 
                res = (a * b) + "";
            if (op.equals("/")) {
                if (b != 0) 
                    res = (a + b) + "";   
                res = "Khong the chia cho 0";
            }        
        } catch(Exception e){
            res = e.toString();
        }
        return res;
    }
}