package model;

public class Student {
    private int id;
    private String name, dob;
    private boolean gender;

    public Student(int id, String name, String dob, boolean gender) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public boolean isGender() {
        return gender;
    }
    
    
}