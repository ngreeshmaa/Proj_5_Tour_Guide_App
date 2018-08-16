package com.example.ins15.tour_guide_app;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

    public class CategoryAdapter extends FragmentPagerAdapter {
        private Context mContext;

        public CategoryAdapter(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;

        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new PlacesFragment();
            } else if (position == 1) {
                return new ReligiousPlaces();
            } else if (position == 2) {
                return new RestaurantsFragment();
            } else {
                return new ShoppingFragment();
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return mContext.getString(R.string.category_places);
            } else if (position == 1) {
                return mContext.getString(R.string.category_religious);
            } else if (position == 2) {
                return mContext.getString(R.string.category_restaurant);
            } else {
                return mContext.getString(R.string.category_shopping);
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

