package com.example.paymenttest.modals.server.local;
import com.example.paymenttest.modals.server.DishInfo;
import com.example.paymenttest.modals.server.FmInfo;
import com.example.paymenttest.modals.server.OmInfo;
import java.io.Serializable;
import java.util.List;

public class ItemsChoose implements Serializable {
    private DishInfo dishInfo;
    private FmInfo fmInfo;
    List<OmInfo> omInfos;

    public DishInfo getDishInfo() {
        return dishInfo;
    }

    public void setDishInfo(DishInfo dishInfo) {
        this.dishInfo = dishInfo;
    }

    public FmInfo getFmInfo() {
        return fmInfo;
    }

    public void setFmInfo(FmInfo fmInfo) {
        this.fmInfo = fmInfo;
    }

    public List<OmInfo> getOmInfos() {
        return omInfos;
    }

    public void setOmInfos(List<OmInfo> omInfos) {
        this.omInfos = omInfos;
    }
}
