package com.rachelzhang.gallery2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

  public PagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override
  public Fragment getItem(int i) {
    return new DetailViewFragment();
  }

  @Override
  public int getCount() {
    return 1;
  }
}
