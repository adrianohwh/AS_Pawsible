package com.example.adrian.pawsible;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class owner_item extends Fragment {

    View callOwner;
    private RecyclerView recyclerView1;
    private List<Owner> ownerList;

    public owner_item() {
    }

    public void SetOwnerList(List<Owner> ownerList){
        this.ownerList = ownerList;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        callOwner = inflater.inflate(R.layout.all_owners,container,false);
        return callOwner;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
