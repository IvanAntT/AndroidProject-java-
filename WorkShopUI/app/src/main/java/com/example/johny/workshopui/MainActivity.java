package com.example.johny.workshopui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;
import com.example.johny.workshopui.TabsFragmet.Favorite;
import com.example.johny.workshopui.TabsFragmet.NutriCalculator;
import com.example.johny.workshopui.TabsFragmet.Nutrition;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager)findViewById(R.id.tabs_pager);
        pager.setAdapter(new TabsNavigationAdapter(getSupportFragmentManager()));

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip)findViewById(R.id.tabs);
        tabs.setViewPager(pager);
    }

    public class TabsNavigationAdapter extends FragmentStatePagerAdapter {

        public  TabsNavigationAdapter(FragmentManager fm){super(fm);}

        @Override
        public Fragment getItem(int position) {
            Fragment chosenFragment;
            switch (position)
            {
                case 0: chosenFragment = new Nutrition();
                    break;
                case 1: chosenFragment = new Favorite();
                    break;
                case 2: chosenFragment = new NutriCalculator();
                    break;
                default: chosenFragment = new Nutrition();
                    break;
            }

            return chosenFragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title = "";

            switch (position)
            {
                case 0: title = "Nutrition";
                    break;
                case 1: title = "Favorite";
                    break;
                case 2: title = "Nutrition Calculator";
                    break;
            }

            return title;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
