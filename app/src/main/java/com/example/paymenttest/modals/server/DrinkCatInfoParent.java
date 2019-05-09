package com.example.paymenttest.modals.server;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrinkCatInfoParent {

@SerializedName("drinkCatInfo")
@Expose
private List<DrinkCatInfo> drinkCatInfo = null;

public List<DrinkCatInfo> getDrinkCatInfo() {
return drinkCatInfo;
}

public void setDrinkCatInfo(List<DrinkCatInfo> drinkCatInfo) {
this.drinkCatInfo = drinkCatInfo;
}

}