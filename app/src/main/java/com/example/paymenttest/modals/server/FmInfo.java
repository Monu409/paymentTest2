package com.example.paymenttest.modals.server;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FmInfo implements Serializable {

@SerializedName("fm_item_id")
@Expose
private String fmItemId;
@SerializedName("fm_cat_id")
@Expose
private String fmCatId;
@SerializedName("restaurant_id")
@Expose
private String restaurantId;
@SerializedName("fm_item_name")
@Expose
private String fmItemName;
@SerializedName("cn_fm_item_name")
@Expose
private String cnFmItemName;
@SerializedName("ingredients")
@Expose
private String ingredients;
@SerializedName("price")
@Expose
private String price;
@SerializedName("remote_fm_id")
@Expose
private String remoteFmId;

public String getFmItemId() {
return fmItemId;
}

public void setFmItemId(String fmItemId) {
this.fmItemId = fmItemId;
}

public String getFmCatId() {
return fmCatId;
}

public void setFmCatId(String fmCatId) {
this.fmCatId = fmCatId;
}

public String getRestaurantId() {
return restaurantId;
}

public void setRestaurantId(String restaurantId) {
this.restaurantId = restaurantId;
}

public String getFmItemName() {
return fmItemName;
}

public void setFmItemName(String fmItemName) {
this.fmItemName = fmItemName;
}

public String getCnFmItemName() {
return cnFmItemName;
}

public void setCnFmItemName(String cnFmItemName) {
this.cnFmItemName = cnFmItemName;
}

public String getIngredients() {
return ingredients;
}

public void setIngredients(String ingredients) {
this.ingredients = ingredients;
}

public String getPrice() {
return price;
}

public void setPrice(String price) {
this.price = price;
}

public String getRemoteFmId() {
return remoteFmId;
}

public void setRemoteFmId(String remoteFmId) {
this.remoteFmId = remoteFmId;
}

}