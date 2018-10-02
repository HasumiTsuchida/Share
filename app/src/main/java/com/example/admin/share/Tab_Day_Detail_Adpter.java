package com.example.admin.share;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Tab_Day_Detail_Adpter extends FragmentPagerAdapter {

    private CharSequence[] tabTitles = {"朝","昼","晩"};

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    public Tab_Day_Detail_Adpter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab_Day_Detail_Fragment1();
            case 1:
                return new Tab_Day_Detail_Fragment2();
            case 2:
                return new Tab_Day_Detail_Fragment3();
            default:
                return null;
        }
    }

}
