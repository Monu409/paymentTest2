package com.example.paymenttest.constants;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;

import com.example.paymenttest.modals.server.local.ItemsChoose;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.paymenttest.constants.ConstantVariables.OBJECT_TAG;
import static com.example.paymenttest.constants.ConstantVariables.PREFS_TAG;

public class ConstantMethods {
    private static ProgressDialog progressDialog;
    public static List<Object> getListFormJson(String jsonOutput){
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Object>>(){}.getType();
        List<Object> listData = gson.fromJson(jsonOutput, listType);
        return listData;
    }
    public static void setFragment(AppCompatActivity compatActivity, Fragment fragment, int layout) {
        FragmentManager fragmentManager = compatActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(layout, fragment);
        fragmentTransaction.commit();
    }

    public static void showDialog(Context context){
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
    }

    public static void hideDialog(){
        progressDialog.dismiss();
    }

    public static void setStringPreference(String key, String value, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getStringPreference(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(key, "");
    }

//    public static void saveListObjectPref(String key, Object object, Context context){
//        Gson gson = new Gson();
//        String json = gson.toJson(object);
//        setStringPreference(key,json,context);
//    }
//
//    public static List<Object> getListObjectPref(String key, Context context){
//        List<Object> objects = new ArrayList<>();
//        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
//        String jsonObj = preferences.getString(key, "");
//    }

//    public static void setListObjSharedPreferences(Context context, Object object){
//        Gson gson = new Gson();
//        String jsonCurProduct = gson.toJson(object);
//        SharedPreferences sharedPref = context.getApplicationContext().getSharedPreferences(PREFS_TAG, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putString(OBJECT_TAG, jsonCurProduct);
//        editor.commit();
//    }
//
//    public static List<Object> getListObjSharedPreferences(Context context){
//        Gson gson = new Gson();
//        List<Object> productFromShared;
//        SharedPreferences sharedPref = context.getApplicationContext().getSharedPreferences(PREFS_TAG, Context.MODE_PRIVATE);
//        String jsonPreferences = sharedPref.getString(OBJECT_TAG, "");
//        Type type = new TypeToken<List<Object>>() {}.getType();
//        productFromShared = gson.fromJson(jsonPreferences, type);
//        return productFromShared;
//    }

//    public void storeFavorites(Context context, List favorites) {
//        // used for store arrayList in json format
//        SharedPreferences settings;
//        SharedPreferences.Editor editor;
//        settings = context.getSharedPreferences(PREFS_NAME,Context.MODE_PRIVATE);
//        editor = settings.edit();
//        Gson gson = new Gson();
//        String jsonFavorites = gson.toJson(favorites);
//        editor.putString(FAVORITES, jsonFavorites);
//        editor.commit();
//    }
//
//
//    public ArrayList loadFavorites(Context context) {
//        // used for retrieving arraylist from json formatted string
//        SharedPreferences settings;
//        List favorites;
//        settings = context.getSharedPreferences(PREFS_NAME,Context.MODE_PRIVATE);
//        if (settings.contains(FAVORITES)) {
//            String jsonFavorites = settings.getString(FAVORITES, null);
//            Gson gson = new Gson();
//            BeanSampleList[] favoriteItems = gson.fromJson(jsonFavorites,BeanSampleList[].class);
//            favorites = Arrays.asList(favoriteItems);
//            favorites = new ArrayList(favorites);
//        } else
//            return null;
//        return (ArrayList) favorites;
//    }

    public static void saveUsers(Context context, List<ItemsChoose> users) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_TAG, Context.MODE_PRIVATE);
        editor = settings.edit();
        Gson gson = new Gson();
        String jsonUsers = gson.toJson(users);
        editor.putString(OBJECT_TAG, jsonUsers);
        editor.commit();
    }

    public static List<ItemsChoose> getUsers(Context context) {
        SharedPreferences settings;
        List<ItemsChoose> users;

        settings = context.getSharedPreferences(PREFS_TAG,
                Context.MODE_PRIVATE);

        if (settings.contains(OBJECT_TAG)) {
            String jsonUsers = settings.getString(OBJECT_TAG, null);
            Gson gson = new Gson();
            ItemsChoose[] userItems = gson.fromJson(jsonUsers,
                    ItemsChoose[].class);

            users = Arrays.asList(userItems);
            users= new ArrayList<ItemsChoose>(users);
        } else
            return null;

        return (ArrayList<ItemsChoose>) users;
    }


}
