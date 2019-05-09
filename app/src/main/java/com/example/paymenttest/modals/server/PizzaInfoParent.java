package com.example.paymenttest.modals.server;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PizzaInfoParent {

@SerializedName("pizzaInfo")
@Expose
private List<PizzaInfo> pizzaInfo = null;

public List<PizzaInfo> getPizzaInfo() {
return pizzaInfo;
}

public void setPizzaInfo(List<PizzaInfo> pizzaInfo) {
this.pizzaInfo = pizzaInfo;
}

}