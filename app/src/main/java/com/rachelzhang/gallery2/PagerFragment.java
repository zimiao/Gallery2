package com.rachelzhang.gallery2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * The fragment that contains nothing but a view pager, the root fragment for detail view.
 */
public class PagerFragment extends Fragment {

  private ViewPager mPager;
  private PagerAdapter mAdapter;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    ViewGroup view = (ViewGroup) inflater.inflate(
        R.layout.pager_fragment, container, false);
    mPager = view.findViewById(R.id.pager_fragment_pager);
    return view;
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    // Note that this pager is inside another fragment, so you need to call child fm, instead of fm!
    mAdapter = new PagerAdapter(getChildFragmentManager());
    mPager.setAdapter(mAdapter);
  }
}
