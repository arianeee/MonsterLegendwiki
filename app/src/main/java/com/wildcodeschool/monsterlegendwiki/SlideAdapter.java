package com.wildcodeschool.monsterlegendwiki;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    //list of images
    public int[] lst_images = {
            R.drawable.lionnv1,
            R.drawable.lionniv2,
            R.drawable.lionnv3,
    };
    /*
    // list of titles
    public String[] lst_titles = {
            "Fire Lion 1",
            "Fire Lion 2",
            "Fire Lion 3",
    };
    */

    // list of descriptions
    /*
    public String[] lst_descriptions = {
            "Possessing a mane of white-hot hell fire and more than just a sting in his tail – the Fire Lion is a creature of mythic awesomeness! The Fire Lion will make fast work of anyone foolish enough to challenge him.",
            "Possessing a mane of white-hot hell fire and more than just a sting in his tail – the Fire Lion is a creature of mythic awesomeness! The Fire Lion will make fast work of anyone foolish enough to challenge him.",
            "Possessing a mane of white-hot hell fire and more than just a sting in his tail – the Fire Lion is a creature of mythic awesomeness! The Fire Lion will make fast work of anyone foolish enough to challenge him.",
    };
    */

    // list of background color
    /*
    public int[] lst_backgroundColor = {
            Color.rgb(125,55,55),
            Color.rgb(125,55,55),
            Color.rgb(125,55,55),
    };
    */

    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==object);
    }            //extends = sous classe de Page


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slideLinearLayout);
        ImageView imgslide = view.findViewById(R.id.slideing);
        /*
        TextView txttitle = view.findViewById(R.id.txttitle);
        TextView description = view.findViewById(R.id.textDescription);
        layoutslide.setBackgroundColor(lst_backgroundColor[position]);*/ //du int position du dessus
        imgslide.setImageResource(lst_images[position]);
        /*
        txttitle.setText(lst_titles[position]);
        description.setText(lst_descriptions[position]); */
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
