package com.example.johny.workshopui.TabsFragmet;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.view.menu.MenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.johny.workshopui.Data.Food;
import com.example.johny.workshopui.Data.GetFood;
import com.example.johny.workshopui.Data.GetImage;
import com.example.johny.workshopui.R;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class Nutrition extends Fragment {


    public Nutrition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_nutrition, container, false);


        ListView listWithFood = (ListView) root.findViewById(R.id.lv_listFood);

        ArrayAdapter<Food> arrayAdapterFood = new ArrayFoodAdapter(root.getContext());

        GetFood getSomeFood = new GetFood();
        getSomeFood.getFood()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(food ->{
                    arrayAdapterFood.clear();
                    arrayAdapterFood.addAll(food);
                });



        listWithFood.setAdapter(arrayAdapterFood);
        return root;
    }


    public class ArrayFoodAdapter extends ArrayAdapter<Food>{

        private GetImage imageData;

        ArrayFoodAdapter(Context ctx){
            super(ctx,-1);
            this.imageData = new GetImage();
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view = convertView;
            if(view == null)
            {
                LayoutInflater inflater = LayoutInflater.from(this.getContext());
                view = inflater.inflate(R.layout.food_item,parent,false);
            }

            TextView tvNameText = (TextView)view.findViewById(R.id.tv_FoodName);
            ImageView image = (ImageView)view.findViewById(R.id.iv_snimka);

            tvNameText.setText(this.getItem(position).getName());

            imageData.getImage(this.getItem(position).getSnimkaURL())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(bitmap -> {
                image.setImageBitmap(bitmap);
            });

            return view;
        }

    }
}
