package com.example.aplikasi_notes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ItemViewHolder> {


    private ArrayList<item> dataList;

    public itemAdapter(ArrayList<item> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_rv__adapter, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.txt_tgl.setText(dataList.get(position).getTanggal());
        holder.txt_judul.setText(dataList.get(position).getJudul());
        holder.txt_desc.setText(dataList.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_tgl, txt_judul, txt_desc;

        public ItemViewHolder(View itemView) {
            super(itemView);
            txt_tgl = (TextView) itemView.findViewById(R.id.txt_tanggal);
            txt_judul = (TextView) itemView.findViewById(R.id.txt_judul);
            txt_desc = (TextView) itemView.findViewById(R.id.txt_deskripsi);
        }
    }
}