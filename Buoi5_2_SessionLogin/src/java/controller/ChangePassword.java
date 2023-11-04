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
import jakarta.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author DELL
 */
@WebServlet(name="ChangePassword", urlPatterns={"/changepassword"})
public class ChangePassword extends HttpServlet {
   
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
            out.println("<title>Servlet ChangePassword</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChangePassword at " + request.getContextPath () + "</h1>");
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
        HttpSession session = request.getSession();
        User ur = (User)session.getAttribute("ur");
        UserDAO ud = new UserDAO();
        String oldpass = request.getParameter("oldpass");
        String newpass = request.getParameter("newpass");
        String conpass = request.getParameter("conpass");
        if (oldpass.hashCode() != ur.getPass()) {
            request.setAttribute("changeMess", "Password incorrect!");
        } else if (newpass.length() < 6 || !check(newpass)) {
            request.setAttribute("changeMess", "Password must be more than 6 characters and include both letters and numbers!");
        } else if (!newpass.equals(conpass)) {
            request.setAttribute("changeMess", "Password confirm incorrect!");
        } else {
            ud.changePassword(ur.getUrname(), newpass);
            User u = ud.getUser(ur.getUrname(), newpass);
            session.setAttribute("ur", u);
            request.setAttribute("changeMess", "Change sucessfully!");
        }
        request.getRequestDispatcher("changepassword.jsp").forward(request, response);
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
