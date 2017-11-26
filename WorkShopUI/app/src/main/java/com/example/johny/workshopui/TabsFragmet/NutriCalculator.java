package com.example.johny.workshopui.TabsFragmet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.johny.workshopui.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NutriCalculator extends Fragment {


    public NutriCalculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nutri_calculator, container, false);
    }

}
