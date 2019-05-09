package com.example.paymenttest.modals.server;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class OmInfo implements Serializable {

@SerializedName("om_item_id")
@Expose
private String omItemId;
@SerializedName("om_cat_id")
@Expose
private String omCatId;
@SerializedName("restaurant_id")
@Expose
private String restaurantId;
@SerializedName("om_item_name")
@Expose
private String omItemName;
@SerializedName("cn_om_item_name")
@Expose
private String cnOmItemName;
@SerializedName("ingredients")
@Expose
private String ingredients;
@SerializedName("price")
@Expose
private String price;
@SerializedName("remote_om_id")
@Expose
private String remoteOmId;

    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }



public String getOmItemId() {
return omItemId;
}

public void setOmItemId(String omItemId) {
this.omItemId = omItemId;
}

public String getOmCatId() {
return omCatId;
}

public void setOmCatId(String omCatId) {
this.omCatId = omCatId;
}

public String getRestaurantId() {
return restaurantId;
}

public void setRestaurantId(String restaurantId) {
this.restaurantId = restaurantId;
}

public String getOmItemName() {
return omItemName;
}

public void setOmItemName(String omItemName) {
this.omItemName = omItemName;
}

public String getCnOmItemName() {
return cnOmItemName;
}

public void setCnOmItemName(String cnOmItemName) {
this.cnOmItemName = cnOmItemName;
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

public String getRemoteOmId() {
return remoteOmId;
}

public void setRemoteOmId(String remoteOmId) {
this.remoteOmId = remoteOmId;
}

}