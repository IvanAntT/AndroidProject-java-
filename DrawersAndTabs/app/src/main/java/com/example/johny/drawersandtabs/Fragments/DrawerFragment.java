package com.example.johny.drawersandtabs.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.johny.drawersandtabs.R;
import com.example.johny.drawersandtabs.TabsNavigationActivity;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrawerFragment extends Fragment {


    public DrawerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_drawer, container, false);

        // Inflate the layout for this fragment
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        this.setupDrawer();
    }

    protected void setupDrawer(){

        Toolbar toolbar = (Toolbar) this.getView()
                .findViewById(R.id.toolbar_drawer);

        PrimaryDrawerItem item1 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName(R.string.home_text);

        SecondaryDrawerItem item2 = new SecondaryDrawerItem()
                .withIdentifier(2)
                .withName(R.string.tabs_text);


        Drawer result = new DrawerBuilder()
                .withActivity(this.getActivity())
                .withToolbar(toolbar)
                .addDrawerItems(
                        item1,
                        item2
                )
                .withOnDrawerItemClickListener((view, position, drawerItem) -> {
                    if(drawerItem.getIdentifier() == 2)
                    {
                        Intent intent = new Intent(this.getContext(), TabsNavigationActivity.class);
                        this.startActivity(intent);
                    }
                    return  true;
                })
                .build();
    }
}
