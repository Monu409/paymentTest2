package com.example.paymenttest.modals.server;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrinkInfoParent {

@SerializedName("drinkInfo")
@Expose
private List<DrinkInfo> drinkInfo = null;

public List<DrinkInfo> getDrinkInfo() {
return drinkInfo;
}

public void setDrinkInfo(List<DrinkInfo> drinkInfo) {
this.drinkInfo = drinkInfo;
}

}