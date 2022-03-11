package com.periyar.commerce;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment(){
        //req empty pub constructor
    }

    RecyclerView recyclerView;
    List<Model> itemList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //initData();

        recyclerView.setAdapter(new ItemAdapter(initData()));

        return view;
    }

    private List<Model> initData() {
        itemList=new ArrayList<>();
        itemList.add(new Model(R.drawable.b1,"semester 1"));
        itemList.add(new Model(R.drawable.b2,"semester 2"));
        itemList.add(new Model(R.drawable.b3,"semester 3"));
        itemList.add(new Model(R.drawable.b4,"semester 4"));


        return itemList;
    }
}
