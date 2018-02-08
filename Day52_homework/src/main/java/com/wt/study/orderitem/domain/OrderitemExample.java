package com.wt.study.orderitem.domain;

import com.wt.study.commodity.domain.Commodity;

public class OrderitemExample extends Orderitem {
    private Commodity commodity;

    @Override
    public String toString() {
        return super.toString()+
                "OrderitemExample{" +
                "commodity=" + commodity +
                '}';
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }
}
