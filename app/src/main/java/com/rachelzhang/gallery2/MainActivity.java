package com.rachelzhang.gallery2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {


  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    getSupportFragmentManager().beginTransaction().add(R.id.activity_main_fragment_container, new GridViewFragment()).commit();
  }
}