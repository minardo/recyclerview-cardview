package com.example.ardo.recyclerviewcardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatHolder> {

    Context context;
    List<PolaItem> item;

    public ChatAdapter(Context context, List<PolaItem> item) {
        this.context = context;
        this.item = item;
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_chat_item, null);
        return new ChatHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder holder, int position) {
        holder.txtJudul.setText(item.get(position).getJudul());
        holder.txtDeskripsi.setText(item.get(position).getDeskripsi());
        holder.txtWaktu.setText(item.get(position).getWaktu());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class ChatHolder extends RecyclerView.ViewHolder {

        ImageView imgAvatar;
        TextView txtJudul, txtDeskripsi, txtWaktu;

        public ChatHolder(View itemView) {
            super(itemView);
            imgAvatar = itemView.findViewById(R.id.img_avatar);
            txtJudul = itemView.findViewById(R.id.txt_judul);
            txtDeskripsi = itemView.findViewById(R.id.txt_deskripsi);
            txtWaktu = itemView.findViewById(R.id.txt_waktu);
        }
    }
}
