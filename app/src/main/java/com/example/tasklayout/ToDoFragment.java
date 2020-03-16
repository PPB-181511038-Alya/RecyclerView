package com.example.tasklayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.ArrayList;


public class ToDoFragment extends Fragment {
    int toDoColor;
    ToDoAdapter toDoAdapter;
    ArrayList<ToDoItem> toDoList;

    public ToDoFragment() {
    }

    @SuppressLint("ValidFragment")
    public ToDoFragment(int color) {
        this.toDoColor = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.to_do_fragment, container, false);

        final FrameLayout frameLayout = view.findViewById(R.id.frame_layout_to_do);
        frameLayout.setBackgroundColor(toDoColor);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_to_do);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        toDoList = new ArrayList<>();
        toDoList.add(new ToDoItem("tugas android", "this day"));
        toDoList.add(new ToDoItem("rapat BEM", "this day"));
        toDoList.add(new ToDoItem("reactjs project", "tomorrow"));
        toDoList.add(new ToDoItem("refactoring project", "2 days left"));
        toDoList.add(new ToDoItem("workshop IT", "6 days left"));
        toDoList.add(new ToDoItem("kumpul himpunan", "6 days left"));

        toDoAdapter = new ToDoAdapter(toDoList, getContext());
        toDoAdapter.setHasStableIds(true);
        recyclerView.setAdapter(toDoAdapter);

        return view;
    }
}

