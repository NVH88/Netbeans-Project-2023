/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
//@WebServlet(name = "TinhHcn2", urlPatterns = {"/tinh2"})
public class TinhHcn2 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String d = request.getParameter("dai");
        String r = request.getParameter("rong");
        String cv = request.getParameter("cv");
        String dt = request.getParameter("dt");
        PrintWriter out = response.getWriter();
        try {
            double a = Double.parseDouble(d), b = Double.parseDouble(r);
            if (cv != null && dt != null) {
                out.println("Chu vi: " + (a + b) * 2);
                out.print("Dien tich: " + (a * b));
            }
            else if (cv != null) {
                out.print("Chu vi: " + (a + b) * 2);
            }
            else if (dt != null) {
                out.print("Dien tich: " + (a * b));
            }
            else {
                out.print("hay chon kieu tinh");
            }
        } catch (Exception e) {
            out.print("hay nhap chinh xac!");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("hcn.html").forward(request, response);
    }
    
}