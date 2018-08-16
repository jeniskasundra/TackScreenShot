/*
package com.example.tops.tackscreenshot;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

*/
/**
 * Created by Tops on 11/24/2016.
 *//*

public class SpinnerAdapter extends ArrayAdapter<String> {
    private Activity activity;
    private String[] objects;
    private Holder holder;
    private final LayoutInflater inflater;

    */
/*************
     * CustomAdapter Constructor
     *****************//*

    public SpinnerAdapter(Activity activity, int textViewResourceId, String[] objects) {
        super(activity, textViewResourceId, objects);
        */
/********** Take passed values **********//*

        this.activity = activity;
        this.objects = objects;

        */
/***********  Layout inflator to call external xml layout () **********************//*

        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getDropdownView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    // This funtion called for each row ( Called data.size() times )
    public View getDropdownView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            holder = new Holder();
            */
/********** Inflate spinner_rows.xml file for each row ( Defined below ) ************//*

            convertView = inflater.inflate(R.layout.spinner_text, parent, false);
            holder.tvSpinnerItem = (TextView) convertView.findViewById(R.id.tvSpinnerBlack);
//            holder.tvSpinnerItem.setTypeface(TypeFaceConstant.getTypeface_FUTURA_MEDIUM_BT(activity));
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        holder.tvSpinnerItem.setText(objects[position].toString());

        return convertView;
    }

    // This funtion called for each row ( Called data.size() times )
    public View getCustomView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            holder = new Holder();
            */
/********** Inflate spinner_rows.xml file for each row ( Defined below ) ************//*

//            convertView = inflater.inflate(R.layout.row_item_spinner_new, parent, false);
            convertView = inflater.inflate(R.layout.row_item_spinner_new_text_black, parent, false);
            holder.tvSpinnerItem = (TextView) convertView.findViewById(R.id.tvSpinnerItem);
//            holder.tvSpinnerItem.setTypeface(TypeFaceConstant.getTypeface_FUTURA_MEDIUM_BT(activity));
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        holder.tvSpinnerItem.setText(objects[position]);


        return convertView;
    }

    private static class Holder {
        private TextView tvSpinnerItem;
    }
}
*/
