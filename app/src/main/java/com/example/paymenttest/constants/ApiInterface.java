package com.example.paymenttest.constants;

public interface ApiInterface {
    String REST_ID = "30692730";
    String HOST_NAME ="https://ciboapp.com";  //lab server url
    String BASE_URL = HOST_NAME + "/admin/mobileApi/";

    String URL_GET_FOOD_SUB_CATEGORY_FOR_DISH = BASE_URL + "category/viewDishCategory/restId/";
    String URL_GET_FOOD_ITEM_BASED_ON_SUBCATEGORY = BASE_URL + "menu/viewDishesByCat/restId/";

    String URL_GET_DRINK_CATEGORY = BASE_URL + "menu/viewDrinksCat/restId/";
    String URL_GET_VIEW_DRINK_ITEM = BASE_URL + "menu/viewDrinksByCat/restId/";

    String URL_GET_PIZZA_ITEM_BASED_ON_SUBCATEGORY = BASE_URL + "menu/viewPizza/restId/";

    String URL_GET_ITEM_FORCE_MODIFIER = BASE_URL + "menu/viewFm/restId/";
    String URL_GET_ITEM_OPTION_MODIFIER = BASE_URL + "menu/viewOm/restId/";

//    https://ciboapp.com/admin/mobileApi/menu/viewFm/restId/30692730/fmCatId/11
//    restId = 30692730
}
