package com.example.tms_06;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class srAdapter extends RecyclerView.Adapter<srAdapter.ViewHolder>  {

    ArrayList<SrModel> arrayList;
    Context context;

    public srAdapter(ArrayList<SrModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.srlist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SrModel srModel=arrayList.get(position);
        holder.type.setText(srModel.getType());
        holder.desc.setText(srModel.getDescription());
        //  holder.idnum.setText(srModel.getId());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView type,desc,idnum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            type=itemView.findViewById(R.id.txtType);
            desc=itemView.findViewById(R.id.txtDesc);
           // idnum=itemView.findViewById(R.id.txtid);
        }
    }

}