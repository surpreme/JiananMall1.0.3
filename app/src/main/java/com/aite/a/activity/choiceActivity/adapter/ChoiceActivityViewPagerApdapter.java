package com.aite.a.activity.choiceActivity.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.aite.a.activity.choiceActivity.fragment.AmClassBrandFragment;
import com.aite.a.activity.choiceActivity.fragment.AmClassShopFragment;
import com.aite.a.activity.choiceActivity.fragment.AmClassifyFragment;

public class ChoiceActivityViewPagerApdapter extends FragmentPagerAdapter {
    private int num;
     AmClassifyFragment amClassifyFragment;
     AmClassBrandFragment amClassBrandFragment;
     AmClassShopFragment amClassShopFragment;


    public ChoiceActivityViewPagerApdapter(FragmentManager fm, int num) {
        super(fm);
        this.num = num;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                if (amClassifyFragment == null) {
                    return new AmClassifyFragment();
                }
            case 1:
                if (amClassBrandFragment == null) {
                    return new AmClassBrandFragment();
                }
            case 2:
                if (amClassShopFragment == null) {
                    return new AmClassShopFragment();
                }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
