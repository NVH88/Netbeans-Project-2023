package test_img_link;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class Test_img_link {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            FileWriter fileWriter = new FileWriter("link");
            System.out.println(1);
            // Bước 1: Đọc ảnh từ file
            String imagePath = "C:\\Users\\DELL\\OneDrive - ptit.edu.vn\\Desktop\\kks.jpg";
            File imageFile = new File(imagePath);
            Path path = imageFile.toPath();

        
            byte[] imageBytes = Files.readAllBytes(path);

            // Bước 2: Chuyển đổi dữ liệu ảnh thành Base64
            String base64Image = Base64.getEncoder().encodeToString(imageBytes);

            // Bước 3: Tạo URL cho ảnh
            String imageUrl = "data:image/jpeg;base64," + base64Image;
            fileWriter.write(imageUrl);
            fileWriter.close();
            System.out.println(imageUrl);
            System.out.println(imageUrl.length());
        } catch (IOException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
    }
    
}
