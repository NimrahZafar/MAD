package com.example.converter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class RVadapter extends RecyclerView.Adapter<RVadapter.RVholder> {

    RecyclerView recyclerView;
    model data[];

    public RVadapter(model[] data ){
        this.data=data;
    }

    public RVadapter() {

    }
    @NonNull
    @Override
    public RVholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.i("check", "onCreateViewHolder: ");
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.model1,parent,false);
        Log.i("check", "onCreateViewHolder:2 ");
        return new RVholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVholder holder, int position) {

        holder.RoomNo.setText(data[position].getRoom_no());
        holder.No_of_beds.setText("No_of_beds: "+data[position].getNo_of_beds());

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class RVholder extends RecyclerView.ViewHolder
    {
        TextView busNo,busModel,comp,type,seats;

        public RVholder(@NonNull View itemView) {
            super(itemView);
            Log.i("check", "RVholder: ");
            RoomNo=((TextView) itemView.findViewById(R.id.Roomdisplay));
            Log.i("check", "RVholder: 2");
           No_of_beds=((TextView) itemView.findViewById(R.id.Bedsdisplay));
       
        }
    }
}
