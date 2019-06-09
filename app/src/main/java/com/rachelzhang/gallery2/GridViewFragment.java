package com.rachelzhang.gallery2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;


public class GridViewFragment extends Fragment {

  // Just one image for now, but should really have a recyclerview with grid layout param
  private View mImage;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.grid_view_fragment, container, false);

    mImage = view.findViewById(R.id.grid_view_fragment_image);
    mImage.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        // transition to pager fragment
        getFragmentManager()
            .beginTransaction()
            // .addSharedElement(mImage, "transitionNameForDetailFragment")
            .replace(R.id.activity_main_fragment_container, new PagerFragment())
            .addToBackStack(null)
            .commit();
      }
    });
    return view;
  }
}
