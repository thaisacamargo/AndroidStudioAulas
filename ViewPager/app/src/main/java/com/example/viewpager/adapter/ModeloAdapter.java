package com.example.viewpager.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.viewpager.model.Modelo;

import java.util.List;

public class ModeloAdapter extends FragmentStatePagerAdapter {


    private List<Modelo> modeloList;

    public ModeloAdapter(FragmentManager fm, List<Modelo> modeloList){
        super(fm);
        this.modeloList = modeloList;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return modeloList.get(position).getNome();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return modeloList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return modeloList.size();
    }
}
