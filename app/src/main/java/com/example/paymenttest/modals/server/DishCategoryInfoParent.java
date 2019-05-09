package com.example.paymenttest.modals.server;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DishCategoryInfoParent {

@SerializedName("dishCategoryInfo")
@Expose
private List<DishCategoryInfo> dishCategoryInfo = null;

public List<DishCategoryInfo> getDishCategoryInfo() {
return dishCategoryInfo;
}

public void setDishCategoryInfo(List<DishCategoryInfo> dishCategoryInfo) {
this.dishCategoryInfo = dishCategoryInfo;
}

}