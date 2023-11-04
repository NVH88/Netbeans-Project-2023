/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import model.Person;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";

        // Chuyển đổi từ JSON thành đối tượng Java
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);

        System.out.println("Tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Thành phố: " + person.getCity());

        // Chuyển đổi từ đối tượng Java thành JSON
        String jsonFromObject = gson.toJson(person);
        System.out.println("JSON từ đối tượng Java: " + jsonFromObject);
    }
}