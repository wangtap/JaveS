package homework.orderitem.domain;

public class OrderItem {
    private int iid;
    private int count;
    private int subtotal;
    private int oid;
    private int bid;

    @Override
    public String toString() {
        return "OrderItem{" +
                "iid=" + iid +
                ", count=" + count +
                ", subtotal=" + subtotal +
                ", oid=" + oid +
                ", bid=" + bid +
                '}';
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public OrderItem(int iid, int count, int subtotal, int bid) {
        this.iid = iid;
        this.count = count;
        this.subtotal = subtotal;
        this.bid = bid;
    }

    public OrderItem(int iid, int count, int subtotal, int oid, int bid) {

        this.iid = iid;
        this.count = count;
        this.subtotal = subtotal;
        this.oid = oid;
        this.bid = bid;
    }

    public OrderItem() {

    }
}
