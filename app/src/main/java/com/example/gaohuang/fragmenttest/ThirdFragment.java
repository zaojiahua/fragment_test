package com.example.gaohuang.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gaohuang on 2016/8/8.
 */
public class ThirdFragment extends Fragment{
    public View onCreateView(LayoutInflater flater, ViewGroup group, Bundle bundle){
        super.onCreateView(flater, group, bundle);
        View view = flater.inflate(R.layout.another_fragment, group, false);

        return view;
    }
}
