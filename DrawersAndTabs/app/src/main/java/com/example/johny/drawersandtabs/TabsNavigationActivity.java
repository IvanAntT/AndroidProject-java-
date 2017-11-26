package com.example.johny.drawersandtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;
import com.example.johny.drawersandtabs.Tabs.Calculation;
import com.example.johny.drawersandtabs.Tabs.Nutrition;

public class TabsNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_navigation);

        // Initialize the ViewPager and set an adapter
        ViewPager pager = (ViewPager) findViewById(R.id.tabs_pager);
        pager.setAdapter(new TabsNavigationAdapter(getSupportFragmentManager()));

        // Bind the tabs to the ViewPager
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        tabs.setViewPager(pager);
    }

    public class TabsNavigationAdapter extends FragmentStatePagerAdapter
    {

        public TabsNavigationAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment chosenFragment;

            switch (position)
            {
                case 0: chosenFragment =  new Nutrition();
                break;
                case 1: chosenFragment = new Calculation();
                break;
                default: chosenFragment =  new Nutrition();
                break;
            }

            return  chosenFragment;

        }

        @Override
        public CharSequence getPageTitle(int position) {

            String title;

            switch (position)
            {
                case 0: title = "Nutrition";
                    break;
                case 1: title = "Calculation";
                    break;
                default: title = "Calculation";
                    break;
            }

            return title;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
