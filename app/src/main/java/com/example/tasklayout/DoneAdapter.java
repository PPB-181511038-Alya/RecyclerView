package com.example.tasklayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoneAdapter extends RecyclerView.Adapter<DoneAdapter.DoneViewHolder> {

    ArrayList<DoneItem> doneList;
    Context doneContext;

    public DoneAdapter(ArrayList<DoneItem> doneList, Context doneContext) {
        this.doneList = doneList;
        this.doneContext = doneContext;
    }

    @NonNull
    @Override
    public DoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.done_item, parent, false);
        return new DoneViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DoneViewHolder holder, int position) {
        DoneItem doneItem = doneList.get(position);
        holder.doneTask.setText(doneItem.getDoneTask());
        holder.doneSchedule.setText(doneItem.getDoneSchedule());
    }

    @Override
    public int getItemCount() {
        return doneList.size();
    }

    class DoneViewHolder extends RecyclerView.ViewHolder {

        TextView doneTask, doneSchedule;

        public DoneViewHolder(@NonNull View itemView) {
            super(itemView);
            doneTask = itemView.findViewById(R.id.done_task);
            doneSchedule = itemView.findViewById(R.id.done_schedule);
        }
    }
}
