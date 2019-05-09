package com.example.paymenttest.modals.server.local;

import java.io.Serializable;
import java.util.List;

public class ItemsChooseParent implements Serializable {
    private List<ItemsChoose> itemsChooses;

    public List<ItemsChoose> getItemsChooses() {
        return itemsChooses;
    }

    public void setItemsChooses(List<ItemsChoose> itemsChooses) {
        this.itemsChooses = itemsChooses;
    }
}
