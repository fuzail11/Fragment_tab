package com.example.mt_2016.tab_layout;

import android.support.design.widget.TabItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

/**
 * Created by MT-2016 on 09-Oct-16.
 */
public class Simple_fregment extends FragmentPagerAdapter {
    public Simple_fregment(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:


                return new Fragment1();
            case 1:
            return new Fragment2();




        }return null;
    }
    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:

                return "title";



            case 1:


                return "name";

        default:
            return "";

        }





    }
}
