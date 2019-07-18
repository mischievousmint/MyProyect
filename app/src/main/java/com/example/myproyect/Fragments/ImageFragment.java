package com.example.myproyect.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myproyect.MyPagerAdapter;
import com.example.myproyect.R;

import me.relex.circleindicator.CircleIndicator;


public class ImageFragment extends Fragment implements MyPagerAdapter.OnItemClickListener{

    private CardFragment.OnFragmentInteractionListener mListener;

    public ImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewImage = inflater.inflate(R.layout.fragment_image, container, false);

        ViewPager viewPager = viewImage.findViewById(R.id.view_pager);
        MyPagerAdapter adapter = new MyPagerAdapter(getActivity(), this);
        viewPager.setAdapter(adapter);

        CircleIndicator circleIndicator = viewImage.findViewById(R.id.circle);
        circleIndicator.setViewPager(viewPager);

        return viewImage;
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
    }

}
