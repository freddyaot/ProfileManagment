package com.engim.alfonso.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.engim.alfonso.myapplication.R;
import com.engim.alfonso.myapplication.models.Rifornimento;

import java.util.ArrayList;

/**
 * Created by Alfonso-LAPTOP on 05/04/2018.
 */

public class ShowDataRecyclerAdapter extends RecyclerView.Adapter<ShowDataRecyclerAdapter.ShowDataViewHolder> {


    private Context ctx;
    private ArrayList<Rifornimento> values;

    public ShowDataRecyclerAdapter(Context ctx, ArrayList<Rifornimento> data){

        this.ctx = ctx;
        this.values = data;
    }


    @Override
    public ShowDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(this.ctx);
        View v = inflater.inflate(R.layout.show_data_list_item,parent,false);
        ShowDataViewHolder holder = new ShowDataViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(ShowDataViewHolder holder, int position) {

        holder.setData(this.values.get(position),position);
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    class ShowDataViewHolder extends RecyclerView.ViewHolder{

        TextView nameText;
        TextView priceText;
        int pos;

        public ShowDataViewHolder(View itemView) {
            super(itemView);

            nameText = itemView.findViewById(R.id.nameBenzinaio);
            priceText = itemView.findViewById(R.id.price);
        }

        public void setData(Rifornimento r, int pos){
            nameText.setText(r.getNomeBenzinaio());
            priceText.setText(String.valueOf(r.getImporto()));
            this.pos = pos;
        }
    }
}
