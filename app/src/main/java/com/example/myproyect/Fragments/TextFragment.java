package com.example.myproyect.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.example.myproyect.R;

import java.util.ArrayList;

public class TextFragment extends Fragment {

    private OnFragmentInteractionListener mListener;



    public TextFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewText = inflater.inflate(R.layout.fragment_text, container, false);

/*
        MyFirebase.init(this);

        rvNotes = viewText.findViewById(R.id.rvNotes);
        etTitle = viewText.findViewById(R.id.etTitle);
        btnSave = viewText.findViewById(R.id.btnSave);

        rvNotes.setLayoutManager(new LinearLayoutManager(getActivity()));

        arrayListEmpty = new ArrayList<>();
        mAdapter = new NotesAdapter(arrayListEmpty);
        rvNotes.setAdapter(mAdapter);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyFirebase.publicarNuevaNoticia(etTitle.getText().toString());
            }
        });
*/


        return viewText;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
