package com.example.mohamedabdelaziz.task7;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.mohamedabdelaziz.task7.Fragment.AskFragment;
import com.example.mohamedabdelaziz.task7.Fragment.LiveFragment;
import com.example.mohamedabdelaziz.task7.Fragment.ProfileFragment;
import com.example.mohamedabdelaziz.task7.Fragment.SearchFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ArrayList<Integer> nonselectedtabs = new ArrayList<>();
    ArrayList<Integer> selectedtabs = new ArrayList<>();
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nonselectedtabs.add(R.drawable.ic_search_bar);
        nonselectedtabs.add(R.drawable.ic_live_bar);
        nonselectedtabs.add(R.drawable.ic_ask_bar);
        nonselectedtabs.add(R.drawable.ic_profile_bar);
        selectedtabs.add(R.drawable.ic_search_bar_select);
        selectedtabs.add(R.drawable.ic_live_bar_select);
        selectedtabs.add(R.drawable.ic_ask_bar_select);
        selectedtabs.add(R.drawable.ic_profile_bar_select);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.getTabAt(0).setIcon(selectedtabs.get(0));
        for (int i = 1; i < nonselectedtabs.size(); i++) {
            tabLayout.getTabAt(i).setIcon(nonselectedtabs.get(i));
        }
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.setIcon(selectedtabs.get(tab.getPosition()));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                tab.setIcon(nonselectedtabs.get(tab.getPosition()));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0)
                return new SearchFragment();
            else if (position == 1)
                return new LiveFragment();
            else if (position == 2)
                return new AskFragment();
            else if (position == 3)
                return new ProfileFragment();
            return null;
        }


        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Search";
                case 1:
                    return "Live";
                case 2:
                    return "Ask";
                case 3:
                    return "Profile";
            }
            return null;
        }
    }
}
