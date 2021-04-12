package com.example.nhom10_07_01.fragmentcafe;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentTabAdapter extends FragmentStatePagerAdapter {
    private int numPage=3;
    public FragmentTabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentMoka();
            case 1: return new FragmentCherry();
            case 2: return new FragmentCuli();
            default: return new FragmentMoka();
        }
    }

    @Override
    public int getCount() {
        return numPage;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Moka";
            case 1:return "Cherry";
            case 2:return "Culi";
            default:return "Moka";
        }
    }
}
