package model;

public class Player {
//-- create table player(
//-- playerid int,
//-- playername varchar(30),
//-- numberShirt int,
//-- nation varchar(30),
//-- age int, 
//-- transfer int,
//-- cid int,
//-- primary key(playerid)
//-- )
    private int playerId, numberShirt, age, transfer, cid;
    private String playerName, nation;

    public Player(int playerId, int numberShirt, int age, int transfer, int cid, String playerName, String nation) {
        this.playerId = playerId;
        this.numberShirt = numberShirt;
        this.age = age;
        this.transfer = transfer;
        this.cid = cid;
        this.playerName = playerName;
        this.nation = nation;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getNumberShirt() {
        return numberShirt;
    }

    public int getAge() {
        return age;
    }

    public int getTransfer() {
        return transfer;
    }

    public int getCid() {
        return cid;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getNation() {
        return nation;
    }
}