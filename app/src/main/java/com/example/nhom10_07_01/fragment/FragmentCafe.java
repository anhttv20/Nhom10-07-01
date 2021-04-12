package com.example.nhom10_07_01.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nhom10_07_01.R;
import com.example.nhom10_07_01.fragmentcafe.FragmentTabAdapter;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCafe extends Fragment {
    private TabLayout tab;
    private ViewPager viewPager;
    private FragmentTabAdapter adapter;
    private View v;

    public FragmentCafe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_cafe, container, false);
        tab=v.findViewById(R.id.tab);
        viewPager=v.findViewById(R.id.viewTab);
        adapter=new FragmentTabAdapter(getChildFragmentManager(),
                FragmentTabAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
        tab.getTabAt(0).setIcon(R.drawable.moka);
        return v;
    }
}
