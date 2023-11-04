/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name="SignUp", urlPatterns={"/signup"})
public class SignUp extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUp</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUp at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String urname = request.getParameter("username");
        String pass = request.getParameter("password");
        String repass = request.getParameter("repassword");
        String fullname = request.getParameter("fullname");
        String phonenum_raw = request.getParameter("phonenum");
        try {
            int phonenum = Integer.parseInt(phonenum_raw);
            UserDAO ud = new UserDAO();
            if (ud.getUserByUrname(urname) != null) {
                request.setAttribute("suMess", "Username exists!");
            } else if (pass.length() < 6 || !check(pass)) {
                request.setAttribute("suMess", "Password must be more than 6 characters and include both letters and numbers!");
            } else if (!pass.equals(repass)) {
                request.setAttribute("suMess", "Password confirm incorrect!");
            } else {
                ud.insertUser(urname, pass, fullname, phonenum);
                request.setAttribute("suMess", "Sign up sucessfully!");
            }
        } catch (NumberFormatException e) {
            request.setAttribute("suMess", "Phone number is not in the correct format!");
        }
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    } 
    
    private boolean check(String s) {
        boolean chu = false, so = false;
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isAlphabetic(s.charAt(i)))
                chu = true;
            if (Character.isDigit(s.charAt(i)))
                so = true;
        }
        return (chu == true && so == true);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
