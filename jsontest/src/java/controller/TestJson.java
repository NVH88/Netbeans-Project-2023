package controller;

import com.google.gson.Gson;
import java.util.ArrayList;
import model.Student;

public class TestJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
//        Student s = new Student(1, 20, "nvh");
//        ArrayList<Student> arr = new ArrayList<>();
//        arr.add(s);
//        String json = gson.toJson(arr, ArrayList.class);
//        System.out.println(json);
        String json = "{\"student_id\":1,\"age\":20,\"name\":\"nvh\"}";
        Student s = gson.fromJson(json, Student.class);
        System.out.println(s);
    }
}