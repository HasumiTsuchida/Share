package com.example.admin.share;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

public class Tab_Setting_Adapter extends FragmentPagerAdapter {

    private CharSequence[] tabTitles = {"個人設定", "グループ設定", "その他設定"};

    public Tab_Setting_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Main1Fragment();
            case 1:
                return new Main2Fragment();
            case 2:
                return new Main3Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }
}
