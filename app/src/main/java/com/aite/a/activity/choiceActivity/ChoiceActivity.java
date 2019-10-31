package com.aite.a.activity.choiceActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.aite.a.activity.choiceActivity.adapter.ChoiceActivityViewPagerApdapter;
import com.aiteshangcheng.a.R;

public class ChoiceActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private View[] views;
    private ChoiceActivityViewPagerApdapter viewPagerAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice_type_activity);
        init();
    }

    private void init() {
        viewPager=findViewById(R.id.viewpager_id);
        initFragment();

    }
    private void initFragment() {
        tabLayout = findViewById(R.id.thingsfix_tabMode);
        views = new View[3];
        LayoutInflater layoutInflater = LayoutInflater.from(ChoiceActivity.this);
        views[0] = layoutInflater.inflate(R.layout.fragment_amclassify, null);
        views[1] = layoutInflater.inflate(R.layout.fragment_amclassbrand, null);
        views[2] = layoutInflater.inflate(R.layout.fragment_amclassshop, null);
        viewPagerAdapter = new ChoiceActivityViewPagerApdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 1) {
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}
