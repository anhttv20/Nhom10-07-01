package com.example.nhom10_07_01.fragmentcafe;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nhom10_07_01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMoka extends Fragment {

    public FragmentMoka() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_moka, container, false);
    }
}
