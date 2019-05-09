package com.example.paymenttest.modals.server;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrinkCatInfo {

@SerializedName("drink_cat_id")
@Expose
private String drinkCatId;
@SerializedName("drink_cat_name")
@Expose
private String drinkCatName;
@SerializedName("cn_name")
@Expose
private String cnName;
@SerializedName("restaurant_id")
@Expose
private String restaurantId;
@SerializedName("category_id")
@Expose
private String categoryId;
@SerializedName("dcat_sort")
@Expose
private String dcatSort;
@SerializedName("picture")
@Expose
private String picture;
@SerializedName("status")
@Expose
private String status;
@SerializedName("online")
@Expose
private String online;
@SerializedName("printer_id")
@Expose
private String printerId;
@SerializedName("printer_type")
@Expose
private String printerType;
@SerializedName("happy_hours_id")
@Expose
private String happyHoursId;
@SerializedName("cat_type")
@Expose
private String catType;
@SerializedName("inshop_ordering")
@Expose
private String inshopOrdering;

public String getDrinkCatId() {
return drinkCatId;
}

public void setDrinkCatId(String drinkCatId) {
this.drinkCatId = drinkCatId;
}

public String getDrinkCatName() {
return drinkCatName;
}

public void setDrinkCatName(String drinkCatName) {
this.drinkCatName = drinkCatName;
}

public String getCnName() {
return cnName;
}

public void setCnName(String cnName) {
this.cnName = cnName;
}

public String getRestaurantId() {
return restaurantId;
}

public void setRestaurantId(String restaurantId) {
this.restaurantId = restaurantId;
}

public String getCategoryId() {
return categoryId;
}

public void setCategoryId(String categoryId) {
this.categoryId = categoryId;
}

public String getDcatSort() {
return dcatSort;
}

public void setDcatSort(String dcatSort) {
this.dcatSort = dcatSort;
}

public String getPicture() {
return picture;
}

public void setPicture(String picture) {
this.picture = picture;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getOnline() {
return online;
}

public void setOnline(String online) {
this.online = online;
}

public String getPrinterId() {
return printerId;
}

public void setPrinterId(String printerId) {
this.printerId = printerId;
}

public String getPrinterType() {
return printerType;
}

public void setPrinterType(String printerType) {
this.printerType = printerType;
}

public String getHappyHoursId() {
return happyHoursId;
}

public void setHappyHoursId(String happyHoursId) {
this.happyHoursId = happyHoursId;
}

public String getCatType() {
return catType;
}

public void setCatType(String catType) {
this.catType = catType;
}

public String getInshopOrdering() {
return inshopOrdering;
}

public void setInshopOrdering(String inshopOrdering) {
this.inshopOrdering = inshopOrdering;
}

}