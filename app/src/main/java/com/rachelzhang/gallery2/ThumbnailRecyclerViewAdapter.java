package com.rachelzhang.gallery2;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.rachelzhang.gallery2.ThumbnailRecyclerViewAdapter.ThumbnailViewHolder;

public class ThumbnailRecyclerViewAdapter extends RecyclerView.Adapter<ThumbnailViewHolder> {

  private int[] mImageResources = {R.drawable.air,R.drawable.mountainview,  R.drawable.desks, R.drawable.hive, R.drawable.logo,
      R.drawable.lounge, R.drawable.lounge2, R.drawable.racecar};

  @NonNull
  @Override
  public ThumbnailViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.thumbnail_item_view, viewGroup, false);
    return new ThumbnailViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ThumbnailViewHolder thumbnailViewHolder, int i) {
    ImageView image = thumbnailViewHolder.mImage;
    image.setImageResource(mImageResources[i]);
    Drawable drawable = image.getDrawable();
    if (drawable.getIntrinsicHeight() > drawable.getIntrinsicWidth()) {
      // Is landscape, maintain aspect ratio
      image.setAdjustViewBounds(true);
    }
    image.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        // transition to pager fragment
        //     .beginTransaction()
        //     // .addSharedElement(mImage, "transitionNameForDetailFragment")
        //     .replace(R.id.activity_main_fragment_container, new PagerFragment())
        //     .addToBackStack(null)
        //     .commit();
      }
    });
  }

  @Override
  public int getItemCount() {
    return mImageResources.length;
  }

  /**
   * View holder class.
   */
  public static class ThumbnailViewHolder extends RecyclerView.ViewHolder {

    public ImageView mImage;

    public ThumbnailViewHolder(@NonNull View itemView) {
      super(itemView);
      mImage = itemView.findViewById(R.id.thumbnail_item_view_image);
    }
  }
}
