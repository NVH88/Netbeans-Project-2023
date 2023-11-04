/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author DELL
 */
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        String jsonStr = "{\n" +
                "    \"user_id\": 6,\n" +
                "    \"article_id\": 7,\n" +
                "    \"content\": \"bai viet that hay va bo ich\"\n" +
                "}";

        // Phân tích chuỗi JSON thành một đối tượng JSONObject
        JSONObject jsonObject = new JSONObject(jsonStr);

        // Lấy giá trị từ JSON bằng các khóa (keys)
        int userId = jsonObject.getInt("user_id");
        int articleId = jsonObject.getInt("article_id");
        String content = jsonObject.getString("content");

        // In ra các giá trị
        System.out.println("User ID: " + userId);
        System.out.println("Article ID: " + articleId);
        System.out.println("Content: " + content);
    }
}