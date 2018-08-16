package com.example.tops.tackscreenshot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Example example;
    private ArrayList<Pro> mListData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mListData=new ArrayList<>();

        Log.d("data",""+getJsonString());
        example= new Gson().fromJson(getJsonString(), Example.class);
        if (example != null) {
            if (example.getPro().size() > 0) {
                mListData=example.getPro();
            }
        }

        for(int i=0;i<mListData.size();i++)
        {
            Log.d("listData",mListData.get(i).getName());
        }

    }


    private String getJsonString() {
        InputStream is = getResources().openRawResource(R.raw.abc);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];

        Reader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }
}
