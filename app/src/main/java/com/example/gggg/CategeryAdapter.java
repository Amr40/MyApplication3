package com.example.gggg;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.gggg.R;

class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new com.example.gggg.HotelsFragment();
            case 1:
                return new com.example.gggg.ParksFragment();
            case 2:
                return new com.example.gggg.RestaurantFragment();
            case 3:
                return new com.example.gggg.ShoppingFragment();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_hotels);
            case 1:
                return mContext.getString(R.string.category_parks);
            case 2:
                return mContext.getString(R.string.category_restaurants);
            case 3:
                return mContext.getString(R.string.category_shopping);
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 4;
    }
}