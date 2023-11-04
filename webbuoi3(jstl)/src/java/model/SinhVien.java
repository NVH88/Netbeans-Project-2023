package model;

public class SinhVien {
    private int id;
    private String name;
    private boolean gender;

    public SinhVien(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean Gender) {
        this.gender = Gender;
    }

    @Override
    public String toString() {
        return "Hello " + this.name + " " + this.id;
    }
}