package com.example.paymenttest.modals.server;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DishInfoParent {

@SerializedName("dishInfo")
@Expose
private List<DishInfo> dishInfo = null;

public List<DishInfo> getDishInfo() {
return dishInfo;
}

public void setDishInfo(List<DishInfo> dishInfo) {
this.dishInfo = dishInfo;
}

}