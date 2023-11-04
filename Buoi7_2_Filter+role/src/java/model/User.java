package model;

public class User {
//-- create table ur(
//-- name varchar(20),
//-- rol int,
//-- urname varchar(20),
//-- pass varchar(20),
//-- primary key(urname)
//-- )
    
    private String urname, password, name;
    private int role;

    public User(String urname, String password, String name, int role) {
        this.urname = urname;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public String getUrname() {
        return urname;
    }

    public int getRole() {
        return role;
    }
    
    public String getRoleName() {
        if (this.role == 1) {
            return "nguoi mua";
        }
        return "nguoi ban";
    }
}