package com.example.fragmentapps;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    List<Heroes> my_list;
    Context context;

    public CustomAdapter(List<Heroes> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Heroes model = my_list.get(position);
        holder.itemhero_tv_name.setText(model.getNama());
        holder.itemhero_tv_desc.setText(model.getDesc());
        holder.itemhero_iv.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        holder.itemhero_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Implisit.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //intent manja :(
                intent.putExtra("image",model.getImage());
                intent.putExtra("nama",model.getNama());
                intent.putExtra("desc",model.getDesc());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView itemhero_iv;
        TextView itemhero_tv_name, itemhero_tv_desc;
        RelativeLayout itemhero_relative;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemhero_iv = itemView.findViewById(R.id.itemhero_iv);
            itemhero_tv_name = itemView.findViewById(R.id.itemhero_tv_name);
            itemhero_tv_desc = itemView.findViewById(R.id.itemhero_tv_desc);
            itemhero_relative = itemView.findViewById(R.id.itemhero_relative);
        }
    }
}
