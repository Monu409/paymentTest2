package com.example.paymenttest.modals.server;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DishInfo implements Serializable {

@SerializedName("product_id")
@Expose
private String productId;
@SerializedName("category_id")
@Expose
private String categoryId;
@SerializedName("restaurant_id")
@Expose
private String restaurantId;
@SerializedName("date")
@Expose
private String date;
@SerializedName("status")
@Expose
private String status;
@SerializedName("pname")
@Expose
private String pname;
@SerializedName("description")
@Expose
private String description;
@SerializedName("cn_pname")
@Expose
private String cnPname;
@SerializedName("cn_description")
@Expose
private String cnDescription;
@SerializedName("picture")
@Expose
private String picture;
@SerializedName("thumb")
@Expose
private String thumb;
@SerializedName("type")
@Expose
private String type;
@SerializedName("price")
@Expose
private String price;
@SerializedName("optional_modifer_id")
@Expose
private String optionalModiferId;
@SerializedName("add_om_id")
@Expose
private String addOmId;
@SerializedName("rem_om_id")
@Expose
private String remOmId;
@SerializedName("forced_modifer_id")
@Expose
private String forcedModiferId;
@SerializedName("forced_modifier_id2")
@Expose
private String forcedModifierId2;
@SerializedName("drink_cat_id")
@Expose
private String drinkCatId;
@SerializedName("drink_id")
@Expose
private String drinkId;
@SerializedName("is_vegan")
@Expose
private String isVegan;
@SerializedName("is_hot")
@Expose
private String isHot;
@SerializedName("is_reduced")
@Expose
private String isReduced;
@SerializedName("gluten_free")
@Expose
private String glutenFree;
@SerializedName("lactose_free")
@Expose
private String lactoseFree;
@SerializedName("nuts_free")
@Expose
private String nutsFree;
@SerializedName("sort_order")
@Expose
private String sortOrder;
@SerializedName("printer_id")
@Expose
private String printerId;
@SerializedName("printer_type")
@Expose
private String printerType;
@SerializedName("printer_id2")
@Expose
private String printerId2;
@SerializedName("printer_type2")
@Expose
private String printerType2;
@SerializedName("points")
@Expose
private String points;
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
@SerializedName("rts_flag")
@Expose
private String rtsFlag;
@SerializedName("scaling_qty")
@Expose
private String scalingQty;
@SerializedName("unit_id")
@Expose
private String unitId;
@SerializedName("happy_hours_id")
@Expose
private String happyHoursId;
@SerializedName("barcode")
@Expose
private String barcode;
@SerializedName("preparation_time")
@Expose
private String preparationTime;
@SerializedName("min_qty")
@Expose
private String minQty;
@SerializedName("date_modified")
@Expose
private String dateModified;
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
@SerializedName("expiry_time")
@Expose
private String expiryTime;
@SerializedName("expiry_type")
@Expose
private String expiryType;
@SerializedName("remote_product_id")
@Expose
private String remoteProductId;
@SerializedName("inshop_ordering")
@Expose
private String inshopOrdering;
@SerializedName("detour_ids")
@Expose
private String detourIds;
@SerializedName("open_dish")
@Expose
private String openDish;
@SerializedName("is_deal")
@Expose
private String isDeal;

public String getProductId() {
return productId;
}

public void setProductId(String productId) {
this.productId = productId;
}

public String getCategoryId() {
return categoryId;
}

public void setCategoryId(String categoryId) {
this.categoryId = categoryId;
}

public String getRestaurantId() {
return restaurantId;
}

public void setRestaurantId(String restaurantId) {
this.restaurantId = restaurantId;
}

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getPname() {
return pname;
}

public void setPname(String pname) {
this.pname = pname;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getCnPname() {
return cnPname;
}

public void setCnPname(String cnPname) {
this.cnPname = cnPname;
}

public String getCnDescription() {
return cnDescription;
}

public void setCnDescription(String cnDescription) {
this.cnDescription = cnDescription;
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

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getPrice() {
return price;
}

public void setPrice(String price) {
this.price = price;
}

public String getOptionalModiferId() {
return optionalModiferId;
}

public void setOptionalModiferId(String optionalModiferId) {
this.optionalModiferId = optionalModiferId;
}

public String getAddOmId() {
return addOmId;
}

public void setAddOmId(String addOmId) {
this.addOmId = addOmId;
}

public String getRemOmId() {
return remOmId;
}

public void setRemOmId(String remOmId) {
this.remOmId = remOmId;
}

public String getForcedModiferId() {
return forcedModiferId;
}

public void setForcedModiferId(String forcedModiferId) {
this.forcedModiferId = forcedModiferId;
}

public String getForcedModifierId2() {
return forcedModifierId2;
}

public void setForcedModifierId2(String forcedModifierId2) {
this.forcedModifierId2 = forcedModifierId2;
}

public String getDrinkCatId() {
return drinkCatId;
}

public void setDrinkCatId(String drinkCatId) {
this.drinkCatId = drinkCatId;
}

public String getDrinkId() {
return drinkId;
}

public void setDrinkId(String drinkId) {
this.drinkId = drinkId;
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

public String getGlutenFree() {
return glutenFree;
}

public void setGlutenFree(String glutenFree) {
this.glutenFree = glutenFree;
}

public String getLactoseFree() {
return lactoseFree;
}

public void setLactoseFree(String lactoseFree) {
this.lactoseFree = lactoseFree;
}

public String getNutsFree() {
return nutsFree;
}

public void setNutsFree(String nutsFree) {
this.nutsFree = nutsFree;
}

public String getSortOrder() {
return sortOrder;
}

public void setSortOrder(String sortOrder) {
this.sortOrder = sortOrder;
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

public String getPrinterId2() {
return printerId2;
}

public void setPrinterId2(String printerId2) {
this.printerId2 = printerId2;
}

public String getPrinterType2() {
return printerType2;
}

public void setPrinterType2(String printerType2) {
this.printerType2 = printerType2;
}

public String getPoints() {
return points;
}

public void setPoints(String points) {
this.points = points;
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

public String getRtsFlag() {
return rtsFlag;
}

public void setRtsFlag(String rtsFlag) {
this.rtsFlag = rtsFlag;
}

public String getScalingQty() {
return scalingQty;
}

public void setScalingQty(String scalingQty) {
this.scalingQty = scalingQty;
}

public String getUnitId() {
return unitId;
}

public void setUnitId(String unitId) {
this.unitId = unitId;
}

public String getHappyHoursId() {
return happyHoursId;
}

public void setHappyHoursId(String happyHoursId) {
this.happyHoursId = happyHoursId;
}

public String getBarcode() {
return barcode;
}

public void setBarcode(String barcode) {
this.barcode = barcode;
}

public String getPreparationTime() {
return preparationTime;
}

public void setPreparationTime(String preparationTime) {
this.preparationTime = preparationTime;
}

public String getMinQty() {
return minQty;
}

public void setMinQty(String minQty) {
this.minQty = minQty;
}

public String getDateModified() {
return dateModified;
}

public void setDateModified(String dateModified) {
this.dateModified = dateModified;
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

public String getExpiryTime() {
return expiryTime;
}

public void setExpiryTime(String expiryTime) {
this.expiryTime = expiryTime;
}

public String getExpiryType() {
return expiryType;
}

public void setExpiryType(String expiryType) {
this.expiryType = expiryType;
}

public String getRemoteProductId() {
return remoteProductId;
}

public void setRemoteProductId(String remoteProductId) {
this.remoteProductId = remoteProductId;
}

public String getInshopOrdering() {
return inshopOrdering;
}

public void setInshopOrdering(String inshopOrdering) {
this.inshopOrdering = inshopOrdering;
}

public String getDetourIds() {
return detourIds;
}

public void setDetourIds(String detourIds) {
this.detourIds = detourIds;
}

public String getOpenDish() {
return openDish;
}

public void setOpenDish(String openDish) {
this.openDish = openDish;
}

public String getIsDeal() {
return isDeal;
}

public void setIsDeal(String isDeal) {
this.isDeal = isDeal;
}

}