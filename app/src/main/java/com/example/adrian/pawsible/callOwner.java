package com.example.adrian.pawsible;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class callOwner extends Fragment {

    View callOwner;

    public callOwner() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        callOwner = inflater.inflate(R.layout.all_owners,container,false);
        return callOwner;
    }
}
