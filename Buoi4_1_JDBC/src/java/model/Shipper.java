package model;

public class Shipper {
//-- id varchar(10),
//-- ten varchar(20),
//-- tuoi int    
    private String id, ten;
    private int tuoi;

    public Shipper() {
    }

    public Shipper(String id, String ten, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
}