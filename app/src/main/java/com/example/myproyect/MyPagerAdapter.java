package com.example.myproyect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.squareup.picasso.Picasso;

public class MyPagerAdapter extends PagerAdapter {
    private Context context;
    private OnItemClickListener mListener;
    ImageView imageView;

    public MyPagerAdapter(Context context, OnItemClickListener listener) {
        this.context = context;
        mListener = listener;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.pager_item, null);
        imageView = view.findViewById(R.id.image);
        getImageAt(position);
        container.addView(view);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onItemClick(position);
            }
        });

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object view) {
        container.removeView((View) view);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object == view;
    }

    private void getImageAt(int position) {
        switch (position) {
            case 0:
                imageView.setImageResource(R.drawable.img1);
               break;
            case 1:
                imageView.setImageResource(R.drawable.img2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.img3);
                break;
            case 3:
                imageView.setImageResource(R.drawable.img4);
                break;
            default:
                imageView.setImageResource(R.drawable.img5);
                break;
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}