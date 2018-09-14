package com.wildcodeschool.monsterlegendwiki;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class CustomPagerAdapter extends PagerAdapter {
    private  Context mContext;

    int[]tab={
            R.drawable.light2, R.drawable.light, R.drawable.light0,R.drawable.light3

    };


    public CustomPagerAdapter(android.content.Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        Drawable img = ContextCompat.getDrawable(mContext, tab[position]);


        //CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.activity_fiche_monstre_principale, null, false);
        collection.addView(layout);
        ImageView imgv= layout.findViewById(R.id.IVa);
        imgv.setImageDrawable(img);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        // return CustomPagerEnum.values().length;
        return tab.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
        //return mContext.getString(customPagerEnum.getTitleResId());
        return null;
    }


    

}
