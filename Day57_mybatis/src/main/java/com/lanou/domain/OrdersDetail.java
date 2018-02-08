package com.lanou.domain;

import com.lanou.domain.Items;

public class OrdersDetail  {
    private int id;
    private Items items;

    @Override
    public String toString() {
        return "OrdersDetail{" +
                "id=" + id +
                ", items=" + items +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
