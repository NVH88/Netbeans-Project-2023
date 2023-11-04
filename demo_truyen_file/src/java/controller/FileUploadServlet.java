package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.Part;

@WebServlet("/FileUploadServlet")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uploadPath = "C:\\Users\\DELL\\OneDrive - ptit.edu.vn\\Desktop\\"; // Thay đổi đường dẫn tùy ý

        // Lấy tất cả các phần tệp được gửi từ trình duyệt
        for (Part part : request.getParts()) {
            String fileName = getFileName(part);
            if (fileName != null) {
                // Ghi tệp vào hệ thống tệp của bạn
                InputStream is = part.getInputStream();
                FileOutputStream os = new FileOutputStream(uploadPath + fileName);
                int ch;
                while ((ch = is.read()) != -1) {
                    os.write(ch);
                }
                os.close();
            }
        }

        response.getWriter().println("Tệp đã được tải lên thành công.");
    }

    private String getFileName(Part part) {
        String contentDisposition = part.getHeader("content-disposition");
        String[] tokens = contentDisposition.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf('=') + 2, token.length() - 1);
            }
        }
        return null;
    }
}