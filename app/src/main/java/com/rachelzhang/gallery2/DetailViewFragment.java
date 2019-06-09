package com.rachelzhang.gallery2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * The fragment that lives inside view pager, each fragment represent a page.
 */
public class DetailViewFragment extends Fragment {

  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.detail_view_fragment, container, false);
    return view;
  }
}
