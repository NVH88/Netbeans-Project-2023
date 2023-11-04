package model;

public class Club {
//-- create table club(
//-- clubid int,
//-- clubname varchar(30),
//-- clubrank int
//-- )
    private int clubId, clubRank;
    private String clubName;

    public Club(int clubId, int clubRank, String clubName) {
        this.clubId = clubId;
        this.clubRank = clubRank;
        this.clubName = clubName;
    }

    public int getClubId() {
        return clubId;
    }

    public int getClubRank() {
        return clubRank;
    }

    public String getClubName() {
        return clubName;
    }
}