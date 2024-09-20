package com.example.ajkerdeal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RV1_GridViewAdapter_6 extends RecyclerView.Adapter<RV1_GridViewAdapter_6.viewholder> {

    private List<RV1_RecyclerViewItem_6> items;
    private Activity activity;

    public RV1_GridViewAdapter_6(List<RV1_RecyclerViewItem_6> items, Activity activity) {
        this.items = items;
        this.activity = activity;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.grid_custom_layout, parent, false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        holder.imageView.setImageResource(items.get(position).getDrawableId());
        holder.textView.setText(items.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    protected class viewholder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            textView = (TextView)itemView.findViewById(R.id.text);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
