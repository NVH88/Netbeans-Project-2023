package model;

public class Od {
//-- od_id varchar(10), 
//-- od_ten varchar(20),
//-- shipper_id varchar(10)    
    private String odId, odTen, shipperId;

    public Od() {
    }

    public Od(String odId, String odTen, String shipperId) {
        this.odId = odId;
        this.odTen = odTen;
        this.shipperId = shipperId;
    }

    public String getOdId() {
        return odId;
    }

    public void setOdId(String odId) {
        this.odId = odId;
    }

    public String getOdTen() {
        return odTen;
    }

    public void setOdTen(String odTen) {
        this.odTen = odTen;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }
    
    
}