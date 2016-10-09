package com.example.mt_2016.tab_layout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ViewPager page=(ViewPager)findViewById(R.id.page1);

     Simple_fregment viwT= new Simple_fregment(getSupportFragmentManager());

page.setAdapter(viwT);

    TabLayout tab=(TabLayout)findViewById(R.id.tab1);
    tab.setupWithViewPager(page);



    }
}
