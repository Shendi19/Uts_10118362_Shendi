package com.example.uts_10118362_shendi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

/* Tanggal pengerjaan : Jumat 4 Juni 2021
        NIM : 10118362
        NAMA : Shendi Rakhma Diansyah
        Kelas : IF-9*/

public class SlidePagerAdapter extends PagerAdapter {
    private Context context;
    private int[]images = new int[]{R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
    SlidePagerAdapter(Context c){
        context = c;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(images[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}

