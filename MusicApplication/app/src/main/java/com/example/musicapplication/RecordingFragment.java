package com.example.musicapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RecordingFragment extends Fragment {



    View view;
    RecyclerView recyclerView;
    ArrayList arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.library_layout, container, false);


        arrayList=new ArrayList();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");


//
//        recyclerView=view.findViewById(R.id.main_rec);
//
//
//        MainAdapter mainAdapter=new MainAdapter(arrayList);
//        recyclerView.setAdapter(mainAdapter);
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));













    return view;

    }
}