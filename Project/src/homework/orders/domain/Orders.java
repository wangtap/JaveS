package homework.orders.domain;

public class Orders {
    private int oid;
    private String orderTime;
    private String price;
    private int state;
    private int uid;
    private String address;

    public Orders(int oid, String orderTime, String price, int state) {
        this.oid = oid;
        this.orderTime = orderTime;
        this.price = price;
        this.state = state;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", orderTime='" + orderTime + '\'' +
                ", price=" + price +
                ", state=" + state +
                ", uid=" + uid +
                ", address='" + address + '\'' +
                '}';
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }




    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Orders(int oid, String orderTime, String price, int state, int uid, String address) {
        this.oid = oid;
        this.orderTime = orderTime;
        this.price = price;
        this.state = state;
        this.uid = uid;
        this.address = address;
    }

    public Orders() {

    }
}
