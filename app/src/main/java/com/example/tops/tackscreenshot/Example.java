
package com.example.tops.tackscreenshot;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("pro")
    @Expose
    private ArrayList<Pro> pro = null;

    public ArrayList<Pro> getPro() {
        return pro;
    }

    public void setPro(ArrayList<Pro> pro) {
        this.pro = pro;
    }

}
