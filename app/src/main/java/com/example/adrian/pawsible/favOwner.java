package com.example.adrian.pawsible;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class favOwner extends Fragment{

    View fav ;

    public favOwner() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        fav = inflater.inflate(R.layout.fav_owners,container,false);
        return fav;
    }
}
