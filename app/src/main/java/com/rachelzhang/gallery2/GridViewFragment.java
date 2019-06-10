package com.rachelzhang.gallery2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;


public class GridViewFragment extends Fragment {

  private RecyclerView mRecyclerView;
  private ThumbnailRecyclerViewAdapter mRecyclerViewAdapter;


  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.grid_view_fragment, container, false);
    mRecyclerView = view.findViewById(R.id.grid_view_fragment_recycler_view);
    return view;
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
    mRecyclerViewAdapter = new ThumbnailRecyclerViewAdapter();
    mRecyclerView.setAdapter(mRecyclerViewAdapter);
  }
}
