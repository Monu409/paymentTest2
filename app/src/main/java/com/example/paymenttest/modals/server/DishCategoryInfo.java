package com.example.paymenttest.modals.server;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DishCategoryInfo {

@SerializedName("category_id")
@Expose
private String categoryId;
@SerializedName("cname")
@Expose
private String cname;
@SerializedName("cn_name")
@Expose
private String cnName;
@SerializedName("restaurant_id")
@Expose
private String restaurantId;
@SerializedName("picture")
@Expose
private String picture;
@SerializedName("thumb")
@Expose
private String thumb;
@SerializedName("status")
@Expose
private String status;
@SerializedName("online")
@Expose
private String online;
@SerializedName("type")
@Expose
private String type;
@SerializedName("cat_sort")
@Expose
private String catSort;
@SerializedName("description")
@Expose
private String description;
@SerializedName("cn_description")
@Expose
private String cnDescription;
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
@SerializedName("remote_cat_id")
@Expose
private String remoteCatId;

public String getCategoryId() {
return categoryId;
}

public void setCategoryId(String categoryId) {
this.categoryId = categoryId;
}

public String getCname() {
return cname;
}

public void setCname(String cname) {
this.cname = cname;
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

public String getPicture() {
return picture;
}

public void setPicture(String picture) {
this.picture = picture;
}

public String getThumb() {
return thumb;
}

public void setThumb(String thumb) {
this.thumb = thumb;
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

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getCatSort() {
return catSort;
}

public void setCatSort(String catSort) {
this.catSort = catSort;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getCnDescription() {
return cnDescription;
}

public void setCnDescription(String cnDescription) {
this.cnDescription = cnDescription;
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

public String getRemoteCatId() {
return remoteCatId;
}

public void setRemoteCatId(String remoteCatId) {
this.remoteCatId = remoteCatId;
}

}