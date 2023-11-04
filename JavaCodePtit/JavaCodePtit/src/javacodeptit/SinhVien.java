package javacodeptit;

public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private int ac, submit;

    public SinhVien(String ten, int ac, int submit) {
        this.ten = ten;
        this.ac = ac;
        this.submit = submit;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.ac != o.ac)
            return o.ac - this.ac;
        if (this.submit != o.submit)
            return this.submit - o.submit;
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return this.ten + " " + this.ac + " " + this.submit;
    }
}