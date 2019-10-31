package com.aite.a.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentAdapter extends FragmentPagerAdapter {

	private List<Fragment> listF = null;

	public MyFragmentAdapter(FragmentManager fm,List<Fragment> listF) {
		super(fm);
		this.listF=listF;
	}

	@Override
	public Fragment getItem(int position) {
		return listF.get(position);
		
	}

	@Override
	public int getCount() {
		return listF.size();
		
	}

}
