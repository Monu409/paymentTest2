package com.example.paymenttest.modals.server;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PizzaInfo {

@SerializedName("pizza_id")
@Expose
private String pizzaId;
@SerializedName("restaurant_id")
@Expose
private String restaurantId;
@SerializedName("category_id")
@Expose
private String categoryId;
@SerializedName("pizza_base_id")
@Expose
private String pizzaBaseId;
@SerializedName("happy_hours_id")
@Expose
private String happyHoursId;
@SerializedName("title")
@Expose
private String title;
@SerializedName("description")
@Expose
private String description;
@SerializedName("cn_name")
@Expose
private String cnName;
@SerializedName("cn_description")
@Expose
private String cnDescription;
@SerializedName("active")
@Expose
private String active;
@SerializedName("picture")
@Expose
private String picture;
@SerializedName("thumb")
@Expose
private String thumb;
@SerializedName("is_vegan")
@Expose
private String isVegan;
@SerializedName("is_hot")
@Expose
private String isHot;
@SerializedName("is_reduced")
@Expose
private String isReduced;
@SerializedName("free_toppings")
@Expose
private String freeToppings;
@SerializedName("pizza_sort")
@Expose
private String pizzaSort;
@SerializedName("status")
@Expose
private String status;
@SerializedName("printer_id")
@Expose
private String printerId;
@SerializedName("printer_type")
@Expose
private String printerType;
@SerializedName("organic_content")
@Expose
private String organicContent;
@SerializedName("online")
@Expose
private String online;
@SerializedName("is_vat")
@Expose
private String isVat;
@SerializedName("is_servicetax")
@Expose
private String isServicetax;
@SerializedName("is_localtax")
@Expose
private String isLocaltax;
@SerializedName("is_othertax")
@Expose
private String isOthertax;
@SerializedName("points")
@Expose
private String points;
@SerializedName("min_qty")
@Expose
private String minQty;
@SerializedName("print_products_flag")
@Expose
private String printProductsFlag;
@SerializedName("print_sequence")
@Expose
private String printSequence;
@SerializedName("is_stamp")
@Expose
private String isStamp;
@SerializedName("stamp_count")
@Expose
private String stampCount;
@SerializedName("inshop_ordering")
@Expose
private String inshopOrdering;

public String getPizzaId() {
return pizzaId;
}

public void setPizzaId(String pizzaId) {
this.pizzaId = pizzaId;
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

public String getPizzaBaseId() {
return pizzaBaseId;
}

public void setPizzaBaseId(String pizzaBaseId) {
this.pizzaBaseId = pizzaBaseId;
}

public String getHappyHoursId() {
return happyHoursId;
}

public void setHappyHoursId(String happyHoursId) {
this.happyHoursId = happyHoursId;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getCnName() {
return cnName;
}

public void setCnName(String cnName) {
this.cnName = cnName;
}

public String getCnDescription() {
return cnDescription;
}

public void setCnDescription(String cnDescription) {
this.cnDescription = cnDescription;
}

public String getActive() {
return active;
}

public void setActive(String active) {
this.active = active;
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

public String getIsVegan() {
return isVegan;
}

public void setIsVegan(String isVegan) {
this.isVegan = isVegan;
}

public String getIsHot() {
return isHot;
}

public void setIsHot(String isHot) {
this.isHot = isHot;
}

public String getIsReduced() {
return isReduced;
}

public void setIsReduced(String isReduced) {
this.isReduced = isReduced;
}

public String getFreeToppings() {
return freeToppings;
}

public void setFreeToppings(String freeToppings) {
this.freeToppings = freeToppings;
}

public String getPizzaSort() {
return pizzaSort;
}

public void setPizzaSort(String pizzaSort) {
this.pizzaSort = pizzaSort;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
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

public String getOrganicContent() {
return organicContent;
}

public void setOrganicContent(String organicContent) {
this.organicContent = organicContent;
}

public String getOnline() {
return online;
}

public void setOnline(String online) {
this.online = online;
}

public String getIsVat() {
return isVat;
}

public void setIsVat(String isVat) {
this.isVat = isVat;
}

public String getIsServicetax() {
return isServicetax;
}

public void setIsServicetax(String isServicetax) {
this.isServicetax = isServicetax;
}

public String getIsLocaltax() {
return isLocaltax;
}

public void setIsLocaltax(String isLocaltax) {
this.isLocaltax = isLocaltax;
}

public String getIsOthertax() {
return isOthertax;
}

public void setIsOthertax(String isOthertax) {
this.isOthertax = isOthertax;
}

public String getPoints() {
return points;
}

public void setPoints(String points) {
this.points = points;
}

public String getMinQty() {
return minQty;
}

public void setMinQty(String minQty) {
this.minQty = minQty;
}

public String getPrintProductsFlag() {
return printProductsFlag;
}

public void setPrintProductsFlag(String printProductsFlag) {
this.printProductsFlag = printProductsFlag;
}

public String getPrintSequence() {
return printSequence;
}

public void setPrintSequence(String printSequence) {
this.printSequence = printSequence;
}

public String getIsStamp() {
return isStamp;
}

public void setIsStamp(String isStamp) {
this.isStamp = isStamp;
}

public String getStampCount() {
return stampCount;
}

public void setStampCount(String stampCount) {
this.stampCount = stampCount;
}

public String getInshopOrdering() {
return inshopOrdering;
}

public void setInshopOrdering(String inshopOrdering) {
this.inshopOrdering = inshopOrdering;
}

}