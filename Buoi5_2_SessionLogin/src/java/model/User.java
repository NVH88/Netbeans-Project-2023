package model;

public class User {
//-- create table user(
//-- urname varchar(30),
//-- pass varchar(30),
//-- fullname varchar(50),
//-- phonenum int,
//-- primary key(urname)
//-- )    
    private String urname, pass, fullname;
    private int phonenum;

    public User(String urname, String pass, String fullname, int phonenum) {
        this.urname = urname;
        this.pass = pass;
        this.fullname = fullname;
        this.phonenum = phonenum;
    }

    public String getUrname() {
        return urname;
    }

    public String getFullname() {
        return fullname;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public int getPass() {
        return pass.hashCode();
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }
    
    
}