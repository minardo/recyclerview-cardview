package com.example.ardo.recyclerviewcardview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
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
    public void onBindViewHolder(@NonNull ChatHolder holder, final int position) {
        holder.txtJudul.setText(item.get(position).getJudul());
        holder.txtDeskripsi.setText(item.get(position).getDeskripsi());
        holder.txtWaktu.setText(item.get(position).getWaktu());

        holder.cardItemChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailActivity.class);
                i.putExtra("id_judul", item.get(position).getJudul());
                i.putExtra("id_desc", item.get(position).getDeskripsi());
                i.putExtra("id_waktu", item.get(position).getWaktu());
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class ChatHolder extends RecyclerView.ViewHolder {

        CardView cardItemChat;
        ImageView imgAvatar;
        TextView txtJudul, txtDeskripsi, txtWaktu;

        public ChatHolder(View itemView) {
            super(itemView);
            cardItemChat = itemView.findViewById(R.id.carditem_chat);
            imgAvatar = itemView.findViewById(R.id.img_avatar);
            txtJudul = itemView.findViewById(R.id.txt_judul);
            txtDeskripsi = itemView.findViewById(R.id.txt_deskripsi);
            txtWaktu = itemView.findViewById(R.id.txt_waktu);
        }
    }
}
