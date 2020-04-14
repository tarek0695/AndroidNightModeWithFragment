package com.pixelhubllc.bottomnavigationwithfragment;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    SharedPreferences mSharedPref;

    public SharedPref(Context context){
        mSharedPref = context.getSharedPreferences("filename",Context.MODE_PRIVATE);
    }

    //this method will save night mode state , true or false
    public void setNightModeState(Boolean state){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean("NightMode", state);
        editor.commit();
    }

    //this method will load the night mode state
    public boolean loadNightModeState(){
        Boolean state = mSharedPref.getBoolean("NightMode", false);
        return state;
    }

    //this method wiil save setting fragment state
    public void setSettingFragment(Boolean state){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean("SettingFragment", state);
        editor.commit();
    }

    //this method will load the setting fragment state
    public boolean loadSettingFragment(){
        Boolean state = mSharedPref.getBoolean("SettingFragment", false);
        return state;
    }

}
