package com.ppal007.recyclerviewwithcardview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ppal007.recyclerviewwithcardview.R;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private String[] countryName;

    public RecyclerViewAdapter(Context context, String[] countryName) {
        this.context = context;
        this.countryName = countryName;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_child_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, final int position) {

        holder.textViewCityName.setText(countryName[position]);

//        add click listener
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "" + countryName[position], Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return countryName.length;
    }

    //    for recycler_child_layout
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewCityName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCityName = itemView.findViewById(R.id.tvCardCity);
        }
    }
}
