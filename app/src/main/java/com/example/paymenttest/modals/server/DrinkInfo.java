package com.example.paymenttest.modals.server;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrinkInfo {

@SerializedName("drink_id")
@Expose
private String drinkId;
@SerializedName("drink_name")
@Expose
private String drinkName;
@SerializedName("drink_cat_id")
@Expose
private String drinkCatId;
@SerializedName("restaurant_id")
@Expose
private String restaurantId;
@SerializedName("drink_status")
@Expose
private String drinkStatus;
@SerializedName("drink_image")
@Expose
private String drinkImage;
@SerializedName("drink_description")
@Expose
private String drinkDescription;
@SerializedName("drink_price")
@Expose
private String drinkPrice;
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
@SerializedName("category_id")
@Expose
private String categoryId;
@SerializedName("tasting_notes")
@Expose
private String tastingNotes;
@SerializedName("cn_name")
@Expose
private String cnName;
@SerializedName("cn_description")
@Expose
private String cnDescription;
@SerializedName("cn_tasting")
@Expose
private String cnTasting;
@SerializedName("rating")
@Expose
private String rating;
@SerializedName("drink_sort")
@Expose
private String drinkSort;
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
@SerializedName("min_qty")
@Expose
private String minQty;
@SerializedName("print_products_flag")
@Expose
private String printProductsFlag;
@SerializedName("print_sequence")
@Expose
private String printSequence;
@SerializedName("stamp_count")
@Expose
private String stampCount;
@SerializedName("is_stamp")
@Expose
private String isStamp;
@SerializedName("inshop_ordering")
@Expose
private String inshopOrdering;
@SerializedName("detour_ids")
@Expose
private String detourIds;
@SerializedName("open_dish")
@Expose
private String openDish;

public String getDrinkId() {
return drinkId;
}

public void setDrinkId(String drinkId) {
this.drinkId = drinkId;
}

public String getDrinkName() {
return drinkName;
}

public void setDrinkName(String drinkName) {
this.drinkName = drinkName;
}

public String getDrinkCatId() {
return drinkCatId;
}

public void setDrinkCatId(String drinkCatId) {
this.drinkCatId = drinkCatId;
}

public String getRestaurantId() {
return restaurantId;
}

public void setRestaurantId(String restaurantId) {
this.restaurantId = restaurantId;
}

public String getDrinkStatus() {
return drinkStatus;
}

public void setDrinkStatus(String drinkStatus) {
this.drinkStatus = drinkStatus;
}

public String getDrinkImage() {
return drinkImage;
}

public void setDrinkImage(String drinkImage) {
this.drinkImage = drinkImage;
}

public String getDrinkDescription() {
return drinkDescription;
}

public void setDrinkDescription(String drinkDescription) {
this.drinkDescription = drinkDescription;
}

public String getDrinkPrice() {
return drinkPrice;
}

public void setDrinkPrice(String drinkPrice) {
this.drinkPrice = drinkPrice;
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

public String getCategoryId() {
return categoryId;
}

public void setCategoryId(String categoryId) {
this.categoryId = categoryId;
}

public String getTastingNotes() {
return tastingNotes;
}

public void setTastingNotes(String tastingNotes) {
this.tastingNotes = tastingNotes;
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

public String getCnTasting() {
return cnTasting;
}

public void setCnTasting(String cnTasting) {
this.cnTasting = cnTasting;
}

public String getRating() {
return rating;
}

public void setRating(String rating) {
this.rating = rating;
}

public String getDrinkSort() {
return drinkSort;
}

public void setDrinkSort(String drinkSort) {
this.drinkSort = drinkSort;
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

public String getStampCount() {
return stampCount;
}

public void setStampCount(String stampCount) {
this.stampCount = stampCount;
}

public String getIsStamp() {
return isStamp;
}

public void setIsStamp(String isStamp) {
this.isStamp = isStamp;
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

}