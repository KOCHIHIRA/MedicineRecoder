package com.example.medicinerecoder;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.Viewholder> implements View.OnClickListener {
    private List<Test> DataList;
    ViewAdapter(List<Test> DataList){
        this.DataList = DataList;
    }
    @Override
    public ViewAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_item,parent,false);
        return new Viewholder(view);
    }
    @Override
    public void onBindViewHolder(ViewAdapter.Viewholder holder, final int position) {
        holder.alerm.setOnClickListener(this);
        final int p = position;

        holder.selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("getVIsibility: " + holder.expandable.getVisibility());
                if(holder.expandable.getVisibility() == View.GONE) {
                    
                    holder.expandable.setVisibility(View.VISIBLE);
                } else {
                    holder.expandable.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }

    @Override
    public void onClick(View view) {

    }


    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageButton selected;
        private Button alerm;
        private ConstraintLayout expandable;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            selected = itemView.findViewById(R.id.selected);
            alerm = itemView.findViewById(R.id.alerm);
            expandable = itemView.findViewById(R.id.expandableLayout);
        }
    }


}