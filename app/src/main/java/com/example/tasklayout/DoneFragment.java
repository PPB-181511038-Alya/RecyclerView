package com.example.tasklayout;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class DoneFragment extends Fragment {
    int doneColor;
    DoneAdapter doneAdapter;
    ArrayList<DoneItem> doneItems;

    public DoneFragment() {
    }

    @SuppressLint("ValidFragment")
    public DoneFragment(int color) {
        this.doneColor = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.done_fragment, container, false);

        final FrameLayout frameLayout = view.findViewById(R.id.frame_layout_done);
        frameLayout.setBackgroundColor(doneColor);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_done);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        doneItems = new ArrayList<>();
        doneItems.add(new DoneItem("tugas android", "this day"));
        doneItems.add(new DoneItem("rapat BEM", "this day"));

        doneAdapter = new DoneAdapter(doneItems, getContext());
        doneAdapter.setHasStableIds(true);
        recyclerView.setAdapter(doneAdapter);

        return view;
    }
}

